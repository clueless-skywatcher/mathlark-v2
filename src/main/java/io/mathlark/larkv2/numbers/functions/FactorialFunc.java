package io.mathlark.larkv2.numbers.functions;

import java.util.HashMap;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.utils.FunctionUtils;

public class FactorialFunc implements LarkFunction {
    private Map<Long, Long> facts = new HashMap<>();

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        NumericExpression expr = (NumericExpression) exprs[0];
        long factorial = factorial(expr.value.longValue());
        return new NumericExpression(factorial);
    }

    private long factorial(long n) {
        if (n == 0) {
            return 1L;
        }
        if (n == 1) {
            return 1L;
        }

        if (!facts.containsKey(n)) {
            facts.put(n, n * factorial(n - 1));
        }
        return facts.get(n);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 argument, got %d", exprs.length);
        }

        if (!FunctionUtils.isInstanceOf(exprs[0], NumericExpression.class)) {
            throw new WrongParameterTypeException(NumericExpression.class, 0, exprs[0].getClass());
        }
        if (((NumericExpression) exprs[0]).isDecimal()) {
            throw new WrongParameterTypeException("Expected integer at position 0");
        }
        if (((NumericExpression) exprs[0]).isNegative()) {
            throw new WrongParameterTypeException("Expected a non-negative integer");
        }
    }

    @Override
    public String getName() {
        return "Factorial";
    }
    
}
