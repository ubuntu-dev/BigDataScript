package org.bds.vm;

/**
 * The opcodes are stored into an array of Integers
 *
 * This is a stack machine, so operands act on the element/s of the stack
 * e.g. ADDI    # pop the last two items in the stack, add them and push the result to the stack
 *
 * Notes:
 *     Literal always reference the pool of constants: bool, int, real, string or function
 *
 * Nomenclature:
 *     funcName : An integer referencing a string (the function's name) in the pool of constants
 *     literal  : An integer referencing a literal (bool|int|real|string) in the pool of constants
 *     pc       : Program counter (new position to jump to)
 *     varName  : An integer referencing a string (the variable's name) in the pool of constants
 *
 * @author pcingola
 */
public enum OpCode {
	// Addition (int, real, string)
	ADDI, ADDR, ADDS
	// And: bool (logic), int (bitwise)
	, ANDB, ANDI
	// Cast values {b,i,r} => {b,i,r}
	, CAST_BTOI, CAST_BTOR, CAST_ITOB, CAST_ITOR, CAST_RTOB, CAST_RTOI
	// Function call:
	//    CALL function_signature
	//    CALLNATIVE function_signature
	, CALL, CALLNATIVE
	// Decrement (i.e. valueInt--)
	, DEC
	// Division
	, DIVI, DIVR
	// Equality test
	, EQB, EQI, EQR, EQS
	// Greater or equal than
	, GEB, GEI, GER, GES
	// Greater than
	, GTB, GTI, GTR, GTS
	// Halt (stop execution in current thread)
	, HALT
	// Increment (i.e. valueInt++)
	, INC
	// Jumps: unconditional, jump if true, jump if false:
	//    JMP[T|F]    pc
	, JMP, JMPT, JMPF
	// Load variable from scope into stack
	//    LOAD varName
	, LOAD
	// Less than
	, LTB, LTI, LTR, LTS
	// Less or equal than
	, LEB, LEI, LER, LES
	// Modulo (int)
	, MODI
	// Multiplication (int)
	, MULI, MULR
	// Set current BdsNode number. Used for references to bds code (debugging, stack trace, etc.)
	, NODE
	// No operation
	, NOOP
	// Equality test (not equals)
	, NEB, NEI, NER, NES
	// Create new object (of type 'Type') and push it to the stack
	//    NEW Type
	, NEW
	// Negation
	, NOTB, NOTI
	// OR: bool (logical), int (bitwise)
	, ORB, ORI
	// Pop: remove latest element from stack
	, POP
	// Print
	, PRINT, PRINTLN
	// Push literal
	//    PUSHNULL                 # Pushes a 'null' literal
	//    PUSH{B|I|R|S}  literal   # Pushes a literal constant into the stack
	, PUSHB, PUSHI, PUSHR, PUSHS
	// Reference: object's field, list index or hash key
	, REFFIELD, REFLIST, REFMAP
	// Return (from function)
	, RET
	// Scope: create new scope (and push it), restore old scope (pop current scope)
	, SCOPEPUSH, SCOPEPOP
	// Set value
	, SET, SETFIELD, SETLIST, SETMAP
	// Store variable to local scope
	//    STORE varName
	, STORE
	// Subtraction
	, SUBI, SUBR
	// XOR
	, XORB, XORI
	//
	;

	/**
	 * Number of parameters associated with this operand
	 */
	public boolean hasParam() {
		switch (this) {
		case CALL:
		case CALLNATIVE:
		case JMP:
		case JMPT:
		case JMPF:
		case LOAD:
		case NEW:
		case NODE:
		case PUSHB:
		case PUSHI:
		case PUSHR:
		case PUSHS:
		case STORE:
			return true;

		default:
			return false;
		}
	}

	/**
	 * Is the parameter a 'type'?
	 */
	public boolean hasParamType() {
		return this == NEW;
	}

	public boolean isParamString() {
		switch (this) {
		case CALL:
		case CALLNATIVE:
		case JMP:
		case JMPT:
		case JMPF:
		case LOAD:
		case NEW:
		case PUSHS:
		case STORE:
			return true;

		default:
			return false;
		}
	}
}