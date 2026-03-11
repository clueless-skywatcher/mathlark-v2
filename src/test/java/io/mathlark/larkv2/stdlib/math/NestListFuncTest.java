package io.mathlark.larkv2.stdlib.math;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.fileread.LarkFileReader;

public class NestListFuncTest {

    @BeforeAll
    public static void loadStdlib() {
        LarkFileReader.loadResource("src/math.lk");
    }

    @Test
    public void testNestListZeroIterations() {
        assertEquals(execute("NestList(Increment, 1, 0)"), List.of(1L));
    }

    @Test
    public void testNestListOneIteration() {
        assertEquals(execute("NestList(Increment, 1, 1)"), List.of(1L, 2L));
    }

    @Test
    public void testNestListMultipleIterations() {
        assertEquals(execute("NestList(Increment, 1, 5)"), List.of(1L, 2L, 3L, 4L, 5L, 6L));
    }

    @Test
    public void testNestListWithDecrement() {
        assertEquals(execute("NestList(Decrement, 10, 3)"), List.of(10L, 9L, 8L, 7L));
    }

    @Test
    public void testNestListWithSquare() {
        assertEquals(execute("NestList(Square, 2, 3)"), List.of(2L, 4L, 16L, 256L));
        assertEquals(execute("NestList(Square, 2, 0)"), List.of(2L));
    }

    @Test
    public void testNestListWithSymbolicFunction() {
        execute("<f>");
        execute("x := \"x\"");
        assertEquals(execute("NestList(f, x, 0)"), List.of("x"));
        assertEquals(execute("NestList(f, x, 1)"), List.of("x", "f(x)"));
    }

    // @Test
    // public void testNestListWithLambda() {
    //     assertEquals(execute("NestList((x) -> x * 2, 1, 4)"), List.of(1L, 2L, 4L, 8L, 16L));
    //     assertEquals(execute("NestList((x) -> x + 10, 0, 3)"), List.of(0L, 10L, 20L, 30L));
    // }
}
