package io.mathlark.larkv2.expressions;

import java.util.List;
import java.util.ArrayList;

import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.lists.ListUtils;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class ListExpression implements IExpression {
    private List<IExpression> val;

    public ListExpression(List<IExpression> exprs) {
        this.val = exprs;
    }

    @Override
    public IExpression evaluate() {
        List<IExpression> evalExpressions = new ArrayList<>();
        for (IExpression expr : val) {
            evalExpressions.add(expr.evaluate());
        }
        this.val = evalExpressions;
        return new ListExpression(this.val);
    }

    public IExpression elementAt(NumericExpression expr) {
        try {
            if (expr instanceof NumericExpression) {
                if (!expr.isDecimal()) {
                    int idx = ((Long) expr.val()).intValue();
                    if (idx < 0) {
                        return this.val.get(this.val.size() + idx);
                    }
                    return this.val.get(idx);
                }
            }
            else if (expr.evaluate() instanceof NumericExpression) {
                NumericExpression eval = (NumericExpression) expr.evaluate();
                if (!eval.isDecimal()) {
                    int idx = eval.value.intValue();
                    if (idx < 0) {
                        return this.val.get(this.val.size() + idx);
                    }
                    return this.val.get(idx);
                }
            }
        } catch(Exception e) {
            System.out.println(String.format("Invalid index %s for list of length %d", expr.toString(), val.size()));
        }
        return GlobalSymbols.UNDEFINED;
    }

    public IExpression elementAt(int idx) {
        return elementAt(new NumericExpression((long) idx));
    }

    @Override
    public String inputForm() {
        String elems = toString().substring(1, toString().length() - 1);
        return String.format("List(%s)", elems);
    }

    @Override
    public IExpression add(IExpression other) {
        List<IExpression> thisList = this.val;
        IExpression otherExp = other.evaluate();
        if (otherExp instanceof ListExpression) {
            List<IExpression> otherList = ((ListExpression) otherExp).val;
            thisList.addAll(otherList);
        }
        else {
            thisList.add(otherExp);
        }
        return new ListExpression(thisList);
    }

    public IExpression length() {
        return new NumericExpression(this.val.size());
    }

    @Override
    public IExpression sub(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression mul(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression negate() {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression pow(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression div(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression mod(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public StringExpression head() {
        return new StringExpression("List");
    }

    @Override
    public List<IExpression> val() {
        return this.val;
    }

    public String toString() {
        return val.toString();
    }

    public boolean equals(Object other) {
        if (other instanceof ListExpression) {
            List<IExpression> otherList = ((ListExpression) other).val;
            return this.val.equals(otherList);
        }
        else if (other instanceof List) {
            return this.val.equals(other);
        }
        return false;
    }

    public ListExpression append(IExpression expression) {
        List<IExpression> result = this.val;
        result.add(expression);
        return new ListExpression(result);
    }

    public ListExpression extend(ListExpression expression) {
        List<IExpression> result = this.val;
        result.addAll(expression.val);
        return new ListExpression(result);
    }

    public int hashCode() {
        return this.val.hashCode();
    }

    public ListExpression intersection(ListExpression other) {
        List<IExpression> list1 = ListUtils.removeDuplicates(this.val);
        List<IExpression> list2 = ListUtils.removeDuplicates(other.val);
        return new ListExpression(ListUtils.intersection(list1, list2));
    }

    public ListExpression union(ListExpression other) {
        List<IExpression> list1 = ListUtils.removeDuplicates(this.val);
        List<IExpression> list2 = ListUtils.removeDuplicates(other.val);
        return new ListExpression(ListUtils.union(list1, list2));
    }
}
