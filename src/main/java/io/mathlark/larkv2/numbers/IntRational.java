package io.mathlark.larkv2.numbers;

import io.mathlark.larkv2.utils.MathUtils;
import lombok.Getter;

public class IntRational implements Comparable<IntRational> {
    private @Getter Long num;
    private @Getter Long denom;

    public IntRational(Long num, Long denom) {
        this.num = num;
        if (denom == 0) {
            throw new RuntimeException("Cannot have 0 as denominator");
        }
        this.denom = denom;
        reduce();
        adjustNegative();
    }

    private void adjustNegative() {
        if (this.denom < 0) {
            this.num = -this.num;
            this.denom = -this.denom;
        }
    }

    public IntRational(Integer num, Integer denom) {
        this.num = num.longValue();
        this.denom = denom.longValue();
        reduce();
        adjustNegative();
    }

    private void reduce() {
        Long gcd = MathUtils.gcd(num, denom);
        this.num = num / gcd;
        this.denom = denom / gcd;
    }

    public IntRational add(Long other) {
        return add(new IntRational(other, 1L));
    }

    public IntRational add(Integer other) {
        return add(new IntRational(other.longValue(), 1L));
    }

    public IntRational add(IntRational other) {
        return new IntRational(this.num * other.denom + this.denom * other.num, this.denom * other.denom);
    }

    public IntRational sub(IntRational other) {
        return add(other.mul(-1L));
    }

    public IntRational mul(Long other) {
        return mul(new IntRational(other, 1L));
    }

    public IntRational mul(Integer other) {
        return mul(new IntRational(other.longValue(), 1L));
    }

    public IntRational mul(IntRational other) {
        return new IntRational(num * other.num, denom * other.denom);
    }

    public IntRational div(Long other) {
        return div(new IntRational(other, 1L));
    }

    public IntRational div(Integer other) {
        return div(new IntRational(other.longValue(), 1L));
    }

    public IntRational div(IntRational other) {
        return new IntRational(num * other.denom, denom * other.num);
    }

    public double numericValue() {
        return ((double) num) / denom;
    }

    public String toString() {
        if (num == 0) return Integer.toString(0);
        if (denom == 1) return num.toString();
        return String.format("(%s/%s)", num.toString(), denom.toString());
    }

    public static IntRational make(Integer a, Integer b) {
        return new IntRational(a, b);
    }

    public static IntRational make(Long a, Long b) {
        return new IntRational(a, b);
    }

    @Override
    public int compareTo(IntRational o) {
        return Double.compare(numericValue(), o.numericValue());
    }

    public IntRational reciprocal() {
        return new IntRational(this.denom, this.num);
    }

    public IntRational pow(Long other) {
        if (other < 0) {
            return reciprocal().pow(-other);
        }
        return new IntRational(NumericUtils.powerLong(this.num, other), NumericUtils.powerLong(this.denom, other));
    }

    public IntRational pow(Integer other) {
        return pow(other.longValue());
    }

    public boolean equals(Object other) {
        if (other instanceof IntRational) {
            IntRational otherRat = (IntRational) other;
            return num.equals(otherRat.num) && denom.equals(otherRat.denom);
        }
        return false;
    }

    public IntRational negate() {
        return new IntRational(-this.num, this.denom);
    }
}
