package io.mathlark.larkv2.combinatorics.group;

import java.util.List;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;

public interface GroupExpression<T extends IExpression> extends IExpression {
    public List<T> getElements();
    public List<T> getGenerators();
    public T getIdentity();
    public NumericExpression getOrder();
}
