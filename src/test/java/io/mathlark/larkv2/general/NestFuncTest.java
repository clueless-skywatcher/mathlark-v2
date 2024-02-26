package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NestFuncTest {
    @Test
    public void testNest() {
        execute("<f>");
        execute("x := \"x\"");

        assertEquals(execute("Nest(f, x, 0)"), "x");
        assertEquals(execute("Nest(f, x, 1)"), "f(x)");
        assertEquals(execute("Nest(f, x, 2)"), "f(f(x))");
        assertEquals(execute("Nest(f, x, 3)"), "f(f(f(x)))");
        assertEquals(execute("Nest(f, x, 4)"), "f(f(f(f(x))))");

        assertEquals(execute("Nest(Increment, 1, 0)"), 1L);
        assertEquals(execute("Nest(Increment, 1, 1)"), 2L);
        assertEquals(execute("Nest(Increment, 1, 2)"), 3L);
        assertEquals(execute("Nest(Increment, 1, 3)"), 4L);
        assertEquals(execute("Nest(Increment, 1, 4)"), 5L);
        assertEquals(execute("Nest(Increment, 1, 5)"), 6L);
    }
}
