package io.mathlark.larkv2.expressions.math;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.numbers.IntRational;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.utils.FunctionUtils;
import lombok.Getter;

public class RationalExpression implements IExpression {
    private @Getter IntRational rational;
    private @Getter NumericExpression num;
    private @Getter NumericExpression denom;

    public static final RationalExpression RAT_ONE = new RationalExpression(GlobalSymbols.ONE, GlobalSymbols.ONE);
    public static final RationalExpression RAT_ZERO = new RationalExpression(GlobalSymbols.ZERO, GlobalSymbols.ONE);

    public RationalExpression(IntRational rational) {
        this.rational = rational;
        this.num = new NumericExpression(rational.getNum());
        this.denom = new NumericExpression(rational.getDenom());
    }

    public RationalExpression(NumericExpression num, NumericExpression denom) {
        Long numerator = num.value.longValue();
        Long denominator = denom.value.longValue();
        this.rational = new IntRational(numerator, denominator);
        this.num = num;
        this.denom = denom;
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
        return other.add(this);
    }

    @Override
    public IExpression sub(IExpression other) {
        return this.add(other.mul(GlobalSymbols.MINUSONE));
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
        return other.mul(this);
    }

    @Override
    public IExpression negate() {
        return new RationalExpression(rational.negate());
    }

    @Override
    public IExpression pow(IExpression other) {
        if (FunctionUtils.isInstanceOf(other, NumericExpression.class)) {
            if (other.equals(GlobalSymbols.ZERO)) {
                return RAT_ONE;
            }
            if (other.equals(GlobalSymbols.ONE)) {
                return this;
            }
            return new RationalExpression(rational.pow(((NumericExpression) other).value.longValue()));
        }
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression div(IExpression other) {
        if (other instanceof NumericExpression) {
            NumericExpression otherNum = (NumericExpression) other;
            return new RationalExpression(num, (NumericExpression) denom.mul(otherNum));
        }
        if (other instanceof RationalExpression) {
            RationalExpression ratExp = (RationalExpression) other;
            return new RationalExpression((NumericExpression) this.num.mul(ratExp.denom), (NumericExpression) this.denom.mul(ratExp.num));
        }
        return GlobalSymbols.UNDEFINED;
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
