package io.mathlark.larkv2.algebra.rings;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.RationalExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class RationalRing implements IRing<RationalExpression> {
    public static final IRing<RationalExpression> QQ = new RationalRing();

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return "RationalRing()";
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
        return new StringExpression("RationalRing");
    }

    @Override
    public Object val() {
        return this;
    }

    @Override
    public IExpression length() {
        return GlobalSymbols.ZERO;
    }

    @Override
    public RationalExpression add(RationalExpression a1, RationalExpression a2) {
        return (RationalExpression) a1.add(a2);
    }

    @Override
    public RationalExpression mul(RationalExpression a1, RationalExpression a2) {
        return (RationalExpression) a1.mul(a2);
    }

    @Override
    public RationalExpression getZero() {
        return new RationalExpression(GlobalSymbols.ZERO, GlobalSymbols.ONE);
    }

    @Override
    public RationalExpression getOne() {
        return new RationalExpression(GlobalSymbols.ONE, GlobalSymbols.ONE);
    }

    @Override
    public RationalExpression getAddInverse(RationalExpression a1) {
        return new RationalExpression(a1.getRational().negate());
    }

    @Override
    public RationalExpression getMulInverse(RationalExpression a1) {
        return new RationalExpression(a1.getRational().reciprocal());
    }

    @Override
    public int compare(RationalExpression a1, RationalExpression a2) {
        return a1.getRational().compareTo(a2.getRational());
    }
    
}
