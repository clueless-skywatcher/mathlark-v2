package io.mathlark.larkv2.combinatorics.permutations;

import java.util.List;

import io.mathlark.larkv2.expressions.IExpression;
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
        return this.val.toString();
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
}
