package io.mathlark.larkv2.dicts.funcs;

import java.util.List;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.DictExpression;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.utils.FunctionUtils;

public class DictValFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] expressions) {
        DictExpression expression = (DictExpression) expressions[0];
        IExpression key = expressions[1];
        return expression.getValue(key);
    }

    @Override
    public void checkArgs(IExpression[] expressions) {
        if (expressions.length != 2) {
            throw new WrongParameterLengthException("Expected 2 elements, got %d elements", expressions.length);
        }
        if (!FunctionUtils.isInstanceOf(expressions[0], DictExpression.class)) {
            throw new WrongParameterTypeException(DictExpression.class, 0, expressions[0].getClass());
        }
        if (!(FunctionUtils.isInstanceOf(expressions[1], StringExpression.class) ||
            FunctionUtils.isInstanceOf(expressions[1], NumericExpression.class))) {
            throw new WrongParameterTypeException(List.of(NumericExpression.class, StringExpression.class), 1, expressions[1].getClass());
        }
    }

    @Override
    public String getName() {
        return "DictVal";
    }
}
