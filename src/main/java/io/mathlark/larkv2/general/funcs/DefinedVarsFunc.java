package io.mathlark.larkv2.general.funcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.symbols.SymbolTables;

public class DefinedVarsFunc extends LarkFunction {

    public DefinedVarsFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        List<String> vars = SymbolTables.getLocals();
        List<IExpression> result = new ArrayList<>();

        for (String var: vars) {
            result.add(new StringExpression(var));
        }

        return new ListExpression(result);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 0) {
            throw new WrongParameterLengthException("Expected 0 arguments, got %d arguments", exprs.length);
        }
    }

    @Override
    public String getName() {
        return "DefinedVars";
    }
    
}
