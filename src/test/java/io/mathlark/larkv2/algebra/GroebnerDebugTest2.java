package io.mathlark.larkv2.algebra;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroebnerDebugTest2 {
    @BeforeEach
    public void setUp() {
        execute("ClearAll()");
        execute("x := Var('x')");
        execute("y := Var('y')");
    }

    @Test
    public void debugMonomials() {
        System.out.println("Monomials(x+y) = " + execute("Monomials(x + y)"));
        System.out.println("Monomials(y+1) = " + execute("Monomials(y + 1)"));
    }
}
