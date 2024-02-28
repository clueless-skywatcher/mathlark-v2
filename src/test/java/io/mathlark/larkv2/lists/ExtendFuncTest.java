package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ExtendFuncTest {
    @Test
    public void testExtend() {
        assertEquals(execute("Extend([], \"a\")"), "Undefined");
        assertEquals(execute("Extend([1, 2, 3], [1])"), List.of(1L, 2L, 3L, 1L));
        assertEquals(execute("Extend(List(1, 2, 3), [1])"), List.of(1L, 2L, 3L, 1L));
        assertEquals(execute("Extend(List(True, \"abc\", 444), [1, 2, 3])"), List.of(true, "abc", 444L, 1L, 2L, 3L));
        assertEquals(execute("Extend([True, False], [True])"), List.of(true, false, true));
    }
}
