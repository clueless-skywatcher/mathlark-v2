package io.mathlark.larkv2.strings;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringLengthTest {
    @Test
    public void testStrLength() {
        assertEquals(execute("StringLength(\"\")"), 0L);
        assertEquals(execute("StringLength(\"a\")"), 1L);
        assertEquals(execute("StringLength(\"ab\")"), 2L);
        assertEquals(execute("StringLength(\"abc\")"), 3L);
    }
}
