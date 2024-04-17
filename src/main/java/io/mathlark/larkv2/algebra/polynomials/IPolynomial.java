package io.mathlark.larkv2.algebra.polynomials;

import java.util.List;

import io.mathlark.larkv2.algebra.funcs.IRing;

public interface IPolynomial<T extends IRing<U>, U> {
    public List<String> getSymbols();
    public long getDegree();
    public long getDegree(String symbol);

    public T getRing();

    public boolean isMultivariate();

    public IPolynomial<T, U> add(IPolynomial<T, U> other);
    public IPolynomial<T, U> mul(IPolynomial<T, U> other);
    public List<IPolynomial<T, U>> quotRem(IPolynomial<T, U> other);
    public IPolynomial<T, U> pow(IPolynomial<T, U> other);

    public List<U> getCoeffs();
}
