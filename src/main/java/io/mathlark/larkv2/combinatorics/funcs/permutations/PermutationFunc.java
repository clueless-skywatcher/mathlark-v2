package io.mathlark.larkv2.combinatorics.funcs.permutations;

import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.combinatorics.permutations.PermutationExp;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class PermutationFunc extends LarkFunction {

    public PermutationFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        if (FunctionUtils.isInstanceOf(exprs[0], ListExpression.class)) {
            return new PermutationExp(((ListExpression) exprs[0].evaluate()).val());
        }
        return new PermutationExp((NumericExpression) exprs[0].evaluate());
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 argument, got %d", exprs.length);
        }
        if (FunctionUtils.isInstanceOf(exprs[0], NumericExpression.class)) {
            if (((NumericExpression) exprs[0]).isDecimal()) {
                throw new WrongParameterTypeException("Expected integer parameter at position 0");
            }
        }
        if (!(FunctionUtils.isInstanceOf(exprs[0], NumericExpression.class) || FunctionUtils.isInstanceOf(exprs[0], ListExpression.class))) {
            throw new WrongParameterTypeException(List.of(NumericExpression.class, ListExpression.class), 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "Permutation";
    }
    
}
