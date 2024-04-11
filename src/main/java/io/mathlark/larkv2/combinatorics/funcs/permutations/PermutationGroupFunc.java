package io.mathlark.larkv2.combinatorics.funcs.permutations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.combinatorics.permutations.PermutationExp;
import io.mathlark.larkv2.combinatorics.permutations.PermutationGroupExp;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class PermutationGroupFunc extends LarkFunction {

    public PermutationGroupFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        ListExpression first = (ListExpression) exprs[0];
        List<PermutationExp> gens = first.val().stream()
            .map(x -> (PermutationExp) x)
            .collect(Collectors.toList());

        return new PermutationGroupExp(gens);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 argument, got %d arguments", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], ListExpression.class)) {
            throw new WrongParameterTypeException(ListExpression.class, 0, exprs[0].getClass());
        }

        ListExpression first = (ListExpression) exprs[0].evaluate();

        for (int i = 0; i < first.val().size(); i++) {
            if (!FunctionUtils.isInstanceOf(first.elementAt(i).evaluate(), PermutationExp.class)) {
                throw new WrongParameterTypeException(PermutationExp.class, i, first.elementAt(i).evaluate().getClass());
            }
        }
    }

    @Override
    public String getName() {
        return "PermutationGroup";
    }
    
}
