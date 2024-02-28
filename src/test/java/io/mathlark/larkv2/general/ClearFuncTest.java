package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClearFuncTest {
    @Test
    public void testClear() {
        assertEquals(execute("Clear(\"a\")"), "Undefined");
        execute("a := 45");
        assertEquals(execute("Clear(\"a\")"), "Cleared variable a");
    }
}
