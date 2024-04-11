package io.mathlark.larkv2.colours.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.colours.ColourExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;

public class RGBColourFunc extends LarkFunction {
    public RGBColourFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        NumericExpression r = (NumericExpression) exprs[0];
        NumericExpression g = (NumericExpression) exprs[1];
        NumericExpression b = (NumericExpression) exprs[2];
        return new ColourExpression(r, g, b);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 3) {
            throw new WrongParameterLengthException("Expected 3 elements, got %d elements", exprs.length);
        }

        if (!(exprs[0] instanceof NumericExpression)) {
            throw new WrongParameterTypeException(NumericExpression.class, 0, exprs[0].getClass());
        }
        if (!(exprs[1] instanceof NumericExpression)) {
            throw new WrongParameterTypeException(NumericExpression.class, 0, exprs[0].getClass());
        }
        if (!(exprs[2] instanceof NumericExpression)) {
            throw new WrongParameterTypeException(NumericExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "RGBColour";
    }
}
