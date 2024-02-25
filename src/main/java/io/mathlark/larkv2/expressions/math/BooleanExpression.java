package io.mathlark.larkv2.expressions.math;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class BooleanExpression implements IExpression {
    private boolean val;

    public BooleanExpression(boolean bool) {
        this.val = bool;
    }

    public BooleanExpression(String bool) {
        this.val = bool.equals("True");
    }

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return String.format("Boolean(%s)", toString());
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
        return new StringExpression("Boolean");
    }

    @Override
    public Object val() {
        return this.val;
    }

    public String toString() {
        return this.val ? "True" : "False";
    }
    
}
