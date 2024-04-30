package io.mathlark.larkv2.algebra.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.algebra.PolynomialExpression;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class MonomialsFunc extends LarkFunction {

    public MonomialsFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        PolynomialExpression expr = (PolynomialExpression) exprs[0];
        return new ListExpression(expr.getMonomialsWithCoeffs());
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length > 2 || exprs.length == 0) {
            throw new WrongParameterLengthException("Expected up to 2 elements, got %d elements", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], PolynomialExpression.class)) {
            throw new WrongParameterTypeException(PolynomialExpression.class, 0, exprs[0].getClass());
        }
        if (exprs.length > 1) {
            if (!FunctionUtils.isInstanceOf(exprs[1], StringExpression.class)) {
                throw new WrongParameterTypeException(PolynomialExpression.class, 1, exprs[1].getClass());
            }
        }
    }

    @Override
    public String getName() {
        return "Monomials";
    }
    
}
