package io.mathlark.larkv2.general.funcs.comparison;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.general.ExpressionComparison;

public class LesserQFunc implements LarkFunction {
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        return ExpressionComparison.ltExp(exprs[0], exprs[1]);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 2) {
            throw new WrongParameterLengthException("Expected 2 arguments, got %d", exprs.length);
        }
    }

    @Override
    public String getName() {
        return "LesserQ";
    }
}
