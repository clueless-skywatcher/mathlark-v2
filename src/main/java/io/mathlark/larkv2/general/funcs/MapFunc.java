package io.mathlark.larkv2.general.funcs;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.UniversalFunctionRegistry;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.AnonFunctionExpression;
import io.mathlark.larkv2.expressions.FunctionCallExpression;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.LambdaExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class MapFunc extends LarkFunction {
    public MapFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] expressions) {
        ListExpression expr = (ListExpression) expressions[1];

        if (expressions[0] instanceof LambdaExpression lambda) {
            List<IExpression> results = new ArrayList<>();
            for (int i = 0; i < (Integer) expr.val().size(); i++) {
                results.add(lambda.invoke(List.of(expr.elementAt(i))));
            }
            return new ListExpression(results);
        }

        String funcName;
        if (expressions[0] instanceof AnonFunctionExpression) {
            funcName = ((AnonFunctionExpression) expressions[0]).getName();
        }
        else {
            funcName = ((StringExpression) expressions[0]).getVal();
        }

        List<IExpression> results = new ArrayList<>();

        for (int i = 0; i < (Integer) expr.val().size(); i++) {
            IExpression funcCall;
            if (scope != null && funcs != null) {
                funcCall = new FunctionCallExpression(funcName, List.of(expr.elementAt(i)), scope, funcs);
            }
            else {
                funcCall = new FunctionCallExpression(funcName, List.of(expr.elementAt(i)));
            }
            results.add(funcCall);
        }

        for (int i = 0; i < results.size(); i++) {
            if (UniversalFunctionRegistry.isFunc(funcName)) {
                results.set(i, results.get(i).evaluate());
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