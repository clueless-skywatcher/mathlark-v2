// Generated from LarkInterpret.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import io.mathlark.larkv2.expressions.*;
import io.mathlark.larkv2.expressions.math.*;
import io.mathlark.larkv2.symbols.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LarkInterpretParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LarkInterpretVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LarkInterpretParser#evaluator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluator(LarkInterpretParser.EvaluatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkInterpretParser#actualParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParams(LarkInterpretParser.ActualParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkInterpretParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(LarkInterpretParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkInterpretParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LarkInterpretParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkInterpretParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(LarkInterpretParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkInterpretParser#functionAnonDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAnonDef(LarkInterpretParser.FunctionAnonDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkInterpretParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(LarkInterpretParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkInterpretParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(LarkInterpretParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkInterpretParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(LarkInterpretParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkInterpretParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LarkInterpretParser.ExprContext ctx);
}