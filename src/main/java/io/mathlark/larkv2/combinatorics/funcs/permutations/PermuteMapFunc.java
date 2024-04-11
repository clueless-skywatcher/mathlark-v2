package io.mathlark.larkv2.combinatorics.funcs.permutations;

import java.util.ArrayList;
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

public class PermuteMapFunc extends LarkFunction {
    public PermuteMapFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    /**
     * Maps a single integer, or a list of integers, according to a given
     * permutation. The integers must lie in the range 1 to n, n being the
     * length of the permutation
     * >> PermuteMap(2, Permutation([1, 3, 2, 4]))
     * 3
     * >> PermuteMap(1, Permutation([1, 3, 2, 4]))
     * 1
     */
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        PermutationExp p = ((PermutationExp) exprs[1]);
        if (FunctionUtils.isInstanceOf(exprs[0], NumericExpression.class)) {
            Long n = ((NumericExpression) exprs[0].evaluate()).value.longValue();
            return p.permuteMap(n);
        }
        else {
            List<IExpression> l = ((ListExpression) exprs[0]).val();
            List<IExpression> result = new ArrayList<>();

            for (IExpression expr: l) {
                if (!(expr.evaluate().val() instanceof Long)) {
                    throw new WrongParameterTypeException("Expected a List of integer values");
                }
                Long n = ((NumericExpression) expr.evaluate()).value.longValue();
                result.add(p.permuteMap(n));
            }

            return new ListExpression(result);
        }
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 2) {
            throw new WrongParameterLengthException("Expected 2 arguments, got %d", exprs.length);
        }
        
        if (FunctionUtils.isInstanceOf(exprs[0], NumericExpression.class)) {
            if (!(exprs[0].evaluate().val() instanceof Long)) {
                throw new WrongParameterTypeException(List.of(Long.class, ListExpression.class), 0, exprs[0].evaluate().val().getClass());
            }
        }
        else {
            if (!FunctionUtils.isInstanceOf(exprs[0], ListExpression.class)) {
                throw new WrongParameterTypeException(List.of(Long.class, ListExpression.class), 0, exprs[0].evaluate().val().getClass());
            }
        }

        if (!FunctionUtils.isInstanceOf(exprs[1], PermutationExp.class)) {
            throw new WrongParameterTypeException(PermutationExp.class, 1, exprs[1].getClass());
        }
    }

    @Override
    public String getName() {
        return "PermuteMap";
    }
    
}
