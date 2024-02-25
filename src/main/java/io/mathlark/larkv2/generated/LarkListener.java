// Generated from Lark.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LarkParser}.
 */
public interface LarkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LarkParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LarkParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LarkParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(LarkParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(LarkParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(LarkParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(LarkParser.FunctionCallContext ctx);
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
	 * Enter a parse tree produced by {@link LarkParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(LarkParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(LarkParser.FunctionDefContext ctx);
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
	 * Enter a parse tree produced by {@link LarkParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LarkParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LarkParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(LarkParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(LarkParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#negate}.
	 * @param ctx the parse tree
	 */
	void enterNegate(LarkParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#negate}.
	 * @param ctx the parse tree
	 */
	void exitNegate(LarkParser.NegateContext ctx);
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
	 * Enter a parse tree produced by {@link LarkParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LarkParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LarkParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(LarkParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(LarkParser.RelationContext ctx);
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