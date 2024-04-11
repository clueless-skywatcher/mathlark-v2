// Generated from LarkFile.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LarkFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LarkFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#lkFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLkFile(LarkFileParser.LkFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(LarkFileParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#functionDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefs(LarkFileParser.FunctionDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(LarkFileParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#actualParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParams(LarkFileParser.ActualParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LarkFileParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(LarkFileParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(LarkFileParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decimal}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(LarkFileParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LarkFileParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Undefined}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndefined(LarkFileParser.UndefinedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(LarkFileParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Character}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(LarkFileParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(LarkFileParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(LarkFileParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictExpr(LarkFileParser.DictExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#mapEntries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntries(LarkFileParser.MapEntriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#mapExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpr(LarkFileParser.MapExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LarkFileParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(LarkFileParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#functionAnonDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAnonDef(LarkFileParser.FunctionAnonDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(LarkFileParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(LarkFileParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LarkFileParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(LarkFileParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(LarkFileParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddOrSub}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSub(LarkFileParser.AddOrSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityCheck}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityCheck(LarkFileParser.EqualityCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(LarkFileParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(LarkFileParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionAnonDefExp}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAnonDefExp(LarkFileParser.FunctionAnonDefExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Access}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess(LarkFileParser.AccessContext ctx);
}