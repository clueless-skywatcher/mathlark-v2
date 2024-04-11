package io.mathlark.larkv2.combinatorics.funcs.groups;

import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.combinatorics.group.GroupExpression;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class GroupGeneratorsFunc extends LarkFunction {

    public GroupGeneratorsFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    @SuppressWarnings("unchecked")
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        GroupExpression<IExpression> expr = (GroupExpression<IExpression>) exprs[0];
        return new ListExpression(expr.getGenerators());
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 1) {
            throw new WrongParameterLengthException("Expected 1 argument, got %d arguments", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], GroupExpression.class)) {
            throw new WrongParameterTypeException(GroupExpression.class, 0, exprs[0].getClass());
        }
    }

    @Override
    public String getName() {
        return "GroupGenerators";
    }
    
}
