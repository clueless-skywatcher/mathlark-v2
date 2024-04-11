// Generated from LarkFile.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LarkFileParser}.
 */
public interface LarkFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#lkFile}.
	 * @param ctx the parse tree
	 */
	void enterLkFile(LarkFileParser.LkFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#lkFile}.
	 * @param ctx the parse tree
	 */
	void exitLkFile(LarkFileParser.LkFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(LarkFileParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(LarkFileParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#functionDefs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefs(LarkFileParser.FunctionDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#functionDefs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefs(LarkFileParser.FunctionDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(LarkFileParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(LarkFileParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void enterActualParams(LarkFileParser.ActualParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void exitActualParams(LarkFileParser.ActualParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LarkFileParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LarkFileParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(LarkFileParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(LarkFileParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterInteger(LarkFileParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitInteger(LarkFileParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decimal}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(LarkFileParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decimal}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(LarkFileParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterString(LarkFileParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitString(LarkFileParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Undefined}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterUndefined(LarkFileParser.UndefinedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Undefined}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitUndefined(LarkFileParser.UndefinedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(LarkFileParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(LarkFileParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Character}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(LarkFileParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Character}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(LarkFileParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(LarkFileParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(LarkFileParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(LarkFileParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(LarkFileParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDictExpr(LarkFileParser.DictExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link LarkFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDictExpr(LarkFileParser.DictExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#mapEntries}.
	 * @param ctx the parse tree
	 */
	void enterMapEntries(LarkFileParser.MapEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#mapEntries}.
	 * @param ctx the parse tree
	 */
	void exitMapEntries(LarkFileParser.MapEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#mapExpr}.
	 * @param ctx the parse tree
	 */
	void enterMapExpr(LarkFileParser.MapExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#mapExpr}.
	 * @param ctx the parse tree
	 */
	void exitMapExpr(LarkFileParser.MapExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LarkFileParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LarkFileParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(LarkFileParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(LarkFileParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#functionAnonDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAnonDef(LarkFileParser.FunctionAnonDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#functionAnonDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAnonDef(LarkFileParser.FunctionAnonDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(LarkFileParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(LarkFileParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(LarkFileParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(LarkFileParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LarkFileParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(LarkFileParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LarkFileParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(LarkFileParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(LarkFileParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(LarkFileParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddOrSub}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSub(LarkFileParser.AddOrSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddOrSub}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSub(LarkFileParser.AddOrSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityCheck}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityCheck(LarkFileParser.EqualityCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityCheck}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityCheck(LarkFileParser.EqualityCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(LarkFileParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(LarkFileParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparison(LarkFileParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparison(LarkFileParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionAnonDefExp}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAnonDefExp(LarkFileParser.FunctionAnonDefExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionAnonDefExp}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAnonDefExp(LarkFileParser.FunctionAnonDefExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Access}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAccess(LarkFileParser.AccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Access}
	 * labeled alternative in {@link LarkFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAccess(LarkFileParser.AccessContext ctx);
}