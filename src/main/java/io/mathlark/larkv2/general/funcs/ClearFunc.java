package io.mathlark.larkv2.general.funcs;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.symbols.SymbolTables;

public class ClearFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        StringExpression expr = (StringExpression) exprs[0];
        SymbolTables.clear(expr.getVal());
        return new StringExpression("Cleared variable " + expr.toString());
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 argument, got %d", exprs.length);
        }
    }

    @Override
    public String getName() {
        return "Clear";
    }
    
}
