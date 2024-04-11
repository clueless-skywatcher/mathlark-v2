package io.mathlark.larkv2.algebra.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.algebra.PolynomialExpression;
import io.mathlark.larkv2.algebra.rings.IRing;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;

public class PolyQuotRemFunc extends LarkFunction {

    public PolyQuotRemFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    @SuppressWarnings("unchecked")
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        PolynomialExpression<IRing<IExpression>, IExpression> dividend = (PolynomialExpression<IRing<IExpression>, IExpression>) exprs[0];
        PolynomialExpression<IRing<IExpression>, IExpression> divisor = (PolynomialExpression<IRing<IExpression>, IExpression>) exprs[1];

        return PolynomialExpression.quotRem(dividend, divisor);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        
    }

    @Override
    public String getName() {
        return "PolyQuotRem";
    }
    
}
