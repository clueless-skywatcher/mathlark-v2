package io.mathlark.larkv2.algebra.rings;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.expressions.math.RationalExpression;
import io.mathlark.larkv2.numbers.IntRational;
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
        return RationalExpression.RAT_ZERO;
    }

    @Override
    public RationalExpression getOne() {
        return RationalExpression.RAT_ONE;
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

    public static IExpression rationalize(IExpression expr) {
        if (expr instanceof NumericExpression) {
            NumericExpression numExp = (NumericExpression) expr;
            Number numVal = numExp.value;
            if (numExp.isDecimal()) {
                String numRepr = numExp.toString();
                int decimalPlace = numRepr.length() - 1 - numRepr.indexOf(".");
                long numerator = Double.valueOf(numVal.doubleValue() * Math.pow(10, decimalPlace)).longValue();
                return new RationalExpression(new IntRational(numerator, Double.valueOf(Math.pow(10, decimalPlace)).longValue()));
            }
            else {
                return new RationalExpression(new IntRational(numExp.value.longValue(), 1L));
            }
        }
        if (expr instanceof RationalExpression) return expr;
        return GlobalSymbols.UNDEFINED;
    }
    
    public boolean equals(Object other) {
        return other instanceof RationalRing;
    }

    @Override
    public RationalExpression cast(IExpression e) {
        return (RationalExpression) rationalize(e);
    }
}
