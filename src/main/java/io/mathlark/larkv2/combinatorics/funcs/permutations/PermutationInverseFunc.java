package io.mathlark.larkv2.combinatorics.funcs.permutations;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.combinatorics.permutations.PermutationExp;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class PermutationInverseFunc extends LarkFunction {

    public PermutationInverseFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        PermutationExp perm = (PermutationExp) exprs[0];
        return perm.inverse();
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected one argument, got %d arguments", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], PermutationExp.class)) {
            throw new WrongParameterTypeException(PermutationExp.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "PermutationInverse";
    }
    
}
