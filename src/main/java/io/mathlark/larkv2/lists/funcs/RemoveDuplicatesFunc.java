package io.mathlark.larkv2.lists.funcs;

import java.util.List;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.lists.ListUtils;

public class RemoveDuplicatesFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        List<IExpression> exprList = ((ListExpression) exprs[0]).val();
        return new ListExpression(ListUtils.removeDuplicates(exprList));
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
        return "RemoveDuplicates";
    }
    
}
