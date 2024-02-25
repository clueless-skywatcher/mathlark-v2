package io.mathlark.larkv2.expressions;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringExpressionTest {
    @Test
    public void testString() {
        assertEquals("abc", execute("\"abc\""));
    }
}
