package io.mathlark.larkv2.general.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;

public class ExitFunc extends LarkFunction {

    public ExitFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        if (exprs.length > 0) {
            System.exit(((Long) exprs[0].val()).intValue());
        }
        else {
            System.exit(0);
        }
        return null;
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length > 1) {
            throw new WrongParameterLengthException("Expected up to 1 argument, got %d arguments", exprs.length);
        }
        if (exprs.length > 0) {
            if (exprs[0] instanceof NumericExpression) {
                if (((NumericExpression) exprs[0]).isDecimal()) {
                    throw new WrongParameterTypeException("Expected status code as Integer in first argument");
                }
            }
            else {
                throw new WrongParameterTypeException(NumericExpression.class, 0, exprs[0].getClass());
            }
        }
    }

    @Override
    public String getName() {
        return "Exit";
    }
    
}
