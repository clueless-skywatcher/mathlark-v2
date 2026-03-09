package io.mathlark.larkv2.stdlib.math;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.fileread.LarkFileReader;

public class SquareFuncTest {

    @BeforeAll
    public static void loadStdlib() {
        LarkFileReader.loadResource("src/math.lk");
    }

    @Test
    public void testSquareInteger() {
        assertEquals(execute("Square(5)").toString(), "25");
    }

    @Test
    public void testSquareNegative() {
        assertEquals(execute("Square(-3)").toString(), "9");
    }

    @Test
    public void testSquareZero() {
        assertEquals(execute("Square(0)").toString(), "0");
    }

    @Test
    public void testSquareDecimal() {
        assertEquals(execute("Square(2.5)").toString(), "6.25");
    }

    @Test
    public void testSquarePolynomial() {
        // Var('x') * Var('x') should produce x^2
        assertEquals(execute("Square(Var('x'))").toString(), "x^2");
    }

    @Test
    public void testSquareNonNumericNonPolyReturnsUndefined() {
        assertEquals(execute("Square(True)").toString(), "Undefined");
    }
}
