package io.mathlark.larkv2.numbers;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IncrementFuncTest {
    @Test
    public void test() {
        assertEquals(execute("Increment(1)"), 2L);
        assertEquals(execute("Increment(2.5)"), 3.5);
        assertEquals(execute("Increment(Increment(1))"), 3L);
        assertEquals(execute("Increment(10000000)"), 10000001L);
        assertEquals(execute("Increment(10.12341234)"), 11.12341);
        assertEquals(execute("Increment(-1)"), 0L);
        assertEquals(execute("Increment(-10)"), -9L);
        assertEquals(execute("Increment(-10.1245)"), -9.1245);

        execute("a := Increment(1)");
        assertEquals(execute("a"), 2L);
        execute("a := Increment(Increment(1))");
        assertEquals(execute("a"), 3L);
        execute("a := Increment(Increment(a))");
        assertEquals(execute("a"), 5L);
    }
}