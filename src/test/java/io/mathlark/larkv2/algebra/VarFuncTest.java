package io.mathlark.larkv2.algebra;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class VarFuncTest {
    @Test
    public void testVar() {
        assertEquals(execute("Var('x')"), execute("Var('x')"));
        assertNotEquals(execute("Var('x')"), execute("Var('y')"));
        execute("x := Var('x')");
        assertEquals(execute("EqualsQ(x, x)"), "True");
        execute("y := Var('y')");
        assertEquals(execute("EqualsQ(x, y)"), "False");
        assertEquals(execute("EqualsQ(y, x)"), "False");
        execute("y := Var('x')");
        assertEquals(execute("EqualsQ(x, y)"), "True");
        assertEquals(execute("EqualsQ(y, x)"), "True");
    }

    @Test
    public void testAddSub() {
        execute("ClearAll()");
        execute("x := Var('x')");
        execute("y := Var('y')");
        execute("z := Var('z')");

        assertEquals(execute("x + y"), execute("y + x"));
        assertEquals(execute("x + y + z"), execute("y + x + z"));
        assertEquals(execute("x + z + y"), execute("y + x + z"));

        assertEquals(execute("x + x"), execute("2 * x"));
        assertEquals(execute("x + x + 1"), execute("2 * x + 1"));

        assertEquals(execute("x - x"), execute("0"));
        assertEquals(execute("x - 2*x + 1"), execute("- x + 1"));
        assertEquals(execute("x + 2*x -1"), execute("3*x - 1"));

        assertEquals(execute("x - y").toString(), "x - y");
        assertEquals(execute("x - y + y"), execute("x"));
        assertEquals(execute("x - y + 2*y"), execute("x + y"));

        assertEquals(execute("x - y"), execute("-(y - x)"));
        assertEquals(execute("x + y + 0 + (-1) + 2"), execute("x + y + 1"));
        assertEquals(execute("x + y"), execute("x - z + z + y"));
    }
}
