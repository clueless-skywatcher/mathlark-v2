package io.mathlark.larkv2.expressions.math;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.utils.MathUtils;

public class NumericExpression implements IExpression, Comparable<NumericExpression> {
    public Number value;
    public int precision = 5;

    public NumericExpression(long value) {
        this.value = value;
    }

    public NumericExpression(double value) {
        this.value = MathUtils.round(value, precision);
    }

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return toString();
    }

    public String toString() {
        return this.value.toString();
    }

    private NumericExpression addNum(NumericExpression other) {
        if (other.value instanceof Long && this.value instanceof Long) {
            long thisVal = this.value.longValue();
            long otherVal = other.value.longValue();
            return new NumericExpression(thisVal + otherVal);
        }
        else {
            double thisVal = this.value.doubleValue();
            double otherVal = other.value.doubleValue();
            return new NumericExpression(thisVal + otherVal);
        }
    }

    private NumericExpression powNum(NumericExpression other) {
        if (!isDecimal() && !other.isDecimal()) {
            long thisVal = this.value.longValue();
            long otherVal = other.value.longValue();

            return new NumericExpression(powNum(thisVal, otherVal));
        }
        double thisVal = this.value.doubleValue();
        double otherVal = this.value.doubleValue();
        return new NumericExpression(Math.pow(thisVal, otherVal));
    }

    private long powNum(long base, long exp) {
        long res = 1;
        long sq = base;
        while(exp > 0){
            if(exp % 2 == 1){
                res *= sq; 
            }
            sq = sq * sq;
            exp /= 2;
        }
        return res;
    }

    public IExpression negate() {
        if (value instanceof Long) {
            return new NumericExpression(-(long) value);
        }
        else {
            return new NumericExpression(-(double) value);
        }
    }

    @Override
    public IExpression add(IExpression other) {
        if (other instanceof NumericExpression) {
            return addNum((NumericExpression) other);
        }
        return other.add(this);
    }

    @Override
    public IExpression mul(IExpression other) {
        if (other instanceof NumericExpression) {
            return mulNum((NumericExpression) other);
        }
        return other.mul(this);
    }

    private IExpression mulNum(NumericExpression other) {
        if (other.value instanceof Long && this.value instanceof Long) {
            long thisVal = this.value.longValue();
            long otherVal = other.value.longValue();
            return new NumericExpression(thisVal * otherVal);
        }
        else {
            return new NumericExpression(this.value.doubleValue() * other.value.doubleValue());
        }
    }

    @Override
    public IExpression pow(IExpression other) {
        if (other instanceof NumericExpression) {
            return powNum((NumericExpression) other);
        }
        return other.pow(this);
    }

    @Override
    public IExpression div(IExpression other) {
        if (other instanceof NumericExpression) {
            return new NumericExpression(this.value.doubleValue() / ((NumericExpression) other).value.doubleValue());
        }
        return other.div(this);
    }

    public boolean isDecimal() {
        return this.value instanceof Double;
    }

    @Override
    public IExpression mod(IExpression other) {
        if (other instanceof NumericExpression) {
            NumericExpression numOther = (NumericExpression) other;
            if (!numOther.isDecimal()) {
                return new NumericExpression((long) this.value % (long) numOther.value);
            }
        }
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression sub(IExpression other) {
        return this.add(other.negate());
    }

    public boolean equals(Object other) {
        if (other instanceof NumericExpression) {
            return this.value.equals(((NumericExpression) other).value);
        }
        if (other instanceof Number) {
            return this.value.equals((Number) other);
        }
        if (other instanceof IExpression) {
            return this.value.equals(((IExpression) other).evaluate().val());
        }

        return false;
    }

    @Override
    public StringExpression head() {
        String headVal = isDecimal() ? "Decimal" : "Integer";
        return new StringExpression(headVal);
    }

    @Override
    public Object val() {
        return this.value;
    }

    @Override
    public IExpression length() {
        return GlobalSymbols.ZERO;
    }    

    public int hashCode() {
        return this.val().hashCode();
    }

    @Override
    public int compareTo(NumericExpression arg0) {
        double num1 = this.value.doubleValue();
        double num2 = arg0.value.doubleValue();
        return Double.compare(num1, num2);
    }

    public boolean isNegative() {
        return this.value.doubleValue() < 0;
    }
}
