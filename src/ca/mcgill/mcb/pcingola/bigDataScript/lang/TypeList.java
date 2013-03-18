package ca.mcgill.mcb.pcingola.bigDataScript.lang;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import ca.mcgill.mcb.pcingola.bigDataScript.lang.nativeMethods.MethodNative;
import ca.mcgill.mcb.pcingola.bigDataScript.lang.nativeMethods.list.MethodNativeListAdd;
import ca.mcgill.mcb.pcingola.bigDataScript.lang.nativeMethods.list.MethodNativeListHead;
import ca.mcgill.mcb.pcingola.bigDataScript.lang.nativeMethods.list.MethodNativeListPop;
import ca.mcgill.mcb.pcingola.bigDataScript.lang.nativeMethods.list.MethodNativeListPush;
import ca.mcgill.mcb.pcingola.bigDataScript.lang.nativeMethods.list.MethodNativeListSize;
import ca.mcgill.mcb.pcingola.bigDataScript.lang.nativeMethods.list.MethodNativeListSort;
import ca.mcgill.mcb.pcingola.bigDataScript.lang.nativeMethods.list.MethodNativeListTail;
import ca.mcgill.mcb.pcingola.bigDataScript.scope.Scope;
import ca.mcgill.mcb.pcingola.bigDataScript.util.Gpr;

/**
 * A list/array/stack type
 * 
 * @author pcingola
 */
public class TypeList extends Type {

	public static boolean debug = false;

	Type baseType; // Base type for this list

	/**
	 * Get a list type
	 * @param primitiveType
	 * @param typeName
	 * @return
	 */
	public static TypeList get(Type baseType) {
		// Get type from hash
		String key = PrimitiveType.LIST + ":" + baseType;
		TypeList type = (TypeList) types.get(key);

		// No type available? Create & add
		if (type == null) {
			type = new TypeList(null, null);
			type.primitiveType = PrimitiveType.LIST;
			type.baseType = baseType;
			put(type);

			type.addNativeMethods();
		}

		return type;
	}

	protected static void put(TypeList type) {
		// Get type from hash
		String key = PrimitiveType.LIST + ":" + type.baseType;
		types.put(key, type);
	}

	public TypeList(BigDataScriptNode parent, ParseTree tree) {
		super(parent, tree);
	}

	/**
	 * Add all library methods here
	 */
	protected void addNativeMethods() {
		if (classScope == null) classScope = new Scope(null);

		// Add libarary methods
		ArrayList<MethodNative> methods = new ArrayList<MethodNative>();
		methods.add(new MethodNativeListAdd(baseType));
		methods.add(new MethodNativeListHead(baseType));
		methods.add(new MethodNativeListPop(baseType));
		methods.add(new MethodNativeListPush(baseType));
		methods.add(new MethodNativeListSize(baseType));
		methods.add(new MethodNativeListSort(baseType));
		methods.add(new MethodNativeListTail(baseType));

		// Show
		if (debug) {
			Gpr.debug("Type " + this + ", library methods added: ");
			for (MethodNative method : methods)
				Gpr.debug("\t" + method.signature());
		}
	}

	public boolean canCast(TypeList type) {
		throw new RuntimeException("Unimplemented!");
	}

	@Override
	public int compareTo(Type type) {
		int cmp = primitiveType.ordinal() - type.primitiveType.ordinal();
		if (cmp != 0) return cmp;

		TypeList ltype = (TypeList) type;
		return baseType.compareTo(ltype.baseType);
	}

	@Override
	public boolean equals(Type type) {
		return (primitiveType == type.primitiveType) && (baseType.equals(((TypeList) type).baseType));
	}

	public Type getBaseType() {
		return baseType;
	}

	@Override
	public boolean isList() {
		return true;
	}

	@Override
	public boolean isList(Type baseType) {
		return this.baseType.equals(baseType);
	}

	@Override
	public boolean isPrimitiveType() {
		return false;
	}

	@Override
	protected void parse(ParseTree tree) {
		// TODO: We are only allowing to build lists of primitive types. We should change this!
		String listTypeName = tree.getChild(0).getChild(0).getText();
		primitiveType = PrimitiveType.LIST;
		baseType = Type.get(listTypeName.toUpperCase());

		put(this);
		addNativeMethods();
	}

	@Override
	public String toString() {
		return baseType + "[]";
	}

	@Override
	public String toStringSerializer() {
		return primitiveType + ":" + baseType.toStringSerializer();
	}

}