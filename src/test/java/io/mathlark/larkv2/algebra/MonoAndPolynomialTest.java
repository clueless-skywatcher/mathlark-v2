package io.mathlark.larkv2.algebra;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.algebra.rings.RealRing;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class MonoAndPolynomialTest {
    @Test
    public void testMonomial() {
        HashMap<String, Long> powerMap = new HashMap<>();
        powerMap.put("x", 0L);
        powerMap.put("y", 3L);
        assertEquals(new MonomialExpression(powerMap), new MonomialExpression(powerMap));

        HashMap<String, Long> powerMap1 = new HashMap<>();
        powerMap1.put("x", 0L);
        powerMap1.put("y", 3L);

        HashMap<String, Long> powerMap2 = new HashMap<>();
        powerMap2.put("x", 1L);
        powerMap2.put("y", 3L);

        assertEquals(new MonomialExpression(powerMap1).compareTo(new MonomialExpression(powerMap2)), 1);
    }

    @Test
    public void testMonomialMul() {
        HashMap<String, Long> powerMap = new HashMap<>();
        powerMap.put("x", 0L);
        powerMap.put("y", 3L);
        MonomialExpression mon = new MonomialExpression(powerMap);

        HashMap<String, Long> powerMap1 = new HashMap<>();
        powerMap1.put("x", 1L);
        powerMap1.put("y", 3L);
        MonomialExpression mon1 = new MonomialExpression(powerMap1);

        HashMap<String, Long> powerMap2 = new HashMap<>();
        powerMap2.put("x", 1L);
        powerMap2.put("y", 3L);
        powerMap2.put("z", 2L);
        MonomialExpression mon2 = new MonomialExpression(powerMap2);

        assertEquals(mon.mul(mon).toString(), "y^6");
        assertEquals(mon.mul(mon1).toString(), "xy^6");
        assertEquals(mon.mul(mon2).toString(), "xy^6z^2");

        assertEquals(mon.mul(GlobalSymbols.ZERO).toString(), "0");
        assertEquals(mon.mul(GlobalSymbols.ONE).toString(), mon.toString());
    }

    @Test
    public void testMonomialPow() {
        HashMap<String, Long> powerMap = new HashMap<>();
        powerMap.put("x", 2L);
        powerMap.put("y", 3L);
        MonomialExpression mon = new MonomialExpression(powerMap);

        assertEquals(mon.pow(new NumericExpression(2)).toString(), "x^4y^6");

        assertEquals(mon.pow(GlobalSymbols.ZERO), GlobalSymbols.ONE);
        assertEquals(mon.pow(GlobalSymbols.ZERO).pow(new NumericExpression(3)).toString(), "1");
        assertEquals(mon.pow(GlobalSymbols.ONE).pow(new NumericExpression(3)).toString(), "x^6y^9");
    }

    @Test
    public void testPolynomial() {
        HashMap<String, Long> xMap = new HashMap<>();
        xMap.put("x", 1L);
        PolynomialExpression<RealRing, NumericExpression> x = new PolynomialExpression<>(List.of(new MonomialExpression(xMap)), List.of(GlobalSymbols.ONE));

        HashMap<String, Long> yMap = new HashMap<>();
        yMap.put("y", 1L);
        PolynomialExpression<RealRing, NumericExpression> y = new PolynomialExpression<>(List.of(new MonomialExpression(yMap)), List.of(GlobalSymbols.ONE));

        assertEquals(x.toString(), "x");
        assertEquals(y.toString(), "y");
        assertEquals(x.add(x).toString(), "2x");
        assertEquals(x.add(y).toString(), "x + y");
        assertEquals(x.add(GlobalSymbols.ONE).toString(), "x + 1");
        assertEquals(x.add(new NumericExpression(1.5)).add(x).toString(), "2x + 1.5");
        assertEquals(x.add(new NumericExpression(1.5)).add(x.add(y)).toString(), "2x + y + 1.5");
    }

    @Test
    public void testPolynomialMul() {
        HashMap<String, Long> xMap = new HashMap<>();
        xMap.put("x", 1L);
        PolynomialExpression<RealRing, NumericExpression> x = new PolynomialExpression<>(List.of(new MonomialExpression(xMap)), List.of(GlobalSymbols.ONE));

        HashMap<String, Long> yMap = new HashMap<>();
        yMap.put("y", 1L);
        PolynomialExpression<RealRing, NumericExpression> y = new PolynomialExpression<>(List.of(new MonomialExpression(yMap)), List.of(GlobalSymbols.ONE));

        assertEquals(x.mul(y).toString(), "xy");
        System.out.println(x.add(y).pow(new NumericExpression(2)));
    }

    @Test
    public void testPolynomialRationals() {
        execute("x := Var('x')");
        execute("y := Var('y')");
        assertEquals(execute("x + (1 / 4)*y").toString(), "x + (1/4)y");
        assertEquals(execute("x + 1 + y").toString(), "x + y + 1");
        assertEquals(execute("x + (1 / 4)*y + (3 / 4)*y"), execute("x + y"));
        assertEquals(execute("x + (1 / 4)*y + (-3 / 4)*x"), execute("(1 / 4)*x + (1 / 4)*y"));
        assertEquals(execute("x + x"), execute("x * 2"));
        assertEquals(execute("x + 1 / 2"), execute("x + (1 / 2)"));
        assertEquals(execute("x - 1 / 2"), execute("x - (1 / 2)"));
        assertEquals(execute("x + 0 + (1 / 2)"), execute("x + (1 / 2)"));
    }
}
