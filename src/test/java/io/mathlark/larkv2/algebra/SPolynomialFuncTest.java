package io.mathlark.larkv2.algebra;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SPolynomialFuncTest {

    @BeforeEach
    public void setUp() {
        execute("ClearAll()");
        execute("x := Var('x')");
        execute("y := Var('y')");
        execute("z := Var('z')");
    }

    // ===== BASIC S-POLYNOMIALS =====

    @Test
    public void testSPolynomialCancelsLeadingTerms() {
        // S(x^2 + y, x^2 + x) should cancel the x^2 leading terms
        // lcm(x^2, x^2) = x^2
        // S = (x^2/x^2)(x^2 + y) - (x^2/x^2)(x^2 + x) = y - x
        assertEquals(execute("SPolynomial(x^2 + y, x^2 + x)"), execute("y - x"));
    }

    @Test
    public void testSPolynomialDifferentLeadingMonomials() {
        // f = x^3 - 2*x*y, g = x^2*y - 2*y^2 + x
        // LM(f) = x^3, LM(g) = x^2*y, lcm = x^3*y
        // S = (x^3*y/x^3)*f - (x^3*y/(x^2*y))*g
        //   = y*(x^3 - 2xy) - x*(x^2*y - 2y^2 + x)
        //   = x^3*y - 2xy^2 - x^3*y + 2xy^2 - x^2
        //   = -x^2
        assertEquals(execute("SPolynomial(x^3 - 2*x*y, x^2*y - 2*y^2 + x)"), execute("(-1)*x^2"));
    }

    @Test
    public void testSPolynomialUnivariate() {
        // f = x^3 + 1, g = x^2 + 1
        // lcm(x^3, x^2) = x^3
        // S = (x^3/x^3)(x^3+1) - (x^3/x^2)(x^2+1) = x^3+1 - x^3-x = 1-x
        assertEquals(execute("SPolynomial(x^3 + 1, x^2 + 1)"), execute("1 - x"));
    }

    @Test
    public void testSPolynomialWithCoefficients() {
        // f = 2x^2 + y, g = 3x^2 + x
        // lcm(x^2, x^2) = x^2
        // S = (1/2)(2x^2 + y) - (1/3)(3x^2 + x) = x^2 + y/2 - x^2 - x/3 = y/2 - x/3
        assertEquals(execute("SPolynomial(2*x^2 + y, 3*x^2 + x)"), execute("(1/2)*y - (1/3)*x"));
    }

    // ===== RELATIVELY PRIME LEADING MONOMIALS =====

    @Test
    public void testSPolynomialRelativelyPrime() {
        // f = x^2 + y, g = y^2 + x
        // Under lex order (x > y): LM(f) = x^2, LM(g) = x, lcm = x^2
        // S = (x^2/x^2)*f - (x^2/x)*g = (x^2+y) - x*(y^2+x) = -xy^2 + y
        assertEquals(execute("SPolynomial(x^2 + y, y^2 + x)"), execute("(-1)*x*y^2 + y"));
    }

    // ===== EDGE CASES =====

    @Test
    public void testSPolynomialWithZero() {
        assertEquals(execute("SPolynomial(x^2 + 1, 0)"), execute("0"));
        assertEquals(execute("SPolynomial(0, x^2 + 1)"), execute("0"));
    }

    @Test
    public void testSPolynomialWithItself() {
        // S(f, f) should always be 0
        assertEquals(execute("SPolynomial(x^2 + y, x^2 + y)"), execute("0"));
    }

    @Test
    public void testSPolynomialLinearPolynomials() {
        // f = x + y, g = x + z
        // lcm(x, x) = x
        // S = (x + y) - (x + z) = y - z
        assertEquals(execute("SPolynomial(x + y, x + z)"), execute("y - z"));
    }

    // ===== CLASSIC GROEBNER BASIS EXAMPLES =====

    @Test
    public void testSPolynomialOverlappingLeadingMonomials() {
        // f = x^2 + y, g = x*y + x
        // LM(f) = x^2, LM(g) = xy, lcm = x^2*y
        // S = y*f - x*g = y(x^2+y) - x(xy+x) = x^2*y + y^2 - x^2*y - x^2 = y^2 - x^2
        assertEquals(execute("SPolynomial(x^2 + y, x*y + x)"), execute("y^2 - x^2"));
    }
}
