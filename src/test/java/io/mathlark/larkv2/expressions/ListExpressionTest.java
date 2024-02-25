package io.mathlark.larkv2.expressions;

import java.util.List;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class ListExpressionTest {
    @Test
    public void testList() {
        assertEquals(execute("[]"), List.of());
        assertEquals(execute("[1, 2, 3.5]"), List.of(1L, 2L, 3.5));
        execute("a1 := 25");
        assertEquals(execute("[1, a1, a1 + 1]"), List.of(1L, 25L, 26L));
        assertEquals(execute("[1, GCD(a1, 5), a1 + 80.85, [1, 2, 3]]"), List.of(
            1L, 5L, 105.85, List.of(
                1L, 2L, 3L
            )
        ));
        assertEquals(execute("[\"abc\"]"), List.of("abc"));
        assertEquals(execute("[True, False]"), List.of(true, false));
    }

    @AfterEach
    public void clear() {
        execute("Clear()");
    }
}
