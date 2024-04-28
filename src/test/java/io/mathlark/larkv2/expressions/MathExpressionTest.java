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
        assertEquals(execute("18 / 25"), execute("3 * (2 + 4) / 25"));
        assertEquals(43L, execute("3 * (2 + 4) + 25"));
    }

    @Test
    public void testFunctionCall() {
        assertEquals(8L, execute("GCD(608, 168)"));
        execute("a1 := GCD(608, 168)");
        assertEquals(8L, execute("a1"));
        execute("ClearAll()");
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
        execute("ClearAll()");
    }

    @Test
    public void testRationals() {
        assertEquals(execute("18 / 24").toString(), "(3/4)");
        assertEquals(execute("18.5 / 24"), execute("0.77083"));
        assertEquals(execute("18 / 24.5"), execute("0.73469"));
        assertEquals(execute("18.5 / 24.5"), execute("0.75510"));
        assertEquals(execute("0 / 25"), execute("0"));
        assertEquals(execute("25 / 0"), execute("Undefined"));

        assertEquals(execute("25 / 5"), execute("5"));
        assertEquals(execute("25.0 / 5"), execute("5.0"));

        assertEquals(execute("-25 / 10"), execute("-5/2"));
    }

    @Test
    public void testRationalAdd() {
        assertEquals(execute("1 / 2 + 1 / 3"), execute("5 / 6"));
        assertEquals(execute("1 / 2 + 5"), execute("11 / 2"));
        assertEquals(execute("5 + 1 / 2"), execute("11 / 2"));
        assertEquals(execute("1 / 2 + 5.0"), execute("5.5"));
        assertEquals(execute("5.0 + 1 / 2"), execute("5.5"));
        assertEquals(execute("1.1 / 2 + 1 / 2"), execute("1.05"));
    }

    @Test
    public void testRationalMul() {
        assertEquals(execute("2 / 5 * 2.8"), execute("1.12"));
        assertEquals(execute("2 / 5 * 5"), execute("2"));
        assertEquals(execute("2 / 5 * 5.0"), execute("2.0"));
        assertEquals(execute("2 / 5 * (5 / 2)"), execute("1"));
    }
}
