package io.mathlark.larkv2.stdlib.math;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.fileread.LarkFileReader;

public class ClampFuncTest {

    @BeforeAll
    public static void loadStdlib() {
        LarkFileReader.loadResource("src/math.lk");
    }

    @Test
    public void testClampWithinRange() {
        assertEquals(execute("Clamp(5, 1, 10)").toString(), "5");
    }

    @Test
    public void testClampBelowRange() {
        assertEquals(execute("Clamp(-3, 1, 10)").toString(), "1");
    }

    @Test
    public void testClampAboveRange() {
        assertEquals(execute("Clamp(99, 1, 10)").toString(), "10");
    }

    @Test
    public void testClampAtLowerBound() {
        assertEquals(execute("Clamp(1, 1, 10)").toString(), "1");
    }

    @Test
    public void testClampAtUpperBound() {
        assertEquals(execute("Clamp(10, 1, 10)").toString(), "10");
    }

    @Test
    public void testClampNegativeRange() {
        assertEquals(execute("Clamp(0, -5, -1)").toString(), "-1");
    }

    @Test
    public void testClampBelowNegativeRange() {
        assertEquals(execute("Clamp(-10, -5, -1)").toString(), "-5");
    }

    @Test
    public void testClampDecimals() {
        assertEquals(execute("Clamp(1.5, 0.0, 1.0)").toString(), "1.0");
    }

    @Test
    public void testClampNonNumericReturnsUndefined() {
        assertEquals(execute("Clamp(True, 1, 10)").toString(), "Undefined");
    }
}
