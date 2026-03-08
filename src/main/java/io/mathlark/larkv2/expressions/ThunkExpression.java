package io.mathlark.larkv2.expressions;

import java.util.function.Supplier;

public class ThunkExpression implements IExpression {
    private Supplier<IExpression> supplier;
    private IExpression cached;

    public ThunkExpression(Supplier<IExpression> supplier) {
        this.supplier = supplier;
    }

    @Override
    public IExpression evaluate() {
        if (cached == null) {
            cached = supplier.get();
        }
        return cached;
    }

    @Override
    public IExpression add(IExpression other) {
        return evaluate().add(other);
    }

    @Override
    public IExpression sub(IExpression other) {
        return evaluate().sub(other);
    }

    @Override
    public IExpression mul(IExpression other) {
        return evaluate().mul(other);
    }

    @Override
    public IExpression div(IExpression other) {
        return evaluate().div(other);
    }

    @Override
    public IExpression mod(IExpression other) {
        return evaluate().mod(other);
    }

    @Override
    public IExpression pow(IExpression other) {
        return evaluate().pow(other);
    }

    @Override
    public IExpression negate() {
        return evaluate().negate();
    }

    @Override
    public StringExpression head() {
        return new StringExpression("Thunk");
    }

    @Override
    public Object val() {
        return evaluate().val();
    }

    @Override
    public String inputForm() {
        return evaluate().inputForm();
    }

    @Override
    public String toString() {
        return evaluate().toString();
    }

    @Override
    public IExpression length() {
        return evaluate().length();
    }
}
