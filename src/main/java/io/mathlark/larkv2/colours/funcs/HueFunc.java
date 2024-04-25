package io.mathlark.larkv2.colours.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.colours.ColourExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.numbers.NumericUtils;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class HueFunc extends LarkFunction {

    public HueFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        double h = ((NumericExpression) exprs[0]).value.doubleValue();
        double s = 1;
        double v = 1;
        if (exprs.length > 1) {  
            s = ((NumericExpression) exprs[1]).value.doubleValue();
            v = ((NumericExpression) exprs[2]).value.doubleValue();
        }

        h = NumericUtils.clipValue(h, 0, 1);
        s = NumericUtils.clipValue(s, 0, 1);
        v = NumericUtils.clipValue(v, 0, 1);

        int i = (int) (h * 6.0);
        double f = h * 6.0 - i;
        double p = v * (1.0 - s);
        double q = v * (1.0 - s * f);
        double t = v * (1.0 - (1.0 - f) * s);

        i = i % 6;

        double r_, g_, b_;

        switch (i) {
        case 0:
            r_ = v; 
            g_ = t; 
            b_ = p;
            break;
        case 1:
            r_ = q; 
            g_ = v; 
            b_ = p;
            break;
        case 2:
            r_ = p; 
            g_ = v; 
            b_ = t;
            break;
        case 3:
            r_ = p; 
            g_ = q; 
            b_ = v;
            break;
        case 4:
            r_ = t; 
            g_ = p; 
            b_ = v;
            break;
        default:
            r_ = v; 
            g_ = p; 
            b_ = q;
            break;
        }
        ColourExpression colour = new ColourExpression((long)(r_ * 255), (long)(g_ * 255), (long)(b_ * 255));
        return colour;
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1 && exprs.length != 3) {
            throw new WrongParameterLengthException("Expected 1 or 3 arguments, got %d", exprs.length);
        }

        if (exprs.length >= 1) {
            if (!FunctionUtils.isInstanceOf(exprs[0], NumericExpression.class)) {
                throw new WrongParameterTypeException(NumericExpression.class, 0, exprs[0].getClass());
            }
            if (exprs.length > 1) {
                if (!FunctionUtils.isInstanceOf(exprs[1], NumericExpression.class)) {
                    throw new WrongParameterTypeException(NumericExpression.class, 1, exprs[1].getClass());
                }
                if (!FunctionUtils.isInstanceOf(exprs[2], NumericExpression.class)) {
                    throw new WrongParameterTypeException(NumericExpression.class, 2, exprs[2].getClass());
                }
            }
        }
    }

    @Override
    public String getName() {
        return "Hue";
    }
    
}
