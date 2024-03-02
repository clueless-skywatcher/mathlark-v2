package io.mathlark.larkv2.expressions.mixins;

import java.util.List;

import io.mathlark.larkv2.expressions.IExpression;

public interface Listable {
    public List<IExpression> toList();
}
