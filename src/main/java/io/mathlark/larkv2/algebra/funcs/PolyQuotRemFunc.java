package io.mathlark.larkv2.algebra.funcs;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import io.mathlark.larkv2.LarkFunction;
import io.mathlark.larkv2.algebra.PolynomialExpression;
import io.mathlark.larkv2.algebra.PolynomialUtils;
import io.mathlark.larkv2.algebra.rings.IRing;
import io.mathlark.larkv2.algebra.rings.RationalRing;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.expressions.math.RationalExpression;
import io.mathlark.larkv2.general.utils.ObjectPair;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.utils.FunctionUtils;

public class PolyQuotRemFunc extends LarkFunction {

    public PolyQuotRemFunc(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        super(scope, funcs);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public IExpression mainEval(IExpression[] exprs) {
        PolynomialExpression<IRing<IExpression>, IExpression> dividend = (PolynomialExpression<IRing<IExpression>, IExpression>) exprs[0];
        List<IExpression> divisorList = ((ListExpression) exprs[1]).val();

        List<PolynomialExpression<IRing<IExpression>, IExpression>> divisors = new ArrayList<>();

        for (int i = 0; i < divisorList.size(); i++) {
            if (FunctionUtils.isInstanceOf(divisorList.get(i), NumericExpression.class) ||
                FunctionUtils.isInstanceOf(divisorList.get(i), RationalExpression.class)
            ) {
                RationalExpression rationalDiv = (RationalExpression) RationalRing.rationalize(divisorList.get(i));
                divisors.add(PolynomialUtils.constantPolyInRationals(rationalDiv, dividend.getSymbols()));
            }
            else {
                divisors.add((PolynomialExpression) divisorList.get(i));
            }
        }        

        ObjectPair<List<PolynomialExpression<IRing<IExpression>,IExpression>>, IExpression> result = PolynomialExpression.quotRem(dividend, divisors);
        
        List<IExpression> quots = new ArrayList<>();
        for (PolynomialExpression expr: result.getFirst()) {
            quots.add(expr);
        }

        return new ListExpression(new ListExpression(quots), result.getSecond());
    }

    @Override
    public void checkArgs(IExpression[] exprs) {
        
    }

    @Override
    public String getName() {
        return "PolyQuotRem";
    }
    
}
