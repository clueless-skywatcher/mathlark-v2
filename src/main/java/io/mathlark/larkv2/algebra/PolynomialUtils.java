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
}
