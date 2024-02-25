package io.mathlark.larkv2.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;

import org.junit.jupiter.api.Test;

public class GCDFuncTest {
    @Test
    public void testGCD() {
        assertEquals(608L, execute("GCD(608, 0)"));
        assertEquals(608L, execute("GCD(0, 608)"));
        assertEquals(0L, execute("GCD(0, 0)"));
        assertEquals(12L, execute("GCD(372, 132)"));
    }
}
