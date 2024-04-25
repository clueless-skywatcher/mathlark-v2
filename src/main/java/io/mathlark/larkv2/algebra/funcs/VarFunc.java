package io.mathlark.larkv2.algebra.funcs;

import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.algebra.MonomialExpression;
import io.mathlark.larkv2.algebra.PolynomialExpression;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class VarFunc extends LarkFunction {

    public VarFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        MonomialExpression monomial = new MonomialExpression(Map.of(
            exprs[0].toString(), GlobalSymbols.ONE
        ));
        return new PolynomialExpression<>(List.of(monomial), List.of(GlobalSymbols.ONE));
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 argument but got %d", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], StringExpression.class)) {
            throw new WrongParameterTypeException(StringExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "Var";
    }
    
}
