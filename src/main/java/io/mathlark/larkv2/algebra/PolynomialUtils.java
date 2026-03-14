package io.mathlark.larkv2.algebra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.algebra.rings.IRing;
import io.mathlark.larkv2.algebra.rings.RationalRing;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.math.RationalExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.utils.FunctionUtils;

public class PolynomialUtils {
    @SuppressWarnings("unchecked")
    public static <R extends IRing<U>, U extends IExpression> boolean isFreeOf(IExpression poly, String x) {
        if (!FunctionUtils.isInstanceOf(poly, PolynomialExpression.class)) {
            return true;
        }

        PolynomialExpression<R, U> polyExp = (PolynomialExpression<R, U>) poly;
        return !polyExp.getSymbols().contains(x);
    }

    public static <R extends IRing<U>, U extends IExpression> boolean isFreeOf(IExpression poly, PolynomialExpression<R, U> x) {
        if (!x.isSymbol()) return true;
        String symbol = x.getSymbols().get(0);
        return isFreeOf(poly, symbol);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static PolynomialExpression constantPolyInRationals(RationalExpression constant, List<String> symbols) {
        Map<String, IExpression> powerMap = new HashMap<>();
        for (String symbol: symbols) {
            powerMap.put(symbol, GlobalSymbols.ZERO);
        }
        List<MonomialExpression> monomials = List.of(new MonomialExpression(powerMap));
        List<RationalExpression> coeffs = new ArrayList<>();
        coeffs.add(constant);

        return new PolynomialExpression(monomials, coeffs, RationalRing.QQ);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static IExpression sPolynomial(IExpression e1, IExpression e2) {
        if (e1.evaluate().equals(GlobalSymbols.ZERO) || e2.evaluate().equals(GlobalSymbols.ZERO)) {
            return GlobalSymbols.ZERO;
        }

        PolynomialExpression p1 = (PolynomialExpression) e1;
        PolynomialExpression p2 = (PolynomialExpression) e2;

        if (!p1.getRing().equals(p2.getRing())) {
            return GlobalSymbols.UNDEFINED;
        }
        

        MonomialExpression lcm = MonomialExpression.lcm(p1.leadingMonomial(), p2.leadingMonomial());
        PolynomialExpression f = new PolynomialExpression(
            new ArrayList<>(List.of(lcm.div(p1.leadingMonomial()))), 
            new ArrayList<>(List.of(p1.getRing().getMulInverse(p1.leadingCoeff()))),
            p1.getRing()
        );
        PolynomialExpression g = new PolynomialExpression(
            new ArrayList<>(List.of(lcm.div(p2.leadingMonomial()))), 
            new ArrayList<>(List.of(p2.getRing().getMulInverse(p2.leadingCoeff()))),
            p1.getRing()
        );

        return f.mul(p1).sub(g.mul(p2));
    }
}
