package io.mathlark.larkv2.stdlib.math;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.fileread.LarkFileReader;

public class LesserFuncTest {

    @BeforeAll
    public static void loadStdlib() {
        LarkFileReader.loadResource("src/math.lk");
    }

    @Test
    public void testLesserFirstSmaller() {
        assertEquals(execute("Lesser(2, 8)").toString(), "2");
    }

    @Test
    public void testLesserSecondSmaller() {
        assertEquals(execute("Lesser(9, 4)").toString(), "4");
    }

    @Test
    public void testLesserEqual() {
        assertEquals(execute("Lesser(5, 5)").toString(), "5");
    }

    @Test
    public void testLesserNegatives() {
        assertEquals(execute("Lesser(-3, -7)").toString(), "-7");
    }

    @Test
    public void testLesserMixed() {
        assertEquals(execute("Lesser(-1, 1)").toString(), "-1");
    }

    @Test
    public void testLesserDecimals() {
        assertEquals(execute("Lesser(3.5, 2.1)").toString(), "2.1");
    }

    @Test
    public void testLesserZero() {
        assertEquals(execute("Lesser(0, 1)").toString(), "0");
    }

    @Test
    public void testLesserNonNumericReturnsUndefined() {
        assertEquals(execute("Lesser(True, 1)").toString(), "Undefined");
    }
}
