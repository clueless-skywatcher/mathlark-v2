package io.mathlark.larkv2.expressions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;

import org.junit.jupiter.api.Test;

public class MathExpressionTest {
    @Test
    public void testAdd() {
        assertEquals(2L, execute("1 + 1"));
        assertEquals(0L, execute("1 * 0"));
        assertEquals(0L, execute("1 - 1"));
        assertEquals(0.72, execute("3 * (2 + 4) / 25"));
        assertEquals(43L, execute("3 * (2 + 4) + 25"));
    }

    @Test
    public void testFunctionCall() {
        assertEquals(8L, execute("GCD(608, 168)"));
        execute("a1 := GCD(608, 168)");
        assertEquals(8L, execute("a1"));
        execute("Clear()");
        assertEquals("Undefined", execute("a1"));
    }
    
    @Test
    public void testAssign() {
        assertEquals("Undefined", execute("a1"));
        execute("a1 := 25");
        assertEquals(25L, execute("a1"));
        execute("a1 := \"abc\"");
        assertEquals("abc", execute("a1"));
        execute("a1 := True");
        assertEquals("True", execute("a1"));
    }

    @AfterEach
    public void clear() {
        execute("Clear()");
    }
}
