package io.mathlark.larkv2.colors.funcs;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.colors.ColorExpression;

public class ColorTextFunc implements LarkFunction {
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        IExpression expr = exprs[0];
        ColorExpression color = (ColorExpression) exprs[1];    
        
        String colorFormat = "\033[38;2;%d;%d;%dm%s\033[0m";
        return new StringExpression(String.format(colorFormat, 
            color.getR().intValue(), 
            color.getG().intValue(), 
            color.getB().intValue(),
            expr.toString()
        ));
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 2) {
            throw new WrongParameterLengthException("Expected 2 elements, got %d elements", exprs.length);
        }
        if (exprs[0] instanceof ColorExpression) {
            throw new WrongParameterTypeException("Color (position 0) cannot be painted with color");
        }

        if (!(exprs[1] instanceof ColorExpression)) {
            throw new WrongParameterTypeException(ColorExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "ColorText";
    }
    
}
