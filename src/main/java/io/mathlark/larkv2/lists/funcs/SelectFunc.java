package io.mathlark.larkv2.lists.funcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.AnonFunctionExpression;
import io.mathlark.larkv2.expressions.FunctionCallExpression;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.BooleanExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class SelectFunc extends LarkFunction {

    public SelectFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        ListExpression list = (ListExpression) exprs[0];
        String funcName;
        if (exprs[1] instanceof AnonFunctionExpression) {
            funcName = ((AnonFunctionExpression) exprs[1]).getName();
        } else {
            funcName = ((StringExpression) exprs[1]).getVal();
        }

        List<IExpression> finalList = new ArrayList<>();

        for (int i = 0; i < list.toList().size(); i++) {
            IExpression element = list.elementAt(i);
            IExpression funcCall;
            if (scope != null && funcs != null) {
                funcCall = new FunctionCallExpression(funcName, List.of(element), scope, funcs);
            } else {
                funcCall = new FunctionCallExpression(funcName, List.of(element));
            }

            if (funcCall.evaluate() instanceof BooleanExpression b) {
                if (b.val) {
                    finalList.add(element);
                }
            }
        }

        return new ListExpression(finalList);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 2) {
            throw new WrongParameterLengthException("Expected 2 elements, got %d elements", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], ListExpression.class)) {
            throw new WrongParameterTypeException(ListExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "Select";
    }

}
