package io.mathlark.larkv2.lists.funcs;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class RangeFunc extends LarkFunction {
    public RangeFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
        //TODO Auto-generated constructor stub
    }

    /**
     *  Range(n) = [1, 2, ..., n]
     *  Range(n1, n2) = [n1, n1 + 1, n1 + 2, ..., n2]
     *  Range(n1, n2, x) = [n1, n1 + x, n1 + 2x, ..., upto n2]
     *  Range(n1, n2, -1) = [n2, n2 - 1, n2 - 2, ..., n1]
     */
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        Number rBegin = 1;
        Number rEnd = 0;
        Number rStep = 1;

        if (exprs.length == 1) {
            rBegin = 1;
            rEnd = ((NumericExpression) exprs[0]).value;
        }
        else if (exprs.length >= 2) {
            rBegin = ((NumericExpression) exprs[0]).value;
            rEnd = ((NumericExpression) exprs[1]).value;
            if (exprs.length == 3) {
                rStep = ((NumericExpression) exprs[2]).value;
            }
        }
        List<IExpression> result;
        if (rBegin instanceof Double || rEnd instanceof Double || rStep instanceof Double) {
            result = evalWithDouble(rBegin.doubleValue(), rEnd.doubleValue(), rStep.doubleValue());
        }
        else {
            result = evalWithLong(rBegin.longValue(), rEnd.longValue(), rStep.longValue());
        }

        return new ListExpression(result);
    }

    private List<IExpression> evalWithLong(long rBegin, long rEnd, long rStep) {
        if (rBegin == rEnd) {
            return List.of(new NumericExpression(rBegin));
        }
        if (rBegin > rEnd && rStep >= 0) {
            return List.of();
        }
        else if (rBegin < rEnd && rStep < 0) {
            return List.of();
        }
        else {
            List<IExpression> result = new ArrayList<>();
            if (rBegin >= rEnd) {
                for (long i = rBegin; i >= rEnd; i += rStep) {
                    result.add(new NumericExpression(i));
                }
            }
            else {
                for (long i = rBegin; i <= rEnd; i += rStep) {
                    result.add(new NumericExpression(i));
                }
            }
            return result;
        }
    }

    private List<IExpression> evalWithDouble(double rBegin, double rEnd, double rStep) {
        if (rBegin == rEnd) {
            return List.of(new NumericExpression(rBegin));
        }
        if (rBegin > rEnd && rStep >= 0) {
            return List.of();
        }
        else if (rBegin < rEnd && rStep < 0) {
            return List.of();
        }
        else {
            List<IExpression> result = new ArrayList<>();
            if (rBegin >= rEnd) {
                for (double i = rBegin; i >= rEnd; i += rStep) {
                    result.add(new NumericExpression(i));
                }
            }
            else {
                for (double i = rBegin; i <= rEnd; i += rStep) {
                    result.add(new NumericExpression(i));
                }
            }
            return result;
        }
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (!List.of(1, 2, 3).contains(exprs.length)) {
            throw new WrongParameterLengthException("Expected 1, 2, or 3 elements, got %d elements", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], NumericExpression.class)) {
            throw new WrongParameterTypeException(NumericExpression.class, 0, exprs[0].getClass());
        }
        if (exprs.length == 2) {
            if (!FunctionUtils.isInstanceOf(exprs[1], NumericExpression.class)) {
                throw new WrongParameterTypeException(NumericExpression.class, 1, exprs[1].getClass());
            }
        }
        if (exprs.length == 3) {
            if (!FunctionUtils.isInstanceOf(exprs[2], NumericExpression.class)) {
                throw new WrongParameterTypeException(NumericExpression.class, 2, exprs[2].getClass());
            }
        }
    }

    @Override
    public String getName() {
        return "Range";
    }
    
}
