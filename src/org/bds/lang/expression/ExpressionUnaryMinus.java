package org.bds.lang.expression;

import org.antlr.v4.runtime.tree.ParseTree;
import org.bds.compile.CompilerMessage.MessageType;
import org.bds.compile.CompilerMessages;
import org.bds.lang.BdsNode;
import org.bds.lang.type.Type;
import org.bds.lang.type.Types;
import org.bds.run.BdsThread;
import org.bds.symbol.SymbolTable;

/**
 * A arithmetic negation
 *
 * @author pcingola
 */
public class ExpressionUnaryMinus extends ExpressionUnary {

	public ExpressionUnaryMinus(BdsNode parent, ParseTree tree) {
		super(parent, tree);
		op = "-";
	}

	@Override
	public Type returnType(SymbolTable symtab) {
		if (returnType != null) return returnType;

		expr.returnType(symtab);

		if (expr.canCastToInt()) returnType = Types.INT;
		else if (expr.canCastToReal()) returnType = Types.REAL;
		else return null; // Cannot cast to 'int' or 'real'. This should never happen!"

		return returnType;
	}

	/**
	 * Evaluate an expression
	 */
	@Override
	public void runStep(BdsThread bdsThread) {
		bdsThread.run(expr);
		if (bdsThread.isCheckpointRecover()) return;

		if (returnType == Types.INT) {
			bdsThread.push(-bdsThread.popInt());
		} else if (returnType == Types.REAL) {
			bdsThread.push(-bdsThread.popReal());
		} else throw new RuntimeException("Cannot cast to 'int' or 'real'. This should never happen!");
	}

	@Override
	public void typeCheckNotNull(SymbolTable symtab, CompilerMessages compilerMessages) {
		// Can we transform to an int?
		if (!expr.canCastToInt() && !expr.canCastToReal()) compilerMessages.add(this, "Cannot cast expression to int or real", MessageType.ERROR);
	}

}
