package io.mathlark.larkv2;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public interface LarkFunction {
    default IExpression evaluate(IExpression... exprs) {
        try {
            checkArgs(exprs);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return GlobalSymbols.UNDEFINED;
        }
        return mainEval(exprs);
    }

    public IExpression mainEval(IExpression[] exprs);

    public void checkArgs(IExpression[] exprs);

    public String getName();    
}
