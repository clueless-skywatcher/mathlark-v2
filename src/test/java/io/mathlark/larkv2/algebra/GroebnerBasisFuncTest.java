package io.mathlark.larkv2.algebra;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroebnerBasisFuncTest {

    @BeforeEach
    public void setUp() {
        execute("ClearAll()");
        execute("x := Var('x')");
        execute("y := Var('y')");
        execute("z := Var('z')");
    }

    // ===== BASIC GROEBNER BASIS COMPUTATIONS =====

    @Test
    public void testGroebnerBasisSinglePolynomial() {
        // A single polynomial is already a Groebner basis (made monic)
        execute("result := GroebnerBasis([x^2 - 1], [x])");
        assertEquals(execute("[x^2 - 1]"), execute("result"));
    }

    @Test
    public void testGroebnerBasisLinearPolynomials() {
        // x + y reduces to x - 1 modulo y + 1 in the inter-reduction step
        execute("result := GroebnerBasis([x + y, y + 1], [x, y])");
        assertEquals(execute("[x - 1, y + 1]"), execute("result"));
    }

    // ===== CLASSIC EXAMPLES =====

    @Test
    public void testGroebnerBasisClassicTwoPolynomials() {
        // f1 = x^2 + y, f2 = x*y - 1
        // Reduced Groebner basis (lex order, x > y)
        execute("result := GroebnerBasis([x^2 + y, x*y - 1], [x, y])");
        assertEquals(execute("[x + y^2, y^3 + 1]"), execute("result"));
    }

    @Test
    public void testGroebnerBasisKatsura2() {
        // Katsura-2 system: x + 2*y - 1, x^2 + 2*y^2 - x
        // Reduced monic Groebner basis under lex order
        execute("result := GroebnerBasis([x + 2*y - 1, x^2 + 2*y^2 - x], [x, y])");
        assertEquals(execute("[x + 2*y - 1, y^2 - (1/3)*y]"), execute("result"));
    }

    // ===== THREE VARIABLES =====

    @Test
    public void testGroebnerBasisThreeVariables() {
        // f1 = x + y + z, f2 = x*y + y*z, f3 = x*y*z - 1
        // The ideal contains 1, so the reduced Groebner basis is {1}
        execute("result := GroebnerBasis([x + y + z, x*y + y*z, x*y*z - 1], [x, y, z])");
        assertEquals(execute("[1]"), execute("result"));
    }
}
