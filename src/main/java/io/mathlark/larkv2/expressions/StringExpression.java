package io.mathlark.larkv2.expressions;

import io.mathlark.larkv2.symbols.GlobalSymbols;
import lombok.Getter;

public class StringExpression implements IExpression {
    private @Getter String val;    
    
    public StringExpression(String val) {
        this.val = val;
    }

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return String.format("\"%s\"", toString());
    }

    public String toString() {
        return getVal();
    }

    @Override
    public IExpression add(IExpression other) {
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
    public IExpression sub(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public StringExpression head() {
        return new StringExpression("String");
    }

    @Override
    public Object val() {
        return toString();
    }

    public boolean equals(Object other) {
        if (other instanceof IExpression) {
            return this.val.equals(((StringExpression) other).evaluate().val());
        }
        if (other instanceof String) {
            return this.val.equals((String) other);
        }
        
        return false;
    }

    @Override
    public IExpression length() {
        return GlobalSymbols.ZERO;
    }

    public int hashCode() {
        return this.val.hashCode();
    }
}
