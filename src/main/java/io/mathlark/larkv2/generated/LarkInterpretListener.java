// Generated from LarkInterpret.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import io.mathlark.larkv2.expressions.*;
import io.mathlark.larkv2.expressions.math.*;
import io.mathlark.larkv2.symbols.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LarkInterpretParser}.
 */
public interface LarkInterpretListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LarkInterpretParser#evaluator}.
	 * @param ctx the parse tree
	 */
	void enterEvaluator(LarkInterpretParser.EvaluatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkInterpretParser#evaluator}.
	 * @param ctx the parse tree
	 */
	void exitEvaluator(LarkInterpretParser.EvaluatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkInterpretParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void enterActualParams(LarkInterpretParser.ActualParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkInterpretParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void exitActualParams(LarkInterpretParser.ActualParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkInterpretParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LarkInterpretParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkInterpretParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LarkInterpretParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkInterpretParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LarkInterpretParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkInterpretParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LarkInterpretParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkInterpretParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(LarkInterpretParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkInterpretParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(LarkInterpretParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkInterpretParser#functionAnonDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAnonDef(LarkInterpretParser.FunctionAnonDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkInterpretParser#functionAnonDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAnonDef(LarkInterpretParser.FunctionAnonDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkInterpretParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(LarkInterpretParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkInterpretParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(LarkInterpretParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkInterpretParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(LarkInterpretParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkInterpretParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(LarkInterpretParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkInterpretParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(LarkInterpretParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkInterpretParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(LarkInterpretParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkInterpretParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LarkInterpretParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkInterpretParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LarkInterpretParser.ExprContext ctx);
}