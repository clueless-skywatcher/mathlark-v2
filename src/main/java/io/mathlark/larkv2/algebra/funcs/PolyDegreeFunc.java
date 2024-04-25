package io.mathlark.larkv2.algebra.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.algebra.PolynomialExpression;
import io.mathlark.larkv2.algebra.PolynomialUtils;
import io.mathlark.larkv2.algebra.rings.IRing;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.symbols.SymbolScope;

public class PolyDegreeFunc extends LarkFunction {

    public PolyDegreeFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    @SuppressWarnings("unchecked")
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        PolynomialExpression<IRing<IExpression>, IExpression> symbol = (PolynomialExpression<IRing<IExpression>, IExpression>) exprs[1];
        if (PolynomialUtils.isFreeOf(exprs[0], symbol)) {
            return GlobalSymbols.ZERO;
        }
        PolynomialExpression<IRing<IExpression>, IExpression> poly = (PolynomialExpression<IRing<IExpression>, IExpression>) exprs[0];
        return poly.degree(symbol);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        
    }

    @Override
    public String getName() {
        return "PolyDegree";
    }
    
}
