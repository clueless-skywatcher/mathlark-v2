package io.mathlark.larkv2.algebra.funcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.algebra.PolynomialExpression;
import io.mathlark.larkv2.algebra.PolynomialUtils;
import io.mathlark.larkv2.exceptions.WrongParameterLengthException;
import io.mathlark.larkv2.exceptions.WrongParameterTypeException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.algebra.rings.RationalRing;
import io.mathlark.larkv2.expressions.math.RationalExpression;
import io.mathlark.larkv2.general.utils.ObjectPair;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class GroebnerBasisFunc extends LarkFunction {

    public GroebnerBasisFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        List<IExpression> polyExprs = ((ListExpression) exprs[0]).toList();
        List<IExpression> vars = ((ListExpression) exprs[1]).toList();

        List<PolynomialExpression> basis = new ArrayList<>();
        for (IExpression p : polyExprs) {
            basis.add((PolynomialExpression) p);
        }

        List<String> symbols = new ArrayList<>();
        for (IExpression var: vars) {
            symbols.add(var.toString());
        }

        boolean changed = true;
        while (changed) {
            changed = false;
            int size = basis.size();
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    IExpression sPolyExpr = PolynomialUtils.sPolynomial(basis.get(i), basis.get(j));
                    if (!FunctionUtils.isInstanceOf(sPolyExpr, PolynomialExpression.class)) {
                        RationalExpression rationalized = (RationalExpression) RationalRing.rationalize(sPolyExpr);
                        sPolyExpr = PolynomialUtils.constantPolyInRationals(rationalized, symbols);
                    }
                    PolynomialExpression sPoly = (PolynomialExpression) sPolyExpr;
                    ObjectPair<List<PolynomialExpression>, IExpression> quotRem = PolynomialExpression.quotRem(sPoly, (List) basis);
                    IExpression remainder = quotRem.getSecond();

                    if (!FunctionUtils.isInstanceOf(remainder, PolynomialExpression.class)) {
                        RationalExpression rationalized = (RationalExpression) RationalRing.rationalize(remainder);
                        remainder = PolynomialUtils.constantPolyInRationals(rationalized, symbols);
                    }

                    PolynomialExpression remainderPoly = (PolynomialExpression) remainder;

                    if (!PolynomialExpression.isZero(remainderPoly, remainderPoly.getRing())) {
                        basis.add(remainderPoly);
                        changed = true;
                    }
                }
            }
        }

        List<PolynomialExpression> minimal = new ArrayList<>(basis);
        List<PolynomialExpression> toRemove = new ArrayList<>();
        for (int i = 0; i < minimal.size(); i++) {
            for (int j = 0; j < minimal.size(); j++) {
                if (i != j && !toRemove.contains(minimal.get(i))) {
                    if (minimal.get(i).leadingMonomial().isDivisible(minimal.get(j).leadingMonomial())) {
                        toRemove.add(minimal.get(i));
                    }
                }
            }
        }
        minimal.removeAll(toRemove);
        
        for (int i = 0; i < minimal.size(); i++) {
            IExpression lc = minimal.get(i).leadingCoeff();
            IExpression inverse = RationalExpression.RAT_ONE.div(lc);
            IExpression monic = minimal.get(i).mul(inverse);
            if (!FunctionUtils.isInstanceOf(monic, PolynomialExpression.class)) {
                RationalExpression rationalized = (RationalExpression) RationalRing.rationalize(monic);
                monic = PolynomialUtils.constantPolyInRationals(rationalized, symbols);
            }
            minimal.set(i, (PolynomialExpression) monic);
        }
        
        boolean reduced = true;
        while (reduced) {
            reduced = false;
            for (int i = 0; i < minimal.size(); i++) {
                List<PolynomialExpression> others = new ArrayList<>(minimal);
                others.remove(i);
                if (others.isEmpty()) continue;

                ObjectPair<List<PolynomialExpression>, IExpression> quotRem = PolynomialExpression.quotRem(minimal.get(i), (List) others);
                IExpression remainder = quotRem.getSecond();

                if (!FunctionUtils.isInstanceOf(remainder, PolynomialExpression.class)) {
                    RationalExpression rationalized = (RationalExpression) RationalRing.rationalize(remainder);
                    remainder = PolynomialUtils.constantPolyInRationals(rationalized, symbols);
                }

                PolynomialExpression remainderPoly = (PolynomialExpression) remainder;

                if (!remainderPoly.equals(minimal.get(i))) {
                    if (PolynomialExpression.isZero(remainderPoly, remainderPoly.getRing())) {
                            minimal.remove(i);
                    } else {
                            minimal.set(i, remainderPoly);
                    }
                    reduced = true;
                    break;
                }
            }
        }

        List<IExpression> finalResult = new ArrayList<>(minimal);
        return new ListExpression(finalResult);
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        if (exprs.length != 2) {
            throw new WrongParameterLengthException("Expected 2 elements, got %d elements", exprs.length);
        }
        if (!FunctionUtils.isInstanceOf(exprs[0], ListExpression.class)) {
            throw new WrongParameterTypeException(ListExpression.class, 0, exprs[0].getClass());
        }
        if (!FunctionUtils.isInstanceOf(exprs[1], ListExpression.class)) {
            throw new WrongParameterTypeException(ListExpression.class, 1, exprs[1].getClass());
        }

        ListExpression polyList = (ListExpression) exprs[0];
        for (int i = 0; i < polyList.val().size(); i++) {
            if (!FunctionUtils.isInstanceOf(polyList.val().get(i), PolynomialExpression.class)) {
                throw new WrongParameterTypeException(PolynomialExpression.class, 0, polyList.val().get(i).getClass());
            }
        }

        ListExpression varList = (ListExpression) exprs[1];
        for (int i = 0; i < varList.val().size(); i++) {
            if (!FunctionUtils.isInstanceOf(varList.val().get(i), PolynomialExpression.class)) {
                throw new WrongParameterTypeException(PolynomialExpression.class, 1, varList.val().get(i).getClass());
            }
        }
    }

    @Override
    public String getName() {
        return "GroebnerBasis";
    }

}
