package io.mathlark.larkv2.algebra.funcs;

public interface IRing<T> {
    public T add(T a1, T a2);
    public T mul(T a1, T a2);
    public T pow(T base, T exp);

    public T getZero();

    public T getOne();

    public T getInverse(T a);

    public boolean isMemberOf(Object a);
}
