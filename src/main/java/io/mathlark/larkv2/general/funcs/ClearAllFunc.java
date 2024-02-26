package io.mathlark.larkv2.general.funcs;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.symbols.SymbolTables;

public class ClearAllFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        SymbolTables.clear();
        return new StringExpression("Cleared all variables");
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 0) {
            throw new WrongParameterLengthException("Expected 0 arguments, got %d arguments", exprs.length);
        }
    }

    @Override
    public String getName() {
        return "ClearAll";
    }
    
}
