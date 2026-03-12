package io.mathlark.larkv2.general.funcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class TableFunc extends LarkFunction {

    public TableFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    private record RangeSpec(Number start, Number end, Number step, boolean useDouble) {}

    private RangeSpec parseRange(ListExpression range) {
        Number start, end, step;
        if (range.val().size() == 1) {
            NumericExpression n = (NumericExpression) range.val().get(0);
            NumericExpression nMinus1 = (NumericExpression) n.sub(new NumericExpression(1L));
            start = new NumericExpression(0L).value;
            end = nMinus1.value;
            step = new NumericExpression(1L).value;
        } else if (range.val().size() == 2) {
            start = ((NumericExpression) range.val().get(0)).value;
            end = ((NumericExpression) range.val().get(1)).value;
            step = 1L;
        } else {
            start = ((NumericExpression) range.val().get(0)).value;
            end = ((NumericExpression) range.val().get(1)).value;
            step = ((NumericExpression) range.val().get(2)).value;
        }
        boolean useDouble = start instanceof Double || end instanceof Double || step instanceof Double;
        return new RangeSpec(start, end, step, useDouble);
    }

    private IExpression invokeFunc(IExpression func, List<IExpression> args) {
        if (func instanceof LambdaExpression lambda) {
            return lambda.invoke(args);
        }

        String funcName;
        if (func instanceof AnonFunctionExpression anon) {
            funcName = anon.getName();
        } else {
            funcName = ((StringExpression) func).getVal();
        }

        FunctionCallExpression funcCall;
        if (scope != null && funcs != null) {
            funcCall = new FunctionCallExpression(funcName, args, scope, funcs);
        } else {
            funcCall = new FunctionCallExpression(funcName, args);
        }

        if (UniversalFunctionRegistry.isFunc(funcName)) {
            return funcCall.evaluate();
        }
        return funcCall;
    }

    private IExpression buildTable(IExpression func, List<ListExpression> ranges, int rangeIndex, List<IExpression> accArgs) {
        if (rangeIndex >= ranges.size()) {
            return invokeFunc(func, accArgs);
        }

        RangeSpec spec = parseRange(ranges.get(rangeIndex));
        List<IExpression> results = new ArrayList<>();

        if (spec.useDouble) {
            double s = spec.start.doubleValue();
            double e = spec.end.doubleValue();
            double st = spec.step.doubleValue();
            if (s <= e && st > 0) {
                for (double i = s; i <= e; i += st) {
                    List<IExpression> nextArgs = new ArrayList<>(accArgs);
                    nextArgs.add(new NumericExpression(i));
                    results.add(buildTable(func, ranges, rangeIndex + 1, nextArgs));
                }
            } else if (s >= e && st < 0) {
                for (double i = s; i >= e; i += st) {
                    List<IExpression> nextArgs = new ArrayList<>(accArgs);
                    nextArgs.add(new NumericExpression(i));
                    results.add(buildTable(func, ranges, rangeIndex + 1, nextArgs));
                }
            }
        } else {
            long s = spec.start.longValue();
            long e = spec.end.longValue();
            long st = spec.step.longValue();
            if (s <= e && st > 0) {
                for (long i = s; i <= e; i += st) {
                    List<IExpression> nextArgs = new ArrayList<>(accArgs);
                    nextArgs.add(new NumericExpression(i));
                    results.add(buildTable(func, ranges, rangeIndex + 1, nextArgs));
                }
            } else if (s >= e && st < 0) {
                for (long i = s; i >= e; i += st) {
                    List<IExpression> nextArgs = new ArrayList<>(accArgs);
                    nextArgs.add(new NumericExpression(i));
                    results.add(buildTable(func, ranges, rangeIndex + 1, nextArgs));
                }
            }
        }

        return new ListExpression(results);
    }

    @Override
    public IExpression mainEval(IExpression[] exprs) {
        IExpression func = exprs[0];
        List<ListExpression> ranges = new ArrayList<>();
        for (int i = 1; i < exprs.length; i++) {
            ranges.add((ListExpression) exprs[i]);
        }
        return buildTable(func, ranges, 0, new ArrayList<>());
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length < 2) {
            throw new WrongParameterLengthException("Expected at least 2 arguments, got %d", exprs.length);
        }

        IExpression func = exprs[0];
        if (!(func instanceof LambdaExpression)
                && !(func instanceof StringExpression)
                && !(func instanceof AnonFunctionExpression)) {
            throw new WrongParameterTypeException(
                "First argument must be a function or lambda, got %s", func.head().val());
        }

        for (int i = 1; i < exprs.length; i++) {
            if (!FunctionUtils.isInstanceOf(exprs[i], ListExpression.class)) {
                throw new WrongParameterTypeException(ListExpression.class, i, exprs[i].getClass());
            }
            ListExpression range = (ListExpression) exprs[i];
            int size = range.val().size();
            if (size < 1 || size > 3) {
                throw new WrongParameterLengthException(
                    "Range at position %d must have 1 to 3 elements, got %d", i, size);
            }
            for (int j = 0; j < size; j++) {
                if (!FunctionUtils.isInstanceOf(range.val().get(j), NumericExpression.class)) {
                    throw new WrongParameterTypeException(
                        "Range element at position %d must be Numeric, got %s",
                        j, range.val().get(j).head().val());
                }
            }
        }
    }

    @Override
    public String getName() {
        return "Table";
    }
}
