package io.mathlark.larkv2.expressions;

import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class UndefinedExpression implements IExpression {

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return toString();
    }

    public String toString() {
        return "Undefined";
    }

    @Override
    public IExpression add(IExpression other) {
        return this;
    }

    @Override
    public IExpression mul(IExpression other) {
        return this;
    }

    @Override
    public IExpression negate() {
        return this;
    }

    @Override
    public IExpression pow(IExpression other) {
        return this;
    }

    @Override
    public IExpression div(IExpression other) {
        return this;
    }

    @Override
    public IExpression mod(IExpression other) {
        return this;
    }

    @Override
    public IExpression sub(IExpression other) {
        return this;
    }

    @Override
    public StringExpression head() {
        return new StringExpression("Undefined");
    }

    @Override
    public Object val() {
        return "Undefined";
    }

    @Override
    public IExpression length() {
        return GlobalSymbols.ZERO;
    }
}
