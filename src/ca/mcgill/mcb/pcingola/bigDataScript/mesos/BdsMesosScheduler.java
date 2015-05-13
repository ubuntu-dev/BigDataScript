package ca.mcgill.mcb.pcingola.bigDataScript.mesos;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.mesos.Protos.ExecutorID;
import org.apache.mesos.Protos.ExecutorInfo;
import org.apache.mesos.Protos.FrameworkID;
import org.apache.mesos.Protos.MasterInfo;
import org.apache.mesos.Protos.Offer;
import org.apache.mesos.Protos.OfferID;
import org.apache.mesos.Protos.Resource;
import org.apache.mesos.Protos.SlaveID;
import org.apache.mesos.Protos.TaskID;
import org.apache.mesos.Protos.TaskInfo;
import org.apache.mesos.Protos.TaskStatus;
import org.apache.mesos.Protos.Value;
import org.apache.mesos.Scheduler;
import org.apache.mesos.SchedulerDriver;

import ca.mcgill.mcb.pcingola.bigDataScript.executioner.ExecutionerLocal;
import ca.mcgill.mcb.pcingola.bigDataScript.executioner.ExecutionerMesos;
import ca.mcgill.mcb.pcingola.bigDataScript.task.Task;
import ca.mcgill.mcb.pcingola.bigDataScript.task.TaskState;
import ca.mcgill.mcb.pcingola.bigDataScript.util.Gpr;

import com.google.protobuf.ByteString;

/**
 * BDS scheduler for Mesos
 *
 * @author pcingola
 */
public class BdsMesosScheduler implements Scheduler {

	static final long MB = 1024 * 1024;

	public static boolean debug = true;

	private final ExecutorInfo executor;
	List<Task> taskToLaunch;
	HashMap<String, Task> taskById;
	ExecutionerMesos executionerMesos;

	public BdsMesosScheduler(ExecutionerMesos executionerMesos, ExecutorInfo executor) {
		this.executionerMesos = executionerMesos;
		this.executor = executor;
		taskToLaunch = new LinkedList<Task>();
		taskById = new HashMap<String, Task>();
	}

	/**
	 * Add a task to be launched
	 * @param task
	 */
	public void add(Task task) {
		taskToLaunch.add(task);
	}

	/**
	 * Invoked when the scheduler becomes "disconnected" from the master
	 * (e.g., the master fails and another is taking over).
	 */
	@Override
	public void disconnected(SchedulerDriver driver) {
		if (debug) Gpr.debug("Scheduler: Disconnected");
	}

	/**
	 * Invoked when there is an unrecoverable error in the scheduler or
	 * scheduler driver. The driver will be aborted BEFORE invoking this
	 * callback.
	 */
	@Override
	public void error(SchedulerDriver driver, String message) {
		if (debug) Gpr.debug("Scheduler: Error '" + message + "'");
	}

	/**
	 * Invoked when an executor has exited/terminated. Note that any
	 * tasks running will have TASK_LOST status updates automagically
	 * generated.
	 */
	@Override
	public void executorLost(SchedulerDriver driver, ExecutorID executorId, SlaveID slaveId, int status) {
		if (debug) Gpr.debug("Scheduler: Executor lost " + executorId.getValue());
	}

	/**
	 * Invoked when an executor sends a message. These messages are best
	 * effort; do not expect a framework message to be retransmitted in
	 * any reliable fashion.
	 */
	@Override
	public void frameworkMessage(SchedulerDriver driver, ExecutorID executorId, SlaveID slaveId, byte[] data) {
		if (debug) Gpr.debug("Scheduler: Framework message" //
				+ "\n\tExecutorId : " + executorId.getValue() //
				+ "\n\tSlaveId    : " + slaveId.getValue() //
				+ "\n\tMesssage   : '" + new String(data) + "'" //
		);
	}

	/**
	 * Invoked when an offer is no longer valid (e.g., the slave was
	 * lost or another framework used resources in the offer). If for
	 * whatever reason an offer is never rescinded (e.g., dropped
	 * message, failing over framework, etc.), a framwork that attempts
	 * to launch tasks using an invalid offer will receive TASK_LOST
	 * status updats for those tasks (see Scheduler::resourceOffers).
	 */
	@Override
	public void offerRescinded(SchedulerDriver driver, OfferID offerId) {
		if (debug) Gpr.debug("Scheduler: Offer Rescinded " + offerId.getValue());
	}

	/**
	 * Invoked when the scheduler successfully registers with a Mesos
	 * master. A unique ID (generated by the master) used for
	 * distinguishing this framework from others and MasterInfo
	 * with the ip and port of the current master are provided as arguments.
	 */
	@Override
	public void registered(SchedulerDriver driver, FrameworkID frameworkId, MasterInfo masterInfo) {
		if (debug) Gpr.debug("Scheduler: Registered framework " + frameworkId.getValue() + ", master " + masterInfo.getHostname());
	}

	/**
	 * Invoked when the scheduler re-registers with a newly elected Mesos master.
	 * This is only called when the scheduler has previously been registered.
	 * MasterInfo containing the updated information about the elected master
	 * is provided as an argument.
	 */
	@Override
	public void reregistered(SchedulerDriver driver, MasterInfo masterInfo) {
		if (debug) Gpr.debug("Scheduler: Re-Registered " + masterInfo.getHostname());
	}

