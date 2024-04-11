package io.mathlark.larkv2.algebra;

import io.mathlark.larkv2.algebra.rings.IRing;
import io.mathlark.larkv2.expressions.IExpression;
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
}
