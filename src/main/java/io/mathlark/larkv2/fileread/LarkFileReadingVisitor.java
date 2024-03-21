package io.mathlark.larkv2.fileread;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import java.util.List;
import java.util.ArrayList;

import io.mathlark.larkv2.expressions.DictExpression;
import io.mathlark.larkv2.expressions.FunctionCallExpression;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.general.ExpressionComparison;
import io.mathlark.larkv2.generated.LarkFileBaseVisitor;
import io.mathlark.larkv2.generated.LarkFileParser.*;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.symbols.SymbolScope;

public class LarkFileReadingVisitor extends LarkFileBaseVisitor<IExpression> {
    private SymbolScope scope;
    private Map<String, DefinedFunction> funcs;

    public LarkFileReadingVisitor(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        this.scope = scope;
        this.funcs = new HashMap<>();
    }

    @Override
    public IExpression visitFunctionDefs(FunctionDefsContext ctx) {
        List<String> paramNames = new ArrayList<>();
        for (Token arg: ctx.args) {
            paramNames.add(arg.getText());
        }

        String funcName = String.format("%s%d", ctx.funcName, paramNames.size());
        funcs.put(funcName, new DefinedFunction(funcName, scope, paramNames, ctx.codeBlock()));
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression visitVariable(VariableContext ctx) {
        return scope.resolve(ctx.IDENTIFIER().getText());
    }

    @Override
    public IExpression visitParenthesis(ParenthesisContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public IExpression visitInteger(IntegerContext ctx) {
        return new NumericExpression(Long.parseLong(ctx.getText()));
    }

    @Override
    public IExpression visitDecimal(DecimalContext ctx) {
        return new NumericExpression(Double.parseDouble(ctx.getText()));
    }

    @Override
    public IExpression visitString(StringContext ctx) {
        return new StringExpression(ctx.getText());
    }

    @Override
    public IExpression visitUndefined(UndefinedContext ctx) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression visitBoolean(BooleanContext ctx) {
        String b = ctx.getText();
        return b.equals("True") ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
    }

    @Override
    public IExpression visitAssign(AssignContext ctx) {
        String var = ctx.id.getText();
        IExpression expr = this.visit(ctx.expr()).evaluate();
        scope.assign(var, expr);
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression visitCharacter(CharacterContext ctx) {
        return new StringExpression(ctx.getText());
    }

    @Override
    public IExpression visitDictExpr(DictExprContext ctx) {
        Map<IExpression, IExpression> map = new HashMap<>();
        if (ctx.mapEntries().mapExpr() == null) {
            return new DictExpression(map);
        }
        for (MapExprContext mapExpr: ctx.mapEntries().mapExpr()) {
            IExpression key = this.visit(mapExpr.key).evaluate();
            IExpression value = this.visit(mapExpr.value).evaluate();

            map.put(key, value);
        }

        return new DictExpression(map);
    }

    @Override
    public IExpression visitExponent(ExponentContext ctx) {
        if (ctx.op2 == null) {
            return this.visitUnary(ctx.op1).evaluate();
        }
        return this.visitUnary(ctx.op1).evaluate().pow(this.visitUnary(ctx.op2).evaluate());
    }

    @Override
    public IExpression visitFunctionAnonDef(FunctionAnonDefContext ctx) {
        return super.visitFunctionAnonDef(ctx);
    }

    @Override
    public IExpression visitFunctionCall(FunctionCallContext ctx) {
        String funcName = ctx.IDENTIFIER().getText();
        if (ctx.actualParams() != null) {
            List<IExpression> params = new ArrayList<>();
            for (ExprContext expr: ctx.actualParams().expr()) {
                params.add(this.visit(expr).evaluate());
            }
            return new FunctionCallExpression(funcName, params);
        }
        return new FunctionCallExpression(funcName, List.of());
    }

    @Override
    public IExpression visitFunctionDef(FunctionDefContext ctx) {
        // TODO Auto-generated method stub
        return super.visitFunctionDef(ctx);
    }

    @Override
    public IExpression visitListExpr(ListExprContext ctx) {
        if (ctx.actualParams() != null) {
            List<IExpression> params = new ArrayList<>();
            for (ExprContext expr: ctx.actualParams().expr()) {
                params.add(this.visit(expr).evaluate());
            }
            return new ListExpression(params);
        }
        return new ListExpression(List.of());
    }

    @Override
    public IExpression visitAddOrSub(AddOrSubContext ctx) {
        if (ctx.op == null) {
            return this.visitMultiply(ctx.op1).evaluate();
        }
        else {
            if (ctx.op.getText().equals("+")) {
                return this.visitMultiply(ctx.op1).evaluate().add(this.visitMultiply(ctx.op2).evaluate());
            }
            return this.visitMultiply(ctx.op1).evaluate().sub(this.visitMultiply(ctx.op2).evaluate()); 
        }
    }

    @Override
    public IExpression visitComparison(ComparisonContext ctx) {
        if (ctx.relop == null) {
            return this.visit(ctx.relop1).evaluate();
        }
        else {
            IExpression op1 = this.visit(ctx.relop1).evaluate();
            IExpression op2 = this.visit(ctx.relop2).evaluate();
            if (ctx.relop.getText().equals(">")) {
                return ExpressionComparison.gtExp(op1, op2);
            }
            else if (ctx.relop.getText().equals(">=")) {
                return ExpressionComparison.gteExp(op1, op2);
            }
            else if (ctx.relop.getText().equals("<")) {
                return ExpressionComparison.ltExp(op1, op2);
            }
            return ExpressionComparison.lteExp(op1, op2);
        }
    }

    @Override
    public IExpression visitEqualityCheck(EqualityCheckContext ctx) {
        if (ctx.relop == null) {
            return this.visit(ctx.relop1).evaluate();
        }
        else {
            IExpression op1 = this.visit(ctx.relop1).evaluate();
            IExpression op2 = this.visit(ctx.relop2).evaluate();
            if (ctx.relop.getText().equals("==")) {
                return ExpressionComparison.equalsExp(op1, op2);
            }
            return ExpressionComparison.notEqualsExp(op1, op2);
        }
    }

    @Override
    public IExpression visitMultiply(MultiplyContext ctx) {
        if (ctx.op == null) {
            return this.visit(ctx.op1);
        }
        else {
            if (ctx.op.getText().equals("*")) {
                return this.visitExponent(ctx.op1).mul(this.visitExponent(ctx.op2));
            }
            else if (ctx.op.getText().equals("/")) {
                return this.visitExponent(ctx.op1).div(this.visitExponent(ctx.op2));
            }
            return this.visitExponent(ctx.op1).mod(this.visitExponent(ctx.op2));
        }
    }

    @Override
    public IExpression visitReturnStmt(ReturnStmtContext ctx) {
        return super.visitReturnStmt(ctx);
    }

    @Override
    public IExpression visitUnary(UnaryContext ctx) {
        IExpression exprObject = this.visit(ctx.term());
        if (!ctx.positive) {
            exprObject = exprObject.negate();
        }

        return exprObject;
    }

}
