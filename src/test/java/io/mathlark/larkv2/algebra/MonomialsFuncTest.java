package io.mathlark.larkv2.algebra;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MonomialsFuncTest {
    @Test
    public void testMonomials() {
        execute("x := Var('x')");
        execute("y := Var('y')");
        execute("z := Var('z')");

        assertEquals(execute("Monomials(x)"), execute("[x]"));
        assertEquals(execute("Monomials(y)"), execute("[y]"));
        assertEquals(execute("Monomials(z)"), execute("[z]"));

        assertEquals(execute("Monomials(x + y)"), execute("[x, y]"));
        assertEquals(execute("Monomials(x + y + z)"), execute("[x, y, z]"));

        assertEquals(execute("Monomials(x^2 + y^2)"), execute("[x^2, y^2]"));
        assertEquals(execute("Monomials((x + y)^2)"), execute("[x^2, 2*x*y, y^2]"));
        assertEquals(execute("Monomials((x + y)^2 - 2*x*y)"), execute("[x^2, y^2]"));

        assertEquals(execute("Monomials((x + y)*(y + z))"), execute("[x*y, x*z, y^2, y*z]"));
    }
}
