package io.mathlark.larkv2.dicts.funcs;

import java.util.ArrayList;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.DictExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.BooleanExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;
import io.mathlark.larkv2.expressions.IExpression;

public class DictHasFunc extends LarkFunction {

    public DictHasFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] expressions) {
        DictExpression dict = (DictExpression) expressions[0];
        StringExpression key = (StringExpression) expressions[1];
        return new BooleanExpression(dict.map.containsKey(key));
    }

    @Override
    public void checkArgs(IExpression[] expressions) {
        if (expressions.length != 2) {
            throw new WrongParameterLengthException("Expected 2 elements, got %d elements", expressions.length);
        }
        if (!FunctionUtils.isInstanceOf(expressions[0], DictExpression.class)) {
            throw new WrongParameterTypeException(DictExpression.class, 0, expressions[0].getClass());
        }
        if (!FunctionUtils.isInstanceOf(expressions[1], StringExpression.class)) {
            throw new WrongParameterTypeException(StringExpression.class, 0, expressions[1].getClass());
        }
    }

    @Override
    public String getName() {
        return "DictHas";
    }
    
}
