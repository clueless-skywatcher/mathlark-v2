package io.mathlark.larkv2.lists.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;

public class FirstFunc extends LarkFunction {

    public FirstFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        return ((ListExpression) exprs[0]).elementAt(0);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 element, got %d elements", exprs.length);
        }

        if (!(exprs[0] instanceof ListExpression)) {
            throw new WrongParameterTypeException(ListExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "First";
    }
    
}
