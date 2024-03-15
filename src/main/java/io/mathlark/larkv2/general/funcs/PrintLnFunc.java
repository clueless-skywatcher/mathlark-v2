package io.mathlark.larkv2.general.funcs;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;

public class PrintLnFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        System.out.println(exprs[0].toString());
        return new StringExpression("");
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 argument, got %d", exprs.length);
        }
    }

    @Override
    public String getName() {
        return "PrintLn";
    }
    
}
