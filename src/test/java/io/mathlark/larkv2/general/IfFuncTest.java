package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IfFuncTest {
    @Test
    public void testIfTrue() {
        assertEquals(execute("If(True, 1, 2)").toString(), "1");
    }

    @Test
    public void testIfFalse() {
        assertEquals(execute("If(False, 1, 2)").toString(), "2");
    }

    @Test
    public void testIfWithoutElse() {
        assertEquals(execute("If(True, 42)").toString(), "42");
        assertEquals(execute("If(False, 42)").toString(), "Undefined");
    }

    @Test
    public void testIfWithComparison() {
        assertEquals(execute("If(3 > 2, 1, 0)").toString(), "1");
        assertEquals(execute("If(1 > 2, 1, 0)").toString(), "0");
    }

    @Test
    public void testIfWithExpressionResult() {
        assertEquals(execute("If(True, 1 + 2, 3 + 4)").toString(), "3");
        assertEquals(execute("If(False, 1 + 2, 3 + 4)").toString(), "7");
    }

    @Test
    public void testIfWithEquality() {
        assertEquals(execute("If(EqualsQ(1, 1), 10, 20)").toString(), "10");
        assertEquals(execute("If(EqualsQ(1, 2), 10, 20)").toString(), "20");
    }
}
