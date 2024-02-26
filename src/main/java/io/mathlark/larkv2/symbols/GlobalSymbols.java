package io.mathlark.larkv2.symbols;

import java.util.HashMap;
import java.util.Map;

import io.mathlark.larkv2.colors.ColorsConstants;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.UndefinedExpression;
import io.mathlark.larkv2.expressions.math.BooleanExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;

public class GlobalSymbols {
    public static final UndefinedExpression UNDEFINED = new UndefinedExpression();
    public static final NumericExpression PI = new NumericExpression(Math.PI);
    public static final NumericExpression E = new NumericExpression(Math.E);
    public static final BooleanExpression TRUE = new BooleanExpression(true);
    public static final BooleanExpression FALSE = new BooleanExpression(false);
    public static final NumericExpression ZERO = new NumericExpression(0);
    public static final NumericExpression ONE = new NumericExpression(1);

    public static final Map<String, IExpression> SYMBOLS = new HashMap<>();

    static {
        SYMBOLS.put("Undefined", UNDEFINED);
        SYMBOLS.put("Pi", PI);
        SYMBOLS.put("E", E);
        SYMBOLS.put("True", TRUE);
        SYMBOLS.put("False", FALSE);
        SYMBOLS.putAll(ColorsConstants.COLOR_MAP);
    }
}
