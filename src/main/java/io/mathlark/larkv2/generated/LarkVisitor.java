// Generated from Lark.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LarkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LarkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LarkParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LarkParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(LarkParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(LarkParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#actualParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParams(LarkParser.ActualParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(LarkParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LarkParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(LarkParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(LarkParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#functionAnonDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAnonDef(LarkParser.FunctionAnonDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LarkParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(LarkParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#negate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(LarkParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(LarkParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(LarkParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(LarkParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LarkParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(LarkParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LarkParser.ExprContext ctx);
}