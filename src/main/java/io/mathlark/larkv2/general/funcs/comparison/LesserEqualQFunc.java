package io.mathlark.larkv2.general.funcs.comparison;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.general.ExpressionComparison;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;

public class LesserEqualQFunc extends LarkFunction {
    public LesserEqualQFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        return ExpressionComparison.lteExp(exprs[0], exprs[1]);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 2) {
            throw new WrongParameterLengthException("Expected 2 arguments, got %d", exprs.length);
        }
    }

    @Override
    public String getName() {
        return "LesserEqualQ";
    }
}
