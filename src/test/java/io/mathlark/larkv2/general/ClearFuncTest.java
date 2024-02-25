package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClearFuncTest {
    @Test
    public void testClear() {
        assertEquals("Undefined", execute("a1"));
        execute("a1 := 24.5");
        assertEquals(24.5, execute("a1"));
        execute("Clear()");
        assertEquals("Undefined", execute("a1"));
    }
}
