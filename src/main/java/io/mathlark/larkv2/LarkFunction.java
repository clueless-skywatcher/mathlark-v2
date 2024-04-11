package io.mathlark.larkv2;

import java.util.Map;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.symbols.SymbolScope;

public abstract class LarkFunction {
    protected SymbolScope scope;
    protected Map<String, DefinedFunction> funcs;

    public LarkFunction(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        this.scope = scope;
        this.funcs = funcs;
    }

    public IExpression evaluate(IExpression... exprs) {
        try {
            checkArgs(exprs);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return GlobalSymbols.UNDEFINED;
        }
        return mainEval(exprs);
    }

    public abstract IExpression mainEval(IExpression[] exprs);

    public abstract void checkArgs(IExpression[] exprs);

    public abstract String getName();    
}
