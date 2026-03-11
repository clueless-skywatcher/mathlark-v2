package io.mathlark.larkv2.lists.funcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class FlattenFunc extends LarkFunction {

    public FlattenFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        ListExpression lst = (ListExpression) exprs[0];
        return new ListExpression(flatten(lst));
    }

    private static List<IExpression> flatten(ListExpression lst) {
        List<IExpression> flattened = new ArrayList<>();
        for (int i = 0; i < lst.toList().size(); i++) {
            if (lst.elementAt(i) instanceof ListExpression) {
                flattened.addAll(flatten((ListExpression) lst.elementAt(i)));
            }
            else {
                flattened.add(lst.elementAt(i));
            }
        }
        return flattened;
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 element, got %d elements", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], ListExpression.class)) {
            throw new WrongParameterTypeException(ListExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "Flatten";
    }

}
