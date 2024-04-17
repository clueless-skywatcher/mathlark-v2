package io.mathlark.larkv2.algebra.polynomials;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.algebra.funcs.IRing;

public class UnivariatePolynomial<T extends IRing<U>, U> implements IPolynomial<T, U> {
    public String symbol;
    public List<U> coeffs;

    public Map<Long, U> powerMap = new HashMap<>();

    public UnivariatePolynomial(List<U> coeffs, String symbol) {
        this.coeffs = coeffs;
        this.symbol = symbol;

        for (int i = 0; i < coeffs.size(); i++) {
            this.powerMap.put(Long.valueOf(i), coeffs.get(i));
        }
    }

    @Override
    public List<String> getSymbols() {
        return List.of(symbol);
    }

    @Override
    public long getDegree() {
        return Collections.max(powerMap.keySet());
    }

    @Override
    public long getDegree(String symbol) {
        if (!symbol.equals(this.symbol)) {
            return 0;
        }
        return getDegree();
    }

    @Override
    public T getRing() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRing'");
    }

    @Override
    public boolean isMultivariate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMultivariate'");
    }

    @Override
    public IPolynomial<T, U> add(IPolynomial<T, U> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public IPolynomial<T, U> mul(IPolynomial<T, U> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mul'");
    }

    @Override
    public List<IPolynomial<T, U>> quotRem(IPolynomial<T, U> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quotRem'");
    }

    @Override
    public IPolynomial<T, U> pow(IPolynomial<T, U> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pow'");
    }

    @Override
    public List<U> getCoeffs() {
        return coeffs;
    }
    
}
