package io.mathlark.larkv2.stdlib.math;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.fileread.LarkFileReader;

public class DecrementFuncTest {

    @BeforeAll
    public static void loadStdlib() {
        LarkFileReader.loadResource("src/math.lk");
    }

    @Test
    public void testDecrementPositive() {
        assertEquals(execute("Decrement(1)").toString(), "0");
    }

    @Test
    public void testDecrementZero() {
        assertEquals(execute("Decrement(0)").toString(), "-1");
    }

    @Test
    public void testDecrementNegative() {
        assertEquals(execute("Decrement(-1)").toString(), "-2");
    }

    @Test
    public void testDecrementLargeNumber() {
        assertEquals(execute("Decrement(1000)").toString(), "999");
    }

    @Test
    public void testDecrementDecimal() {
        assertEquals(execute("Decrement(1.5)").toString(), "0.5");
    }

    @Test
    public void testDecrementNonNumericReturnsUndefined() {
        assertEquals(execute("Decrement(True)").toString(), "Undefined");
    }
}

