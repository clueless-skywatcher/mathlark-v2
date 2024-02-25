package io.mathlark.larkv2.lists.funcs;

import java.util.Arrays;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;

public class ListFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        return new ListExpression(Arrays.asList(exprs)).evaluate();
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
    }

    @Override
    public String getName() {
        return "List";
    }
    
}
