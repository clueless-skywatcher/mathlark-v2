package io.mathlark.larkv2.lists.funcs;

import java.util.Arrays;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;

public class ListFunc extends LarkFunction {

    public ListFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

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
