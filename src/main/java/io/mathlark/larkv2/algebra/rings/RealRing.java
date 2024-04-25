package io.mathlark.larkv2.algebra.rings;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class RealRing implements IRing<NumericExpression> {
    public static final IRing<NumericExpression> RR = new RealRing();

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return "RealRing()";
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
        return new StringExpression("RealRing");
    }

    @Override
    public Object val() {
        return this;
    }

    @Override
    public IExpression length() {
        return new NumericExpression(0);
    }

    @Override
    public NumericExpression add(NumericExpression a1, NumericExpression a2) {
        return (NumericExpression) a1.add(a2);
    }

    @Override
    public NumericExpression mul(NumericExpression a1, NumericExpression a2) {
        return (NumericExpression) a1.mul(a2);
    }

    @Override
    public NumericExpression getZero() {
        return GlobalSymbols.ZERO;
    }

    @Override
    public NumericExpression getOne() {
        return GlobalSymbols.ONE;
    }

    @Override
    public NumericExpression getAddInverse(NumericExpression a1) {
        return (NumericExpression) a1.negate();
    }

    @Override
    public NumericExpression getMulInverse(NumericExpression a1) {
        return (NumericExpression) GlobalSymbols.ONE.div(a1);
    }

    @Override
    public int compare(NumericExpression a1, NumericExpression a2) {
        return a1.compareTo(a2);
    }
    
}
