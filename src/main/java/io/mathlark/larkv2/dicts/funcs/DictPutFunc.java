package io.mathlark.larkv2.dicts.funcs;

import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.DictExpression;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class DictPutFunc extends LarkFunction {

    public DictPutFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] expressions) {
        IExpression key = (IExpression) expressions[1];
        IExpression value = expressions[2];
        DictExpression dict = (DictExpression) expressions[0];
        System.out.println("DEBUG DictPut before: map=" + dict.map + " identity=" + System.identityHashCode(dict));
        dict.map.put(key, value);
        System.out.println("DEBUG DictPut after: map=" + dict.map + " identity=" + System.identityHashCode(dict));
        return value;
    }

    @Override
    public void checkArgs(IExpression[] expressions) {
        System.out.println("DEBUG checkArgs: length=" + expressions.length);
        for (int i = 0; i < expressions.length; i++) {
            System.out.println("DEBUG arg[" + i + "]=" + expressions[i] + " class=" + expressions[i].getClass().getSimpleName());
        }
        if (expressions.length != 3) {
            throw new WrongParameterLengthException("Expected 3 elements, got %d elements", expressions.length);
        }
        if (!FunctionUtils.isInstanceOf(expressions[0], DictExpression.class)) {
            throw new WrongParameterTypeException(DictExpression.class, 0, expressions[0].getClass());
        }
        if (!(FunctionUtils.isInstanceOf(expressions[1], StringExpression.class) ||
            FunctionUtils.isInstanceOf(expressions[1], NumericExpression.class))) {
            throw new WrongParameterTypeException(List.of(NumericExpression.class, StringExpression.class), 1, expressions[1].getClass());
        }
    }

    @Override
    public String getName() {
        return "DictPut";
    }
}
