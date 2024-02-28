package io.mathlark.larkv2.expressions;

import io.mathlark.larkv2.symbols.GlobalSymbols;
import lombok.Getter;

public class AnonFunctionExpression implements IExpression {
    private @Getter String name;

    public AnonFunctionExpression(String name) {
        this.name = name;
    }

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return name;
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
        return new StringExpression("AnonFunc");
    }

    @Override
    public Object val() {
        return getName();
    }

    @Override
    public IExpression length() {
        return GlobalSymbols.ZERO;
    }
    
}
