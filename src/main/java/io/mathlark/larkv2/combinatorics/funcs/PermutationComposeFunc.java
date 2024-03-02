package io.mathlark.larkv2.combinatorics.funcs;

import java.util.List;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.combinatorics.permutations.PermutationExp;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.utils.FunctionUtils;

public class PermutationComposeFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        PermutationExp perm;
        if (FunctionUtils.isInstanceOf(exprs[0], ListExpression.class)) {
            perm = new PermutationExp(((ListExpression) exprs[0]).val());
        }
        else {
            perm = (PermutationExp) exprs[0];
        }
        for (int i = 1; i < exprs.length; i++) {
            if (FunctionUtils.isInstanceOf(exprs[i], PermutationExp.class)) {
                perm = (PermutationExp) perm.mul((PermutationExp) exprs[i].evaluate());
            }
            else {
                PermutationExp mul = new PermutationExp(((ListExpression) exprs[i].evaluate()).val());
                perm = (PermutationExp) perm.mul(mul);
            }
        }
        return perm;
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        for (int i = 0; i < exprs.length; i++) {
            if (!(FunctionUtils.isInstanceOf(exprs[i], ListExpression.class) || FunctionUtils.isInstanceOf(exprs[i], PermutationExp.class))) {
                throw new WrongParameterTypeException(List.of(ListExpression.class, PermutationExp.class), 0, exprs[i].getClass());
            }
        }
    }

    @Override
    public String getName() {
        return "PermutationCompose";
    }
    
}
