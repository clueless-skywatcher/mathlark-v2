package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HeadFuncTest {
    @Test
    public void testHead() {
        assertEquals("Integer", execute("Head(1)"));
        assertEquals("Decimal", execute("Head(1.5)"));
        assertEquals("Boolean", execute("Head(True)"));
        assertEquals("Boolean", execute("Head(False)"));
        assertEquals("String", execute("Head(\"abc\")"));
        assertEquals("Undefined", execute("Head(Undefined)"));
        assertEquals("List", execute("Head([1, 2, 3])"));
    }
}
