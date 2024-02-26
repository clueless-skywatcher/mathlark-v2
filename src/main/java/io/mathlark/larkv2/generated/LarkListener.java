// Generated from Lark.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import lombok.Getter;

import io.mathlark.larkv2.expressions.*;
import io.mathlark.larkv2.expressions.math.*;
import io.mathlark.larkv2.symbols.*;
import io.mathlark.larkv2.UniversalFunctionRegistry;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LarkParser}.
 */
public interface LarkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LarkParser#evaluator}.
	 * @param ctx the parse tree
	 */
	void enterEvaluator(LarkParser.EvaluatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#evaluator}.
	 * @param ctx the parse tree
	 */
	void exitEvaluator(LarkParser.EvaluatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void enterActualParams(LarkParser.ActualParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void exitActualParams(LarkParser.ActualParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LarkParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LarkParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#mapEntries}.
	 * @param ctx the parse tree
	 */
	void enterMapEntries(LarkParser.MapEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#mapEntries}.
	 * @param ctx the parse tree
	 */
	void exitMapEntries(LarkParser.MapEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#mapExpr}.
	 * @param ctx the parse tree
	 */
	void enterMapExpr(LarkParser.MapExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#mapExpr}.
	 * @param ctx the parse tree
	 */
	void exitMapExpr(LarkParser.MapExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LarkParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LarkParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(LarkParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(LarkParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#functionAnonDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAnonDef(LarkParser.FunctionAnonDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#functionAnonDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAnonDef(LarkParser.FunctionAnonDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(LarkParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(LarkParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(LarkParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(LarkParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(LarkParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(LarkParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LarkParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LarkParser.ExprContext ctx);
}