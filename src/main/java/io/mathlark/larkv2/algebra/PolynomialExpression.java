package io.mathlark.larkv2.algebra;

import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import io.mathlark.larkv2.algebra.rings.IRing;
import io.mathlark.larkv2.algebra.rings.RationalRing;
import io.mathlark.larkv2.algebra.rings.RealRing;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.expressions.math.RationalExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.utils.FunctionUtils;
import lombok.Getter;

public class PolynomialExpression<R extends IRing<U>, U extends IExpression> implements IExpression {
    private @Getter List<MonomialExpression> monomials;
    private @Getter List<U> coeffs;
    private @Getter List<String> symbols;
    private @Getter R ring;

    @SuppressWarnings("unchecked")
    public PolynomialExpression(List<MonomialExpression> monomials, List<U> coeffs) {
        this(monomials, coeffs, (R) RealRing.RR);
    }

    public PolynomialExpression(List<MonomialExpression> monomials, List<U> coeffs, R ring) {
        this.monomials = new ArrayList<>();
        this.coeffs = new ArrayList<>();
        this.ring = ring;
        
        int i = coeffs.size() - 1;
        while (i > 0) {
            if (coeffs.get(i).equals(ring.getZero()))
                i--;
            else 
                break;
        }

        monomials = monomials.subList(0, i + 1);
        coeffs = coeffs.subList(0, i + 1);

        if (monomials.size() != coeffs.size()) {
            throw new RuntimeException("Monomial list should be same as number of non-zero coefficients");
        }

        this.coeffs = coeffs;

        Set<String> symbolSet = new HashSet<>();

        for (MonomialExpression monomial: monomials) {
            symbolSet.addAll(monomial.getSymbols());
        }

        this.symbols = new ArrayList<>(symbolSet);
        Collections.sort(this.symbols);

        for (MonomialExpression monomial: monomials) {
            Map<String, IExpression> monoMap = new HashMap<>();
            for (String symbol: this.symbols) {
                monoMap.put(symbol, monomial.getPowerMap().getOrDefault(symbol, GlobalSymbols.ZERO));
            }
            this.monomials.add(new MonomialExpression(monoMap));
        }

        class QuickPair<T1 extends Comparable<T1>, T2> implements Comparable<QuickPair<T1, T2>> {
            private @Getter T1 first;
            private @Getter T2 second;

            public QuickPair(T1 first, T2 second) {
                this.first = first;
                this.second = second;
            }

            @Override
            public int compareTo(QuickPair<T1, T2> o) {
                return this.first.compareTo(o.first);
            }
        }

        List<QuickPair<MonomialExpression, U>> pairs = new ArrayList<>();

        for (int x = 0; x < this.monomials.size(); x++) {
            MonomialExpression monomial = this.monomials.get(x);
            U coeff = this.coeffs.get(x);

            pairs.add(new QuickPair<MonomialExpression, U>(monomial, coeff));
        }

        pairs.sort(new Comparator<QuickPair<MonomialExpression, U>>() {
            @Override
            public int compare(QuickPair<MonomialExpression, U> o1,
                    QuickPair<MonomialExpression, U> o2) {
                return o1.first.compareTo(o2.first);
            }   
        });

        this.monomials = new ArrayList<>();
        this.coeffs = new ArrayList<>();

        this.monomials = pairs.stream().map(x -> {return x.first;}).toList();
        this.coeffs = pairs.stream().map(x -> {return x.second;}).toList();
    }

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return String.format("Polynomial(%s, %s)", monomials.toString(), coeffs.toString());
    }

    private boolean isConstant(MonomialExpression monomial) {
        List<Boolean> bools = new ArrayList<>();
        Map<String, IExpression> powerMap = monomial.getPowerMap();

        for (String symbol: powerMap.keySet()) {
            bools.add(powerMap.get(symbol).equals(GlobalSymbols.ZERO));
        }
        return !bools.contains(false);
    }

    public String toString() {
        StringBuilder bldr = new StringBuilder("");

        U minusOne = ring.getAddInverse(ring.getOne());

        for (int i = 0; i < coeffs.size(); i++) {
            StringBuilder str = new StringBuilder("");
            if (ring.isZero(coeffs.get(i))) {
                continue;
            }
            else if (ring.equals(coeffs.get(i), ring.getOne())) {
                if (isConstant(monomials.get(i))) {
                    str.append(" + 1");
                }
                else {
                    str.append(String.format(" + %s", monomials.get(i)));
                }
            }
            else if (ring.equals(coeffs.get(i), minusOne)) {
                if (isConstant(monomials.get(i))) {
                    str.append(" - 1");
                }
                else {
                    str.append(String.format(" - %s", monomials.get(i)));
                }
            }
            else if (ring.compare(coeffs.get(i), ring.getZero()) < 1) {
                if (isConstant(monomials.get(i))) {
                    str.append(String.format(" - %s", coeffs.get(i).mul(minusOne)));
                }
                else {
                    str.append(String.format(" - %s%s", coeffs.get(i).mul(minusOne), monomials.get(i)));
                }
            }
            else {
                if (isConstant(monomials.get(i))) {
                    str.append(String.format(" + %s", coeffs.get(i)));
                }
                else {
                    str.append(String.format(" + %s%s", coeffs.get(i), monomials.get(i)));
                }
            }

            bldr.append(str);
        }

        return StringUtils.strip(bldr.toString(), " +");
    }

    @SuppressWarnings("unchecked")
    @Override
    public IExpression add(IExpression other) {
        other = other.evaluate();
        List<MonomialExpression> selfMonomials = new ArrayList<>();
        selfMonomials.addAll(this.monomials);

        List<U> selfCoeffs = new ArrayList<>();
        selfCoeffs.addAll(this.coeffs);
        
        if (FunctionUtils.isInstanceOf(other, NumericExpression.class) || other instanceof RationalExpression) {
            if (other.equals(GlobalSymbols.ZERO) || other.equals(ring.getZero())) {
                return this;
            }
            
            U otherU = ring.cast(other);
            
            Map<String, IExpression> newMap = new HashMap<>();
            for (String symbol: this.symbols) {
                newMap.put(symbol, GlobalSymbols.ZERO);
            }
            List<U> otherList = new ArrayList<>();
            otherList.add(otherU);
            other = new PolynomialExpression<R, U>(List.of(new MonomialExpression(newMap)), otherList, this.ring);
        }
        if (FunctionUtils.isInstanceOf(other, PolynomialExpression.class)) {
            PolynomialExpression<R, U> otherPoly = (PolynomialExpression<R, U>) other;
            List<MonomialExpression> otherMonomials = otherPoly.monomials;
            List<U> otherCoeffs = otherPoly.coeffs;

            List<MonomialExpression> newMonomials = new ArrayList<>();
            List<U> newCoeffs = new ArrayList<>();

            int len1 = selfMonomials.size();
            int len2 = otherMonomials.size();

            int i = 0, j = 0;

            while (i < len1 || j < len2) {
                if ((i < len1 && j < len2) && selfMonomials.get(i).equals(otherMonomials.get(j))) {
                    newMonomials.add(selfMonomials.get(i));
                    newCoeffs.add(ring.add(selfCoeffs.get(i), otherCoeffs.get(j)));
                    i++; 
                    j++;
                }
                else if ((i == len1) || (j < len2 && selfMonomials.get(i).compareTo(otherMonomials.get(j)) == 1)) {
                    newMonomials.add(otherMonomials.get(j));
                    newCoeffs.add(otherCoeffs.get(j));
                    j++;
                }
                else {
                    newMonomials.add(selfMonomials.get(i));
                    newCoeffs.add(selfCoeffs.get(i));
                    i++;
                }
            }

            if (newCoeffs.stream().allMatch(x -> x.equals(ring.getZero()))) {
                return this.ring.getZero();
            }

            return new PolynomialExpression<R, U>(newMonomials, newCoeffs, this.ring);
        }
        return GlobalSymbols.UNDEFINED;
    }

    public boolean isRational() {
        return ring.equals(RationalRing.QQ);
    }

    @Override
    public IExpression sub(IExpression other) {
        return this.add(other.mul(new NumericExpression(-1)));
    }

    @SuppressWarnings("unchecked")
    @Override
    public IExpression mul(IExpression other) {
        other = other.evaluate();
        if (PolynomialExpression.isZero(other, ring)) {
            return GlobalSymbols.ZERO;
        }

        if (FunctionUtils.isInstanceOf(other, NumericExpression.class) || other instanceof RationalExpression) {
            if (other.equals(GlobalSymbols.ZERO) || other.equals(ring.getZero())) return ring.getZero();
            
            U otherU = ring.cast(other);

            Map<String, IExpression> newMap = new HashMap<>();
            for (String symbol: symbols) {
                newMap.put(symbol, GlobalSymbols.ZERO);
            }
            List<U> otherList = new ArrayList<>();
            otherList.add(otherU);
            other = new PolynomialExpression<>(List.of(new MonomialExpression(newMap)), otherList, this.ring);
        }

        PolynomialExpression<R, U> poly1 = this;
        PolynomialExpression<R, U> poly2 = (PolynomialExpression<R, U>) other;

        if (poly2.monomials.size() > poly1.monomials.size()) {
            PolynomialExpression<R, U> temp = poly1;
            poly1 = poly2;
            poly2 = temp;
        }

        int l2 = poly2.monomials.size();

        if (l2 == 1) {
            List<MonomialExpression> newMonos = new ArrayList<>();
            List<U> newCoeffs = new ArrayList<>();

            for (MonomialExpression monomial: poly1.getMonomials()) {
                newMonos.add((MonomialExpression) poly2.monomials.get(0).mul(monomial));
            }
            for (U coeff: poly1.coeffs) {
                newCoeffs.add(ring.mul(poly2.coeffs.get(0), coeff));
            }
            return new PolynomialExpression<>(newMonos, newCoeffs, this.ring);
        }
        else {
            List<MonomialExpression> h1 = poly2.monomials.subList(0, l2 / 2);
            List<MonomialExpression> h2 = poly2.monomials.subList(l2 / 2, l2);

            List<U> c1 = poly2.coeffs.subList(0, l2 / 2);
            List<U> c2 = poly2.coeffs.subList(l2 / 2, l2);

            return poly1.mul(new PolynomialExpression<>(h1, c1, this.ring)).add(poly1.mul(new PolynomialExpression<>(h2, c2, this.ring)));
        }
    }

    @Override
    public IExpression negate() {
        return this.mul(new NumericExpression(-1));
    }

    @SuppressWarnings("unchecked")
    @Override
    public IExpression pow(IExpression other) {
        other = other.evaluate();
        if (other.equals(GlobalSymbols.ZERO)) return ring.getOne();
        else if (other.equals(GlobalSymbols.ONE) || other.equals(ring.getOne())) return this;
        else if (!((NumericExpression) other).isDecimal()) {
            PolynomialExpression<R, U> x = new PolynomialExpression<>(monomials, coeffs, this.ring);
            Long power = ((NumericExpression) other).value.longValue();
            for (int i = 0; i < power - 1; i++) {
                x = (PolynomialExpression<R, U>) x.mul(this);
            }
            return x;
        }
        System.out.println("Incompatible operands for '^'");
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
        return new StringExpression("Polynomial");
    }

    @Override
    public Object val() {
        return toString();
    }

    @Override
    public IExpression length() {
        return new NumericExpression(this.monomials.size());
    }

    @SuppressWarnings("unchecked")
    public static <R extends IRing<U>, U extends IExpression> boolean isZero(IExpression expr, R ring) {
        if (expr.evaluate().equals(ring.getZero())) {
            return true;
        }

        if (FunctionUtils.isInstanceOf(expr, PolynomialExpression.class)) {
            PolynomialExpression<R, U> poly = (PolynomialExpression<R, U>) expr;
            return poly.coeffs.stream().allMatch(x -> x.equals(ring.getZero())) || poly.coeffs.isEmpty();
        }

        return false;
    }

    @SuppressWarnings("unchecked")
    public boolean equals(Object other) {
        if (!(other instanceof IExpression)) return false;
        if (!FunctionUtils.isInstanceOf((IExpression) other, PolynomialExpression.class)) return false;
        PolynomialExpression<R, U> otherPoly = (PolynomialExpression<R, U>) ((IExpression) other).evaluate();;

        if (!(monomials.size() == otherPoly.monomials.size() && coeffs.size() == otherPoly.coeffs.size())) {
            return false;
        }

        return monomials.equals(otherPoly.monomials) && coeffs.equals(otherPoly.coeffs);
    }

    public static <R extends IRing<U>, U extends IExpression> IExpression quotRem(PolynomialExpression<R, U> dividend, PolynomialExpression<R, U> divisor) {
        return GlobalSymbols.UNDEFINED;
    }

    public long getDegree(String symbol) {
        long degree = Long.MIN_VALUE;
        for (MonomialExpression monomial: monomials) {
            degree = monomial.degree(symbol) >= degree ? monomial.degree(symbol) : degree;
        }
        return degree;
    }

    public long getDegree() {
        long degree = Long.MIN_VALUE;
        for (MonomialExpression monomial: monomials) {
            degree = monomial.degree() >= degree ? monomial.degree() : degree;
        }
        return degree;
    }

    public IExpression degree(String symbol) {
        return new NumericExpression(getDegree(symbol));
    }

    public IExpression degree() {
        return new NumericExpression(getDegree());
    }

    public IExpression degree(PolynomialExpression<R, U> x) {
        String symbol = x.symbols.get(0);
        return degree(symbol);
    }

    public boolean isUnivariate() {
        return this.symbols.size() == 1;
    }

    public boolean isSymbol() {
        return this.monomials.size() == 1 && this.isUnivariate() && this.coeffs.equals(List.of(ring.getOne()));
    }
}
