package io.mathlark.larkv2.general.funcs;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.expressions.IExpression;

public class HeadFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        return exprs[0].head();
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 argument, got %d", exprs.length);
        }
    }

    @Override
    public String getName() {
        return "Head";
    }
    
}
