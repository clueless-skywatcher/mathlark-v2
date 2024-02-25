package io.mathlark.larkv2;

import io.mathlark.larkv2.expressions.IExpression;

public interface LarkFunction {
    default IExpression evaluate(IExpression... exprs) {
        checkArgs(exprs);
        return mainEval(exprs);
    }

    public IExpression mainEval(IExpression[] exprs);

    public void checkArgs(IExpression[] exprs);

    public String getName();    
}
