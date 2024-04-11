package io.mathlark.larkv2.colours.funcs;

import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.colours.ColourExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;

public class ColourValuesFunc extends LarkFunction {

    public ColourValuesFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        ColourExpression colour = (ColourExpression) exprs[0];

        return new ListExpression(
            List.of(
                new NumericExpression(colour.getR()), 
                new NumericExpression(colour.getG()), 
                new NumericExpression(colour.getB())
            )
        );
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 element, got %d elements", exprs.length);
        }

        if (!(exprs[0] instanceof ColourExpression)) {
            throw new WrongParameterTypeException(ColourExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "ColourValues";
    }
    
}
