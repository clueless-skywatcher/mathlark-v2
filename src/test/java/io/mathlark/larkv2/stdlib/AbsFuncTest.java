package io.mathlark.larkv2.stdlib;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.fileread.LarkFileReader;

public class AbsFuncTest {

    @BeforeAll
    public static void loadStdlib() {
        LarkFileReader.loadResource("src/math.lk");
    }

    @Test
    public void testAbsPositive() {
        assertEquals(execute("Abs(5)").toString(), "5");
    }

    @Test
    public void testAbsNegative() {
        assertEquals(execute("Abs(-5)").toString(), "5");
    }

    @Test
    public void testAbsZero() {
        assertEquals(execute("Abs(0)").toString(), "0");
    }

    @Test
    public void testAbsLargeNegative() {
        assertEquals(execute("Abs(-1000)").toString(), "1000");
    }

    @Test
    public void testAbsExpression() {
        assertEquals(execute("Abs(3 - 7)").toString(), "4");
    }

    @Test
    public void testAbsAlreadyPositive() {
        assertEquals(execute("Abs(2 + 3)").toString(), "5");
    }
}
