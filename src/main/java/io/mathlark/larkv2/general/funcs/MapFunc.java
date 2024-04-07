package io.mathlark.larkv2.general.funcs;

import java.util.List;
import java.util.ArrayList;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.UniversalFunctionRegistry;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.AnonFunctionExpression;
import io.mathlark.larkv2.expressions.FunctionCallExpression;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.utils.FunctionUtils;

public class MapFunc implements LarkFunction {
    @Override
    public IExpression mainEval(IExpression[] expressions) {
        ListExpression expr = (ListExpression) expressions[1];
        String funcName;
        if (expressions[0] instanceof AnonFunctionExpression) {
            funcName = ((AnonFunctionExpression) expressions[0]).getName();
        }
        else {
            funcName = ((StringExpression) expressions[0]).getVal();
        }
        
        List<IExpression> results = new ArrayList<>();
        
        for (int i = 0; i < (Integer) expr.val().size(); i++) {
            if (!FunctionUtils.isInstanceOf(expr.elementAt(i), ListExpression.class)) {
                results.add(new FunctionCallExpression(funcName, List.of(expr.elementAt(i))));
            }
            else {
                ListExpression listExpr = (ListExpression) expr.elementAt(i).evaluate();
                results.add(new FunctionCallExpression(funcName, listExpr.val()));
            }
        }

        for (int i = 0; i < results.size(); i++) {
            if (UniversalFunctionRegistry.isFunc(funcName)) {
                results.set(i, results.get(i));
            }
        }

        return new ListExpression(results);
    }

    @Override
    public void checkArgs(IExpression[] expressions) {
        if (expressions.length != 2){
            throw new WrongParameterLengthException("Expected 2 elements, got %d elements", expressions.length);
        }
        if (!FunctionUtils.isInstanceOf(expressions[1], ListExpression.class)) {
            throw new WrongParameterTypeException(ListExpression.class, 1, expressions[1].getClass());
        }
    }

    @Override
    public String getName() {
        return "Map";
    }
    
}