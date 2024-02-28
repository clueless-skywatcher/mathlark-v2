package io.mathlark.larkv2.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;

import org.junit.jupiter.api.Test;

public class FactorialFuncTest {
    @Test
    public void testFactorial() {
        assertEquals("Undefined", execute("Factorial(-1)"));
        assertEquals("Undefined", execute("Factorial(1.5)"));
        assertEquals("Undefined", execute("Factorial(-1.5)"));
        assertEquals(1L, execute("Factorial(0)"));
        assertEquals(1L, execute("Factorial(1)"));
        assertEquals(2L, execute("Factorial(2)"));
        assertEquals(6L, execute("Factorial(3)"));
        assertEquals(3628800L, execute("Factorial(10)"));
    }
}