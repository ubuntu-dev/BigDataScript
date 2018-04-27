package org.bds.test;

import org.bds.util.Gpr;
import org.junit.Test;

/**
 * Test cases for "bds --test"
 *
 * Note: These test cases execute all the "test*()" methods in the scripts
 *
 * @author pcingola
 *
 */
public class TestCasesTesting extends TestCasesBase {

	@Test
	public void testTestCases01() {
		Gpr.debug("Test");
		runTestCasesPass("test/test_case_run_01.bds");
	}

	@Test
	public void testTestCases02() {
		Gpr.debug("Test");
		runTestCasesPass("test/test_case_run_02.bds");
	}

}
