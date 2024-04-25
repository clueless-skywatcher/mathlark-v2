package io.mathlark.larkv2.expressions.math;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.numbers.IntRational;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import lombok.Getter;

public class RationalExpression implements IExpression {
    private @Getter IntRational rational;
    
    public RationalExpression(IntRational rational) {
        this.rational = rational;
    }

    public RationalExpression(NumericExpression num, NumericExpression denom) {
        Long numerator = num.value.longValue();
        Long denominator = denom.value.longValue();
        this.rational = new IntRational(numerator, denominator);
    }

    @Override
    public IExpression evaluate() {
        if (rational.getNum() == 0) {
            return GlobalSymbols.ZERO;
        }
        if (rational.getDenom() == 1) {
            return new NumericExpression(rational.getNum());
        }
        return this;
    }

    @Override
    public String inputForm() {
        return String.format("Rational(%s, %s)", rational.getNum().toString(), rational.getDenom().toString());
    }

    @Override
    public IExpression add(IExpression other) {
        if (other instanceof NumericExpression) {
            NumericExpression otherNum = (NumericExpression) other;
            if (otherNum.isDecimal()) {
                return this.numericValue().add(otherNum);
            }
            return add(new RationalExpression(otherNum, GlobalSymbols.ONE));
        }
        if (other instanceof RationalExpression) {
            RationalExpression otherRat = (RationalExpression) other;
            return new RationalExpression(rational.add(otherRat.rational));
        }
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression sub(IExpression other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sub'");
    }

    @Override
    public IExpression mul(IExpression other) {
        if (other instanceof NumericExpression) {
            NumericExpression otherNum = (NumericExpression) other;
            if (otherNum.isDecimal()) {
                return this.numericValue().mul(otherNum);
            }
            return mul(new RationalExpression(otherNum, GlobalSymbols.ONE));
        }
        if (other instanceof RationalExpression) {
            RationalExpression otherRat = (RationalExpression) other;
            return new RationalExpression(rational.mul(otherRat.rational));
        }
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression negate() {
        return new RationalExpression(rational.negate());
    }

    @Override
    public IExpression pow(IExpression other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pow'");
    }

    @Override
    public IExpression div(IExpression other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'div'");
    }

    @Override
    public IExpression mod(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public StringExpression head() {
        return new StringExpression("Rational");
    }

    @Override
    public Object val() {
        return this.rational;
    }

    public IExpression numericValue() {
        return new NumericExpression(this.rational.numericValue());
    }

    @Override
    public IExpression length() {
        return GlobalSymbols.ZERO;
    }
    
    public String toString() {
        return this.rational.toString();
    }

    public boolean equals(Object other) {
        if (other instanceof RationalExpression) {
            RationalExpression othRat = (RationalExpression) other;
            return this.rational.equals(othRat.rational);
        }
        if (other instanceof NumericExpression) {
            return this.numericValue().equals(other);
        }
        return false;
    }

}
