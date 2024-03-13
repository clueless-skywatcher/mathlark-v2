package io.mathlark.larkv2.combinatorics.funcs.groups;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.combinatorics.group.GroupExpression;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.utils.FunctionUtils;

public class GroupIdentityFunc implements LarkFunction {

    @SuppressWarnings("unchecked")
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        GroupExpression<IExpression> group = (GroupExpression<IExpression>) exprs[0];
        return group.getIdentity();
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 argument, got %d arguments", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], GroupExpression.class)) {
            throw new WrongParameterTypeException(GroupExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "GroupIdentity";
    }
    
}
