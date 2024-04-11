package io.mathlark.larkv2.lists.funcs;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

/**
 * ElementAt(List l, Numeric n)
 * -----------------
 * Internal Java Class Name: ElementAtFunc
 * 
 * Access the n-th element of list l. (0-indexed elements)
 * Same as using l{n}
 * 
 * Examples:
 * >> a = List(1, 2, 3)
 * [1, 2, 3]
 * >> ElementAt(a, 0)
 * 1
 * >> ElementAt(List(a, 2.5, False), 2)
 * False
 */
public class ElementAtFunc extends LarkFunction {
    public ElementAtFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public IExpression mainEval(IExpression[] expressions) {
        ListExpression expr = (ListExpression) expressions[0].evaluate();
        NumericExpression pos = (NumericExpression) expressions[1].evaluate();

        return expr.elementAt(pos);
    }

    @Override
    public void checkArgs(IExpression[] expressions) {
        if (expressions.length != 2) {
            throw new WrongParameterLengthException("Expected 2 elements, got %d elements", expressions.length);
        }
        if (!FunctionUtils.isInstanceOf(expressions[0], ListExpression.class)) {
            throw new WrongParameterTypeException("Expected ListExpression at position 0, got %s", expressions[0].getClass().getName());
        }
        if (!FunctionUtils.isInstanceOf(expressions[1], NumericExpression.class)) {
            throw new WrongParameterTypeException("Expected NumericExpression at position 1, got %s", expressions[0].getClass().getName());
        }
    }

    @Override
    public String getName() {
        return "ElementAt";
    }
    
}