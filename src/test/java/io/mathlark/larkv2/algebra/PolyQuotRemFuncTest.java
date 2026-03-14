package io.mathlark.larkv2.algebra;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PolyQuotRemFuncTest {

    @BeforeEach
    public void setUp() {
        execute("ClearAll()");
        execute("x := Var('x')");
        execute("y := Var('y')");
    }

    // ===== UNIVARIATE DIVISION =====

    @Test
    public void testDivisionExact() {
        // x^2 - 1 = (x - 1)(x + 1), so dividing by (x - 1) gives quotient (x + 1), remainder 0
        execute("result := PolyQuotRem(x^2 - 1, [x - 1])");
        assertEquals(execute("result{0}{0}"), execute("x + 1"));
        assertEquals(execute("result{1}"), execute("0"));
    }

    @Test
    public void testDivisionWithRemainder() {
        // x^2 + 1 divided by x - 1: quotient x + 1, remainder 2
        execute("result := PolyQuotRem(x^2 + 1, [x - 1])");
        assertEquals(execute("result{0}{0}"), execute("x + 1"));
        assertEquals(execute("result{1}"), execute("2"));
    }

    @Test
    public void testDivisionByItself() {
        // x^2 + x + 1 divided by itself: quotient 1, remainder 0
        execute("result := PolyQuotRem(x^2 + x + 1, [x^2 + x + 1])");
        assertEquals(execute("result{0}{0}"), execute("1"));
        assertEquals(execute("result{1}"), execute("0"));
    }

    @Test
    public void testDivisionLowerDegree() {
        // x + 1 divided by x^2: quotient 0, remainder x + 1
        execute("result := PolyQuotRem(x + 1, [x^2])");
        assertEquals(execute("result{0}{0}"), execute("0"));
        assertEquals(execute("result{1}"), execute("x + 1"));
    }

    @Test
    public void testDivisionCubicByLinear() {
        // x^3 - 8 divided by x - 2: quotient x^2 + 2x + 4, remainder 0
        execute("result := PolyQuotRem(x^3 - 8, [x - 2])");
        assertEquals(execute("result{0}{0}"), execute("x^2 + 2*x + 4"));
        assertEquals(execute("result{1}"), execute("0"));
    }

    @Test
    public void testDivisionWithRationalCoeffs() {
        // (1/2)x^2 + x divided by x: quotient (1/2)x + 1, remainder 0
        execute("result := PolyQuotRem((1/2)*x^2 + x, [x])");
        assertEquals(execute("result{0}{0}"), execute("(1/2)*x + 1"));
        assertEquals(execute("result{1}"), execute("0"));
    }

    // ===== MULTIVARIATE DIVISION (single divisor) =====

    @Test
    public void testMultivariateDivision() {
        // xy divided by y: quotient x, remainder 0
        execute("result := PolyQuotRem(x*y, [y])");
        assertEquals(execute("result{0}{0}"), execute("x"));
        assertEquals(execute("result{1}"), execute("0"));
    }

    @Test
    public void testDivisionByListExact() {
        // x^2 - y^2 = (x+y)(x-y), divide by [x+y]
        execute("result := PolyQuotRem(x^2 - y^2, [x + y])");
        assertEquals(execute("result{0}{0}"), execute("x - y"));
        assertEquals(execute("result{1}"), execute("0"));
    }

    // ===== DIVISION BY MULTIPLE DIVISORS =====

    @Test
    public void testDivisionByTwoDivisors() {
        // x^2 + xy + y^2 divided by [x + y, y]
        // q0 = x, q1 = y, r = 0
        execute("result := PolyQuotRem(x^2 + x*y + y^2, [x + y, y])");
        assertEquals(execute("result{0}{0}"), execute("x"));
        assertEquals(execute("result{0}{1}"), execute("y"));
        assertEquals(execute("result{1}"), execute("0"));
    }

    @Test
    public void testDivisionByTwoDivisorsWithRemainder() {
        // x^2 + 1 divided by [x + y, y]
        // q0 = x - y, q1 = y, r = 1
        execute("result := PolyQuotRem(x^2 + 1, [x + y, y])");
        assertEquals(execute("result{0}{0}"), execute("x - y"));
        assertEquals(execute("result{0}{1}"), execute("y"));
        assertEquals(execute("result{1}"), execute("1"));
    }
}
