package io.mathlark.larkv2.stdlib.math;

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

    @Test
    public void testAbsDecimal() {
        assertEquals(execute("Abs(-3.5)").toString(), "3.5");
    }

    @Test
    public void testAbsDecimalPositive() {
        assertEquals(execute("Abs(2.7)").toString(), "2.7");
    }

    @Test
    public void testAbsNegativeOne() {
        assertEquals(execute("Abs(-1)").toString(), "1");
    }

    @Test
    public void testAbsNestedExpression() {
        assertEquals(execute("Abs(Abs(-5))").toString(), "5");
    }

    @Test
    public void testAbsMultiplication() {
        assertEquals(execute("Abs(-2 * 3)").toString(), "6");
    }

    @Test
    public void testAbsNonNumericReturnsUndefined() {
        assertEquals(execute("Abs(True)").toString(), "Undefined");
    }

    @Test
    public void testAbsStringReturnsUndefined() {
        assertEquals(execute("Abs(\"hello\")").toString(), "Undefined");
    }
}
