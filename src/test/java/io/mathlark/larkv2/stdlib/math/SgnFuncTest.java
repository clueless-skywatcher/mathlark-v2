package io.mathlark.larkv2.stdlib.math;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.fileread.LarkFileReader;

public class SgnFuncTest {

    @BeforeAll
    public static void loadStdlib() {
        LarkFileReader.loadResource("src/math.lk");
    }

    @Test
    public void testSgnPositive() {
        assertEquals(execute("Sgn(10)").toString(), "1");
    }

    @Test
    public void testSgnNegative() {
        assertEquals(execute("Sgn(-10)").toString(), "-1");
    }

    @Test
    public void testSgnZero() {
        assertEquals(execute("Sgn(0)").toString(), "0");
    }

    @Test
    public void testSgnLargePositive() {
        assertEquals(execute("Sgn(99999)").toString(), "1");
    }

    @Test
    public void testSgnLargeNegative() {
        assertEquals(execute("Sgn(-99999)").toString(), "-1");
    }

    @Test
    public void testSgnPositiveDecimal() {
        assertEquals(execute("Sgn(0.5)").toString(), "1");
    }

    @Test
    public void testSgnNegativeDecimal() {
        assertEquals(execute("Sgn(-0.5)").toString(), "-1");
    }

    @Test
    public void testSgnExpression() {
        assertEquals(execute("Sgn(3 - 7)").toString(), "-1");
    }

    @Test
    public void testSgnNonNumericReturnsUndefined() {
        assertEquals(execute("Sgn(True)").toString(), "Undefined");
    }
}
