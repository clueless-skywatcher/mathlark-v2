package io.mathlark.larkv2.combinatorics.permutations;

import java.util.List;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.expressions.mixins.Listable;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.utils.FunctionUtils;

public class PermutationExp implements IExpression, Listable {
    private PermutationObject val;

    public PermutationExp(List<IExpression> p) {
        for (int i = 0; i < p.size(); i++) {
            p.set(i, new NumericExpression((Long) p.get(i).val()).sub(GlobalSymbols.ONE));
        }
        this.val = new PermutationObject(p);
    }

    public PermutationExp(PermutationObject val) {
        this.val = val;
    }

    public PermutationExp(Long n) {
        this.val = new PermutationObject(n.intValue());
    }

    public PermutationExp(NumericExpression n) {
        this(n.value.longValue());
    }

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return String.format("Permutation(%s)", this.val.toString());
    }

    public String toString() {
        return inputForm();
    }

    @Override
    public IExpression add(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression sub(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    /**
     * Multiplication implies composition with other permutations
     */
    public IExpression mul(IExpression other) {
        if (FunctionUtils.isInstanceOf(other, PermutationExp.class)) {
            return new PermutationExp(this.val.compose(((PermutationExp) other.evaluate()).val));
        }
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression negate() {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression pow(IExpression exponent) {
        if (!FunctionUtils.isInstanceOf(exponent, NumericExpression.class)) {
            System.out.println("Cannot raise permutation to a non-numeric exponent");
            return GlobalSymbols.UNDEFINED;
        }
        long exp = ((NumericExpression) exponent).value.longValue();
        return new PermutationExp(this.val.power(exp));
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
        return new StringExpression("Permutation");
    }

    @Override
    public Object val() {
        return this.val;
    }

    @Override
    public IExpression length() {
        return new NumericExpression(0);
    }

    @Override
    public List<IExpression> toList() {
        return this.val.getList();    
    }

    public ListExpression cyclize() {
        return this.val.cyclizeAsExpr();
    }

    public boolean equals(Object other) {
        if (other instanceof PermutationExp) {
            return this.val.equals(((PermutationExp) other).val());
        }
        return false;
    }

    public IExpression inverse() {
        return new PermutationExp(this.val.inverse());
    }

    public IExpression permuteMap(Long n) {
        return new NumericExpression(this.val.permuteMap(n - 1) + 1);
    }
}
