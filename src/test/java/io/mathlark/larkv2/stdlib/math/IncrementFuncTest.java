package io.mathlark.larkv2.stdlib.math;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.fileread.LarkFileReader;

public class IncrementFuncTest {

    @BeforeAll
    public static void loadStdlib() {
        LarkFileReader.loadResource("src/math.lk");
    }

    @Test
    public void testIncrementPositive() {
        assertEquals(execute("Increment(1)").toString(), "2");
    }

    @Test
    public void testIncrementZero() {
        assertEquals(execute("Increment(0)").toString(), "1");
    }

    @Test
    public void testIncrementNegative() {
        assertEquals(execute("Increment(-1)").toString(), "0");
    }

    @Test
    public void testIncrementLargeNumber() {
        assertEquals(execute("Increment(999)").toString(), "1000");
    }

    @Test
    public void testIncrementDecimal() {
        assertEquals(execute("Increment(1.5)").toString(), "2.5");
    }

    @Test
    public void testIncrementNonNumericReturnsUndefined() {
        assertEquals(execute("Increment(True)").toString(), "Undefined");
    }
}
