package io.mathlark.larkv2.algebra;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SymbolicArithmeticTest {

    @BeforeEach
    public void setUp() {
        execute("ClearAll()");
        execute("x := Var('x')");
        execute("y := Var('y')");
        execute("z := Var('z')");
        execute("w := Var('w')");
    }

    // ===== ADDITION =====

    @Test
    public void testAdditionIdentity() {
        assertEquals(execute("x + 0"), execute("x"));
        assertEquals(execute("0 + x"), execute("x"));
        assertEquals(execute("x + 0 + 0"), execute("x"));
    }

    @Test
    public void testAdditionCommutativity() {
        assertEquals(execute("x + y"), execute("y + x"));
        assertEquals(execute("x + z"), execute("z + x"));
        assertEquals(execute("2*x + 3*y"), execute("3*y + 2*x"));
    }

    @Test
    public void testAdditionAssociativity() {
        assertEquals(execute("(x + y) + z"), execute("x + (y + z)"));
        assertEquals(execute("(x + y) + (z + w)"), execute("x + y + z + w"));
    }

    @Test
    public void testAdditionCoefficientMerging() {
        assertEquals(execute("x + x"), execute("2*x"));
        assertEquals(execute("x + x + x"), execute("3*x"));
        assertEquals(execute("2*x + 3*x"), execute("5*x"));
        assertEquals(execute("x + 2*y + 3*x"), execute("4*x + 2*y"));
    }

    @Test
    public void testAdditionWithConstants() {
        assertEquals(execute("x + 1 + 2"), execute("x + 3"));
        assertEquals(execute("x + y + 5 + 3"), execute("x + y + 8"));
        assertEquals(execute("1 + x + 2 + y"), execute("x + y + 3"));
    }

    @Test
    public void testAdditionWithNegativeCoefficients() {
        assertEquals(execute("x + (-1)*y").toString(), "x - y");
        assertEquals(execute("(-2)*x + 3*x"), execute("x"));
        assertEquals(execute("(-1)*x + (-1)*y + x + y"), execute("0"));
    }

    @Test
    public void testAdditionMultipleVariables() {
        assertEquals(execute("x + y + z + w"), execute("w + x + y + z"));
        assertEquals(execute("2*x + 3*y + z + w"), execute("w + 2*x + 3*y + z"));
    }

    @Test
    public void testAdditionWithRationals() {
        assertEquals(execute("x + (1/3) + (2/3)"), execute("x + 1"));
        assertEquals(execute("(1/2)*x + (1/2)*x"), execute("x"));
        assertEquals(execute("(1/3)*x + (2/3)*x"), execute("x"));
        assertEquals(execute("(1/4)*y + (3/4)*y"), execute("y"));
    }

    @Test
    public void testAdditionHigherDegree() {
        assertEquals(execute("x*x + x*x"), execute("2*x*x"));
        assertEquals(execute("x*y + x*y"), execute("2*x*y"));
        assertEquals(execute("x*x + x*y + x*x"), execute("2*x*x + x*y"));
    }

    // ===== SUBTRACTION =====

    @Test
    public void testSubtractionSelf() {
        assertEquals(execute("x - x"), execute("0"));
        assertEquals(execute("2*x - 2*x"), execute("0"));
        assertEquals(execute("x + y - x - y"), execute("0"));
    }

    @Test
    public void testSubtractionIdentity() {
        assertEquals(execute("x - 0"), execute("x"));
    }

    @Test
    public void testSubtractionAsNegation() {
        assertEquals(execute("0 - x"), execute("(-1)*x"));
        assertEquals(execute("-(x)").toString(), "- x");
    }

    @Test
    public void testSubtractionCoefficientMerging() {
        assertEquals(execute("3*x - x"), execute("2*x"));
        assertEquals(execute("5*x - 2*x"), execute("3*x"));
        assertEquals(execute("x - 2*x"), execute("(-1)*x"));
    }

    @Test
    public void testSubtractionWithConstants() {
        assertEquals(execute("x - 1"), execute("x + (-1)"));
        assertEquals(execute("x + 5 - 3"), execute("x + 2"));
        assertEquals(execute("x + 1 - 1"), execute("x"));
    }

    @Test
    public void testSubtractionMultipleVariables() {
        assertEquals(execute("x + y - z"), execute("x + y + (-1)*z"));
        assertEquals(execute("2*x + 3*y - x - 2*y"), execute("x + y"));
    }

    @Test
    public void testSubtractionAntiCommutativity() {
        assertEquals(execute("x - y"), execute("-(y - x)"));
        assertEquals(execute("x - y - z"), execute("x - z - y"));
    }

    @Test
    public void testSubtractionWithRationals() {
        assertEquals(execute("x - (1/2)"), execute("x + (-1/2)"));
        assertEquals(execute("(3/4)*x - (1/4)*x"), execute("(1/2)*x"));
        assertEquals(execute("x - (1/3)*x"), execute("(2/3)*x"));
    }

    // ===== MULTIPLICATION =====

    @Test
    public void testMultiplicationIdentity() {
        assertEquals(execute("x * 1"), execute("x"));
        assertEquals(execute("1 * x"), execute("x"));
    }

    @Test
    public void testMultiplicationByZero() {
        assertEquals(execute("x * 0"), execute("0"));
        assertEquals(execute("0 * x"), execute("0"));
        assertEquals(execute("(x + y) * 0"), execute("0"));
    }

    @Test
    public void testMultiplicationCommutativity() {
        assertEquals(execute("x * y"), execute("y * x"));
        assertEquals(execute("2*x * 3*y"), execute("3*y * 2*x"));
    }

    @Test
    public void testMultiplicationScalar() {
        assertEquals(execute("x * 2"), execute("2 * x"));
        assertEquals(execute("x * 3"), execute("3*x"));
        assertEquals(execute("2 * (3*x)"), execute("6*x"));
    }

    @Test
    public void testMultiplicationDistributive() {
        // (x + y) * z = x*z + y*z
        assertEquals(execute("(x + y) * z"), execute("x*z + y*z"));
        // x * (y + z) = x*y + x*z
        assertEquals(execute("x * (y + z)"), execute("x*y + x*z"));
    }

    @Test
    public void testMultiplicationBinomials() {
        // (x + y)^2 = x^2 + 2xy + y^2
        assertEquals(execute("(x + y) * (x + y)"), execute("x*x + 2*x*y + y*y"));
        // (x + 1)(x - 1) = x^2 - 1
        assertEquals(execute("(x + 1) * (x - 1)"), execute("x*x - 1"));
        // (x + y)(x - y) = x^2 - y^2
        assertEquals(execute("(x + y) * (x - y)"), execute("x*x - y*y"));
    }

    @Test
    public void testMultiplicationPolynomials() {
        // (x + 1)(x + 2) = x^2 + 3x + 2
        assertEquals(execute("(x + 1) * (x + 2)"), execute("x*x + 3*x + 2"));
        // (2x + 1)(x + 3) = 2x^2 + 7x + 3
        assertEquals(execute("(2*x + 1) * (x + 3)"), execute("2*x*x + 7*x + 3"));
    }

    @Test
    public void testMultiplicationWithRationals() {
        assertEquals(execute("(1/2) * x"), execute("(1/2)*x"));
        assertEquals(execute("(1/2)*x * 2"), execute("x"));
        assertEquals(execute("(1/3)*x * (3/2)"), execute("(1/2)*x"));
    }

    @Test
    public void testMultiplicationHigherDegree() {
        // x * x = x^2
        assertEquals(execute("x * x").toString(), "x^2");
        // x * x * x = x^3
        assertEquals(execute("x * x * x").toString(), "x^3");
    }

    // ===== COMBINED OPERATIONS =====

    @Test
    public void testMixedOperations() {
        assertEquals(execute("2*x + 3*y - x + y"), execute("x + 4*y"));
        assertEquals(execute("x*y + x*z - x*y"), execute("x*z"));
    }

    @Test
    public void testPowerExpansion() {
        // (x + y)^2 = x^2 + 2xy + y^2
        assertEquals(execute("(x + y)^2"), execute("x*x + 2*x*y + y*y"));
        // (x + 1)^2 = x^2 + 2x + 1
        assertEquals(execute("(x + 1)^2"), execute("x*x + 2*x + 1"));
    }

    @Test
    public void testPowerOfThree() {
        // (x + 1)^3 = x^3 + 3x^2 + 3x + 1
        assertEquals(execute("(x + 1)^3"), execute("x*x*x + 3*x*x + 3*x + 1"));
    }

    @Test
    public void testNegativeConstants() {
        assertEquals(execute("x + (-3)").toString(), "x - 3");
        assertEquals(execute("(-2)*x + (-3)*y").toString(), "- 2x - 3y");
    }

    @Test
    public void testMultiplicationByNegativeOne() {
        assertEquals(execute("(-1) * x").toString(), "- x");
        assertEquals(execute("(-1) * (x + y)"), execute("-x - y"));
    }

    @Test
    public void testComplexExpression() {
        // (x + y + 1)(x - y - 1) = x^2 - y^2 - 2y - 1
        assertEquals(execute("(x + y + 1) * (x - y - 1)"), execute("x*x - y*y - 2*y - 1"));
    }
}
