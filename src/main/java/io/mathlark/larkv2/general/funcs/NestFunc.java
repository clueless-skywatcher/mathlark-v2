package io.mathlark.larkv2.general.funcs;

import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.FunctionCallExpression;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.LambdaExpression;
import io.mathlark.larkv2.numbers.functions.IntQFunc;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;

public class NestFunc extends LarkFunction {

    public NestFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        IExpression result = exprs[1];
        int nest = ((Long) exprs[2].val()).intValue();

        if (exprs[0] instanceof LambdaExpression lambda) {
            while (nest-- > 0) {
                result = lambda.invoke(List.of(result));
            }
            return result;
        }

        String funcName = (String) exprs[0].val();
        while (nest-- > 0) {
            result = new FunctionCallExpression(funcName, List.of(result)).evaluate();
        }

        return result;
    }

    @Override
    public void checkArgs(IExpression[] expressions) {
        if (expressions.length != 3) {
            throw new WrongParameterLengthException("Expected 3 arguments, got %d", expressions.length);
        }

        LarkFunction intQFunc = new IntQFunc(this.scope, this.funcs);

        if (intQFunc.evaluate(expressions[2]).val().equals("False")) {
            throw new WrongParameterTypeException("Expected integer in position 1");
        }
    }

    @Override
    public String getName() {
        return "Nest";
    }
    
}
