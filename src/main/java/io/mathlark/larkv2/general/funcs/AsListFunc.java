package io.mathlark.larkv2.general.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.mixins.Listable;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;

public class AsListFunc extends LarkFunction {

    public AsListFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        return new ListExpression(((Listable) exprs[0]).toList());
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (!(exprs[0] instanceof Listable)) {
            throw new WrongParameterTypeException("Expected Listable at position 0");
        }
    }

    @Override
    public String getName() {
        return "AsList";
    }
    
}