	/**
	 * Invoked when resources have been offered to this framework. A
	 * single offer will only contain resources from a single slave.
	 * Resources associated with an offer will not be re-offered to
	 * _this_ framework until either (a) this framework has rejected
	 * those resources (see SchedulerDriver::launchTasks) or (b) those
	 * resources have been rescinded (see Scheduler::offerRescinded).
	 * Note that resources may be concurrently offered to more than one
	 * framework at a time (depending on the allocator being used). In
	 * that case, the first framework to launch tasks using those
	 * resources will be able to use them while the other frameworks
	 * will have those resources rescinded (or if a framework has
	 * already launched tasks with those resources then those tasks will
	 * fail with a TASK_LOST status and a message saying as much).
	 */
	@Override
	public void resourceOffers(SchedulerDriver driver, List<Offer> offers) {
		if (debug) Gpr.debug("Scheduler: Resource Offers");
		Collection<TaskInfo> taskInfos = new ArrayList<TaskInfo>();
		Collection<OfferID> offerIds = new ArrayList<OfferID>();

		// TODO: Match offers with tasks by taking into account the number of resources requested
		//		 Note that when invoking driver.launchTasks() all offers must belong to same slave

		for (Offer offer : offers) {
			// TODO: Match a task with this particular offer
			//       Use the the offer that matches 'best' a task
			//       In case of multiple matches, the 'first' offer / first 'task' wins

			if (debug) Gpr.debug("\t\t" + offer.getHostname());

			offerIds.add(offer.getId());

			// Should we launch a task?
			if (!taskToLaunch.isEmpty()) {
				// Get first task in the queue
				Task task = taskToLaunch.remove(0); // TODO: We should not remove it completely until we are sure that it was started by Mesos (stateChange)
				taskById.put(task.getId(), task);

				// Assign a task ID and name
				TaskID taskId = TaskID.newBuilder().setValue(task.getId()).build();
				String taskName = task.getName();
				System.out.println("Launching task " + taskId.getValue());

				// Resources
				int numCpus = task.getResources().getCpus() > 0 ? task.getResources().getCpus() : 1;
				Resource cpus = Resource.newBuilder().setName("cpus").setType(Value.Type.SCALAR).setScalar(Value.Scalar.newBuilder().setValue(numCpus)).build(); // Number of CPUS

				long memSize = (task.getResources().getMem() / MB) > 0 ? task.getResources().getMem() : 64;
				Resource mem = Resource.newBuilder().setName("mem").setType(Value.Type.SCALAR).setScalar(Value.Scalar.newBuilder().setValue(memSize)).build(); // Memory in MB

				// Executor
				ExecutorInfo execInfo = ExecutorInfo.newBuilder(executor).build();

				// Task's data: Command to execute
				String cmdArgs[] = ExecutionerLocal.createBdsExecCmdArgs(task);
				ByteString data = ByteString.copyFromUtf8(BdsMesosFramework.packArray(cmdArgs));

				// Create task
				TaskInfo taskInfo = TaskInfo.newBuilder() //
						.setName(taskName)//
						.setTaskId(taskId) //
						.setSlaveId(offer.getSlaveId()) //
						.addResources(cpus) //
						.addResources(mem) //
						.setExecutor(execInfo) //
						.setData(data) //
						.build();

				// Add task to response
				taskInfos.add(taskInfo);

				// Mark task as started
				executionerMesos.taskStarted(task);
			}

		}

		// Filters filters = Filters.newBuilder().setRefuseSeconds(1).build();
		// driver.launchTasks(offer.getId(), taskInfos, filters);

		driver.launchTasks(offerIds, taskInfos);
	}

	/**
	 * Invoked when a slave has been determined unreachable (e.g.,
	 * machine failure, network partition). Most frameworks will need to
	 * reschedule any tasks launched on this slave on a new slave.
	 */
	@Override
	public void slaveLost(SchedulerDriver driver, SlaveID slaveId) {
		if (debug) Gpr.debug("Scheduler: Slave Lost " + slaveId.getValue());
	}

	/**
	 * Invoked when the status of a task has changed (e.g., a slave is
	 * lost and so the task is lost, a task finishes and an executor
	 * sends a status update saying so, etc). Note that returning from
	 * this callback _acknowledges_ receipt of this status update! If
	 * for whatever reason the scheduler aborts during this callback (or
	 * the process exits) another status update will be delivered (note,
	 * however, that this is currently not true if the slave sending the
	 * status update is lost/fails during that time).
	 */
	@Override
	public void statusUpdate(SchedulerDriver driver, TaskStatus status) {
		String taskId = status.getTaskId().getValue();
		if (debug) Gpr.debug("Scheduler: Status update, task " + taskId + ", state " + status.getState());

		// Find task
		Task task = taskById.get(taskId);
		if (task == null) throw new RuntimeException("task ID '" + taskId + "' not found. This should never happen!");

		// Update state
		switch (status.getState()) {
		case TASK_RUNNING:
			executionerMesos.taskRunning(task);
			break;

		case TASK_FINISHED:
			executionerMesos.taskFinished(task, TaskState.FINISHED);
			break;

		case TASK_FAILED:
			executionerMesos.taskFinished(task, TaskState.ERROR);
			break;

		case TASK_KILLED:
		case TASK_LOST:
			executionerMesos.taskFinished(task, TaskState.KILLED);
			break;

		default:
			Gpr.debug("Unhandled Mesos task state: " + status.getState());
		}
	}
}
