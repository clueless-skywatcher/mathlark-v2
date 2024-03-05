package io.mathlark.larkv2.combinatorics.funcs;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.combinatorics.permutations.Permutations;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.utils.FunctionUtils;

public class CyclesToListFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        ListExpression cycles = ((ListExpression) exprs[0]);
        if (exprs.length == 2) {
            return Permutations.cycleToPerm(cycles, (NumericExpression) exprs[1]);
        }
        return Permutations.cycleToPerm(cycles);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length > 2) {
            throw new WrongParameterLengthException("Expected up to 2 arguments, got %d", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], ListExpression.class)) {
            throw new WrongParameterTypeException(ListExpression.class, 0, exprs[0].getClass());
        }
        if (exprs.length == 2) {
            if (!FunctionUtils.isInstanceOf(exprs[1], NumericExpression.class)) {
                throw new WrongParameterTypeException(NumericExpression.class, 0, exprs[1].getClass());
            }
        }
    }

    @Override
    public String getName() {
        return "CyclesToList";
    }
    
}
