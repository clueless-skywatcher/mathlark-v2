package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LambdaTest {
    @Test
    public void testMapWithLambda() {
        assertEquals(execute("Map((x) -> {x^2}, [1, 2, 3, 4])"), List.of(1L, 4L, 9L, 16L));
    }

    @Test
    public void testMapWithLambdaAddition() {
        assertEquals(execute("Map((x) -> {x + 10}, [1, 2, 3])"), List.of(11L, 12L, 13L));
    }

    @Test
    public void testMapWithLambdaMultiplication() {
        assertEquals(execute("Map((x) -> {x * 3}, [2, 5, 10])"), List.of(6L, 15L, 30L));
    }

    @Test
    public void testLambdaDoesNotPolluteScope() {
        execute("a := 42");
        assertEquals(execute("Map((a) -> {a + 1}, [1, 2, 3])"), List.of(2L, 3L, 4L));
        assertEquals(execute("a"), 42L);
    }
}
