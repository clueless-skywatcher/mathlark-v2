package io.mathlark.larkv2.lists.funcs;

import java.util.ArrayList;
import java.util.List;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;

public class RestFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        ListExpression expr = (ListExpression) exprs[0].evaluate();
        List<IExpression> result = new ArrayList<>();

        for (int i = 1; i < ((Long) expr.length().val()).intValue(); i++) {
            result.add(expr.elementAt(i));
        }

        return new ListExpression(result);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 element, got %d elements", exprs.length);
        }

        if (!(exprs[0] instanceof ListExpression)) {
            throw new WrongParameterTypeException(ListExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "Rest";
    }
    
}
