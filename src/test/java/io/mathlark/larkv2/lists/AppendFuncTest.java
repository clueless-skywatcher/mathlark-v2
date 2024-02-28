package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class AppendFuncTest {
    @Test
    public void testAppend() {
        assertEquals(execute("Append([], \"a\")"), List.of("a"));
        assertEquals(execute("Append([1, 2, 3], 1)"), List.of(1L, 2L, 3L, 1L));
        assertEquals(execute("Append(List(1, 2, 3), 1)"), List.of(1L, 2L, 3L, 1L));
        assertEquals(execute("Append(List(True, \"abc\", 444), [1, 2, 3])"), List.of(true, "abc", 444L, List.of(1L, 2L, 3L)));
        assertEquals(execute("Append([True, False], True)"), List.of(true, false, true));
        assertEquals(execute("Append([1, 2, 3], 1)"), execute("List(1, 2, 3, 1)"));
    }
}
