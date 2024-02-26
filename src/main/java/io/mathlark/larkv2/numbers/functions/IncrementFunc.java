package io.mathlark.larkv2.numbers.functions;

import java.math.BigDecimal;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.utils.FunctionUtils;

public class IncrementFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        NumericExpression num = (NumericExpression) exprs[0].evaluate();
        if (num.value instanceof Long) {
            return new NumericExpression(num.value.longValue() + 1);
        }
        else {
            BigDecimal decimal = new BigDecimal(num.value.doubleValue());
            decimal = decimal.add(new BigDecimal(1));
            return new NumericExpression(decimal.doubleValue());
        }
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 element, got %d elements", exprs.length);
        }
        if (FunctionUtils.containsUndefined(exprs)) {
            throw new WrongParameterTypeException("Undefined expression present in arguments");
        }
        if (!(exprs[0] instanceof NumericExpression)) {
            throw new WrongParameterTypeException("Expected NumericExpression at position 0, got %d", exprs[0].getClass().getName());
        }
    }

    @Override
    public String getName() {
        return "Increment";
    }
    
}
