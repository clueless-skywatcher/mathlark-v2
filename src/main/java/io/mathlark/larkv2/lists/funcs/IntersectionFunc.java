package io.mathlark.larkv2.lists.funcs;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.lists.ListUtils;
import io.mathlark.larkv2.utils.FunctionUtils;

public class IntersectionFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        ListExpression result = new ListExpression(ListUtils.removeDuplicates(((ListExpression) exprs[0]).val()));
        for (int i = 1; i < exprs.length; i++) {
            result = ((ListExpression) exprs[i]).intersection(result);
        }
        return result;
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        for (int i = 0; i < exprs.length; i++) {
            if (!FunctionUtils.isInstanceOf(exprs[i], ListExpression.class)) {
                throw new WrongParameterTypeException(ListExpression.class, i, exprs[i].getClass());
            }
        }
    }

    @Override
    public String getName() {
        return "Intersection";
    }
    
}
