package io.mathlark.larkv2.general.funcs.comparison;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.math.BooleanExpression;
import io.mathlark.larkv2.general.ExpressionComparison;
import io.mathlark.larkv2.utils.FunctionUtils;

public class NotQFunc implements LarkFunction {
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        return ExpressionComparison.notExp(exprs[0]);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 argument, got %d", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], BooleanExpression.class)) {
            throw new WrongParameterTypeException(BooleanExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "NotQ";
    }
}
