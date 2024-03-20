// Generated from Lark.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import lombok.Getter;

import io.mathlark.larkv2.expressions.*;
import io.mathlark.larkv2.expressions.math.*;
import io.mathlark.larkv2.symbols.*;
import io.mathlark.larkv2.UniversalFunctionRegistry;
import io.mathlark.larkv2.general.ExpressionComparison;



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
	 * Visit a parse tree produced by {@link LarkParser#lkFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLkFile(LarkParser.LkFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(LarkParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#functionDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefs(LarkParser.FunctionDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(LarkParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#evaluator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluator(LarkParser.EvaluatorContext ctx);
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
	 * Visit a parse tree produced by {@link LarkParser#mapEntries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntries(LarkParser.MapEntriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkParser#mapExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpr(LarkParser.MapExprContext ctx);
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
	 * Visit a parse tree produced by {@link LarkParser#functionAnonDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAnonDef(LarkParser.FunctionAnonDefContext ctx);
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
	 * Visit a parse tree produced by {@link LarkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LarkParser.ExprContext ctx);
}