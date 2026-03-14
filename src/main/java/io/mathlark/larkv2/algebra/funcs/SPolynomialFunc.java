package io.mathlark.larkv2.algebra.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.algebra.PolynomialUtils;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;

public class SPolynomialFunc extends LarkFunction {

    public SPolynomialFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        return PolynomialUtils.sPolynomial(exprs[0], exprs[1]);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
    }

    @Override
    public String getName() {
        return "SPolynomial";
    }
    
}
