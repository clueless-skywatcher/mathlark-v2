package io.mathlark.larkv2.dicts.funcs;

import java.util.ArrayList;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.DictExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.utils.FunctionUtils;
import io.mathlark.larkv2.expressions.IExpression;


public class DictValsFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] expressions) {
        DictExpression expression = (DictExpression) expressions[0];
        return new ListExpression(new ArrayList<>(expression.val().values()));
    }

    @Override
    public void checkArgs(IExpression[] expressions) {
        if (expressions.length != 1) {
            throw new WrongParameterLengthException("Expected 1 elements, got %d elements", expressions.length);
        }
        if (!FunctionUtils.isInstanceOf(expressions[0], DictExpression.class)) {
            throw new WrongParameterTypeException(DictExpression.class, 0, expressions[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "DictVals";
    }
    
}
