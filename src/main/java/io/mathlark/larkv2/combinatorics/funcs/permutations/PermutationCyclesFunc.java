package io.mathlark.larkv2.combinatorics.funcs.permutations;

import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.combinatorics.permutations.PermutationExp;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class PermutationCyclesFunc extends LarkFunction {

    public PermutationCyclesFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        PermutationExp perm;
        if (FunctionUtils.isInstanceOf(exprs[0], PermutationExp.class)) {
            perm = (PermutationExp) exprs[0].evaluate();
        }
        else {
            perm = new PermutationExp(((ListExpression) exprs[0].evaluate()).val());
        }
        return perm.cyclize();
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 element, got %d elements", exprs.length);
        }
        if (!(FunctionUtils.isInstanceOf(exprs[0], ListExpression.class) || FunctionUtils.isInstanceOf(exprs[0], PermutationExp.class))) {
            throw new WrongParameterTypeException(List.of(ListExpression.class, PermutationExp.class), 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "PermutationCycles";
    }
    
}
