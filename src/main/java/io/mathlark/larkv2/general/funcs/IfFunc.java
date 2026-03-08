package io.mathlark.larkv2.general.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.math.BooleanExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class IfFunc extends LarkFunction {

    public IfFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        IExpression condition = exprs[0].evaluate();
        if (((BooleanExpression) condition).val) {
            return exprs[1].evaluate();
        }
        if (exprs.length == 3) {
            return exprs[2].evaluate();
        }

        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length < 2 || exprs.length > 3) {
            throw new WrongParameterLengthException("Expected 2 or 3 arguments, got %d", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], BooleanExpression.class)) {
            throw new WrongParameterTypeException("First argument must be a Boolean, got %s", exprs[0].head());
        }
    }

    @Override
    public String getName() {
        return "If";
    }

    @Override
    public boolean isLazy() {
        return true;
    }
}
