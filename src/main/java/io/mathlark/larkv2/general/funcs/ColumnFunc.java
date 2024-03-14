package io.mathlark.larkv2.general.funcs;

import java.util.List;
import java.util.StringJoiner;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.utils.FunctionUtils;

public class ColumnFunc implements LarkFunction {

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        StringJoiner join = new StringJoiner("\n");
        ListExpression firstExpr = (ListExpression) exprs[0];
        for (IExpression expr: firstExpr.val()) {
            join.add(expr.toString());
        }
        return new StringExpression(join.toString());
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected %d arguments, got %d", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], ListExpression.class)) {
            throw new WrongParameterTypeException(ListExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "Column";
    }
    
}
