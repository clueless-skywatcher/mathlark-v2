package io.mathlark.larkv2.dicts.funcs;

import java.util.Map;

import java.util.HashMap;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.DictExpression;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.utils.FunctionUtils;

/**
 * Dict()
 */
public class DictFunc implements LarkFunction {
    @Override
    public IExpression mainEval(IExpression[] expressions) {
        Map<IExpression, IExpression> map = new HashMap<>();
        
        for (int i = 0; i < expressions.length; i++) {
            ListExpression entry = (ListExpression) expressions[i];
            IExpression key = entry.elementAt(0).evaluate();
            IExpression value = entry.elementAt(1).evaluate();
            map.put(key, value);
        }

        return new DictExpression(map);
    }

    @Override
    public void checkArgs(IExpression[] expressions)
            throws WrongParameterLengthException, WrongParameterTypeException {
        for (int i = 0; i < expressions.length; i++) {
            if (!FunctionUtils.isInstanceOf(expressions[i], ListExpression.class)) {
                throw new WrongParameterTypeException(ListExpression.class, i, expressions[i].getClass());
            }
            ListExpression expression = (ListExpression) expressions[i].evaluate();
            if (expression.val().size() != 2) {
                throw new WrongParameterLengthException("Expected 2 elements at position %d, got %d elements", i, expression.val().size());
            }
        }
    }

    @Override
    public String getName() {
        return "Dict";
    }
    
}
