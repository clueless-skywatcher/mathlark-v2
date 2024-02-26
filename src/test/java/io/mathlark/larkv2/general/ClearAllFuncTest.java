package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClearAllFuncTest {
    @Test
    public void testClearAll() {
        assertEquals("Undefined", execute("a1"));
        execute("a1 := 24.5");
        assertEquals(24.5, execute("a1"));
        execute("ClearAll()");
        assertEquals("Undefined", execute("a1"));
    }
}
