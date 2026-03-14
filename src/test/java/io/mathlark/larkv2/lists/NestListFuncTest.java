package io.mathlark.larkv2.lists;

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
        LarkFileReader.loadResource("src/list.lk");
    }

    @Test
    public void testNestListWithBuiltinFunction() {
        // NestList(Increment, 1, 5) = [1, 2, 3, 4, 5, 6]
        assertEquals(execute("NestList(Increment, 1, 5)"), List.of(1L, 2L, 3L, 4L, 5L, 6L));
    }

    @Test
    public void testNestListWithLambda() {
        // NestList((x) -> {x * 2}, 1, 4) = [1, 2, 4, 8, 16]
        assertEquals(execute("NestList((x) -> {x * 2}, 1, 4)"), List.of(1L, 2L, 4L, 8L, 16L));
    }

    @Test
    public void testNestListZeroIterations() {
        // NestList(Increment, 5, 0) = [5]
        assertEquals(execute("NestList(Increment, 5, 0)"), List.of(5L));
    }

    @Test
    public void testNestListWithSquare() {
        // NestList(Square, 2, 3) = [2, 4, 16, 256]
        assertEquals(execute("NestList(Square, 2, 3)"), List.of(2L, 4L, 16L, 256L));
    }

    @Test
    public void testNestListWithDecrement() {
        // NestList(Decrement, 10, 3) = [10, 9, 8, 7]
        assertEquals(execute("NestList(Decrement, 10, 3)"), List.of(10L, 9L, 8L, 7L));
    }
}
