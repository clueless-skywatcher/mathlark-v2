package io.mathlark.larkv2.numbers.functions;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.utils.MathUtils;

public class GCDFunc implements LarkFunction {

    @Override
    public String getName() {
        return "GCD";
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        NumericExpression v1 = (NumericExpression) exprs[0];
        NumericExpression v2 = (NumericExpression) exprs[1];

        return new NumericExpression(MathUtils.gcd(v1.value.longValue(), v2.value.longValue()));
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 2) {
            throw new WrongParameterLengthException("Expected 2 arguments, got %d", exprs.length);
        }
    }
    
}
