package io.mathlark.larkv2.lists.funcs;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.expressions.IExpression;

public class LengthFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        return exprs[0].length();
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 element, got %d elements", exprs.length);
        }
    }

    @Override
    public String getName() {
        return "Length";
    }
    
}
