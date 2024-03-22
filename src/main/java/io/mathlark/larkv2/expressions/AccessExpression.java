package io.mathlark.larkv2.expressions;

import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.utils.FunctionUtils;
import lombok.Getter;

public class AccessExpression implements IExpression {
    private IExpression expr;
    private IExpression accExpr;
    private @Getter Object val;

    public AccessExpression(IExpression expr, IExpression accExpr) {
        this.expr = expr;
        this.accExpr = accExpr;
    }

    @Override
    public IExpression evaluate() {
        if (!(FunctionUtils.isInstanceOf(expr, ListExpression.class) 
            || FunctionUtils.isInstanceOf(expr, DictExpression.class))) {
            System.out.println("Cannot access a non-iterable expression");
            return GlobalSymbols.UNDEFINED;
        }
        if (FunctionUtils.isInstanceOf(expr, DictExpression.class)) {
            return ((DictExpression) expr.evaluate()).getValue(accExpr);
        }
        return ((ListExpression) expr.evaluate()).elementAt((NumericExpression) accExpr.evaluate());
    }

    @Override
    public String inputForm() {
        return String.format("%s[%s]", expr.toString(), accExpr.toString());
    }

    @Override
    public IExpression add(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression sub(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression mul(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression negate() {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression pow(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression div(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression mod(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public StringExpression head() {
        return new StringExpression("Access");
    }

    @Override
    public Object val() {
        return null;
    }

    @Override
    public IExpression length() {
        return new NumericExpression(0);
    }    
}