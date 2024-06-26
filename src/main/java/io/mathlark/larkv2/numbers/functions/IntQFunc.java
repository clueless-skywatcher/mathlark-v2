package io.mathlark.larkv2.numbers.functions;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.math.BooleanExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class IntQFunc extends LarkFunction {

    public IntQFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        if (FunctionUtils.isInstanceOf(exprs[0], NumericExpression.class)) {
            Number val = ((NumericExpression) exprs[0]).value;
            if (val instanceof Long) {
                return new BooleanExpression(true);
            }
        }

        return new BooleanExpression(false);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 element, got %d elements", exprs.length);
        }
    }

    @Override
    public String getName() {
        return "IntQ";
    }
    
}
