package io.mathlark.larkv2.expressions;

import java.util.List;
import java.util.ArrayList;

import io.mathlark.larkv2.expressions.math.NumericExpression;
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

    public IExpression elementAt(NumericExpression idx) {
        return this.val.get(((Long) idx.value).intValue());
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
    public Object val() {
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
}
