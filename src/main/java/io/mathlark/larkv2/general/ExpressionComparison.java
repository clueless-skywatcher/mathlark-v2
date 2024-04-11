package io.mathlark.larkv2.general;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.math.BooleanExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.utils.FunctionUtils;

public class ExpressionComparison {
    public static IExpression equalsExp(IExpression expr1, IExpression expr2) {
        return equals(expr1, expr2) ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
    }

    public static IExpression notEqualsExp(IExpression expr1, IExpression expr2) {
        return !equals(expr1, expr2) ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
    }

    public static boolean equals(IExpression expr1, IExpression expr2) {
        return expr1.evaluate().equals(expr2.evaluate());
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static boolean gt(IExpression expr1, IExpression expr2) throws RuntimeException {
        if (!(FunctionUtils.isInstanceOf(expr1, Comparable.class) && FunctionUtils.isInstanceOf(expr2, Comparable.class))) {
            throw new RuntimeException("Both expressions must be comparable");
        }

        Comparable expr1Val = (Comparable) expr1.evaluate();
        Comparable expr2Val = (Comparable) expr2.evaluate();
        return expr1Val.compareTo(expr2Val) > 0;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static boolean lt(IExpression expr1, IExpression expr2) throws RuntimeException {
        if (!(FunctionUtils.isInstanceOf(expr1, Comparable.class) && FunctionUtils.isInstanceOf(expr2, Comparable.class))) {
            throw new RuntimeException("Both expressions must be comparable");
        }

        Comparable expr1Val = (Comparable) expr1.evaluate();
        Comparable expr2Val = (Comparable) expr2.evaluate();
        return expr1Val.compareTo(expr2Val) < 0;
    }

    public static IExpression gtExp(IExpression expr1, IExpression expr2) {
        try {
            return gt(expr1, expr2) ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return GlobalSymbols.UNDEFINED;
        }
    }

    public static IExpression ltExp(IExpression expr1, IExpression expr2) {
        try {
            return lt(expr1, expr2) ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return GlobalSymbols.UNDEFINED;
        }
    }

    public static IExpression gteExp(IExpression expr1, IExpression expr2) {
        try {
            return gt(expr1, expr2) || equals(expr1, expr2) ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return GlobalSymbols.UNDEFINED;
        }
    }

    public static IExpression lteExp(IExpression expr1, IExpression expr2) {
        try {
            return lt(expr1, expr2) || equals(expr1, expr2) ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return GlobalSymbols.UNDEFINED;
        }
    }

    public static IExpression notExp(IExpression expr) {
        if (!FunctionUtils.isInstanceOf(expr, BooleanExpression.class)) {
            System.out.println("Not a boolean");
            return GlobalSymbols.UNDEFINED;
        }
        BooleanExpression bool = (BooleanExpression) expr;
        return !(bool.val) ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
    }
}
