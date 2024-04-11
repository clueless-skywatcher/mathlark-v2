package io.mathlark.larkv2.algebra.rings;

import io.mathlark.larkv2.expressions.IExpression;

public interface IRing<U extends IExpression> extends IExpression {
    public U add(U a1, U a2);
    public U mul(U a1, U a2);
    
    public U getZero();

    public U getOne();

    public U getAddInverse(U a1);

    public U getMulInverse(U a1);

    public int compare(U a1, U a2);

    default public boolean equals(U a1, U a2) {
        return compare(a1, a2) == 0;
    }

    default public boolean isZero(U a1) {
        return equals(a1, getZero());
    }
}
