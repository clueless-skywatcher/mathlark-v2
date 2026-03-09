package io.mathlark.larkv2.stdlib.math;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.fileread.LarkFileReader;

public class GreaterFuncTest {

    @BeforeAll
    public static void loadStdlib() {
        LarkFileReader.loadResource("src/math.lk");
    }

    @Test
    public void testGreaterFirstLarger() {
        assertEquals(execute("Greater(7, 3)").toString(), "7");
    }

    @Test
    public void testGreaterSecondLarger() {
        assertEquals(execute("Greater(2, 9)").toString(), "9");
    }

    @Test
    public void testGreaterEqual() {
        assertEquals(execute("Greater(5, 5)").toString(), "5");
    }

    @Test
    public void testGreaterNegatives() {
        assertEquals(execute("Greater(-3, -7)").toString(), "-3");
    }

    @Test
    public void testGreaterMixed() {
        assertEquals(execute("Greater(-1, 1)").toString(), "1");
    }

    @Test
    public void testGreaterDecimals() {
        assertEquals(execute("Greater(3.5, 2.1)").toString(), "3.5");
    }

    @Test
    public void testGreaterZero() {
        assertEquals(execute("Greater(0, -1)").toString(), "0");
    }

    @Test
    public void testGreaterNonNumericReturnsUndefined() {
        assertEquals(execute("Greater(True, 1)").toString(), "Undefined");
    }
}
