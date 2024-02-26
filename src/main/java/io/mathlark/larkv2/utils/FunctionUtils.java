package io.mathlark.larkv2.utils;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class FunctionUtils {
    public static boolean isInstanceOf(IExpression expr, Class<? extends IExpression> exprClass) {
        return exprClass.isInstance(expr) || exprClass.isInstance(expr.evaluate()); 
    }

    public static boolean containsUndefined(IExpression... expressions) {
        for (IExpression expression : expressions) {
            if (expression.evaluate().equals(GlobalSymbols.UNDEFINED) || expression.equals(GlobalSymbols.UNDEFINED)) {
                return true;
            }
        }
        return false;
    }
}
