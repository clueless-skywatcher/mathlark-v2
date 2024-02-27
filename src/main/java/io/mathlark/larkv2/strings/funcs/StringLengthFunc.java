package io.mathlark.larkv2.strings.funcs;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.utils.FunctionUtils;

public class StringLengthFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] expressions) {
        StringExpression str = (StringExpression) expressions[0];
        return new NumericExpression(str.getVal().length());
    }

    @Override
    public void checkArgs(IExpression[] expressions) {
        if (expressions.length != 1) {
            throw new WrongParameterLengthException("Expected 1 element, got %d elements", expressions.length);
        }

        if (!FunctionUtils.isInstanceOf(expressions[0], StringExpression.class)) {
            throw new WrongParameterTypeException(StringExpression.class, 0, expressions[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "StringLength";
    }
    
}
