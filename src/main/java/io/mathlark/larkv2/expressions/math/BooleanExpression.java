package io.mathlark.larkv2.expressions.math;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class BooleanExpression implements IExpression {
    private Boolean val;

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
        return new BooleanExpression(!this.val);
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
        return toString();
    }

    public String toString() {
        return this.val ? "True" : "False";
    }
    
    public boolean equals(Object other) {
        if (other instanceof BooleanExpression) {
            return this.val == ((IExpression) other).evaluate().val();
        }
        if (other instanceof Boolean) {
            return this.val == other;
        }

        return false;
    }

    @Override
    public IExpression length() {
        return new NumericExpression(0);
    }

}
