package io.mathlark.larkv2.colours.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.colours.ColourExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;

public class ColourTextFunc extends LarkFunction {
    public ColourTextFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        IExpression expr = exprs[0];
        ColourExpression colour = (ColourExpression) exprs[1];    
        
        String colourFormat = "\033[38;2;%d;%d;%dm%s\033[0m";
        return new StringExpression(String.format(colourFormat, 
            colour.getR().intValue(), 
            colour.getG().intValue(), 
            colour.getB().intValue(),
            expr.toString()
        ));
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 2) {
            throw new WrongParameterLengthException("Expected 2 elements, got %d elements", exprs.length);
        }
        if (exprs[0] instanceof ColourExpression) {
            throw new WrongParameterTypeException("Colour (position 0) cannot be recoloured");
        }

        if (!(exprs[1] instanceof ColourExpression)) {
            throw new WrongParameterTypeException(ColourExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "ColourText";
    }
    
}
