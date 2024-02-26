package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FirstFuncTest {
    @Test
    public void testFirst() {
        assertEquals(execute("First([])"), "Undefined");
        assertEquals(execute("First([1, 2, 3])"), 1L);
        assertEquals(execute("First(List(1, 2, 3))"), 1L);
        assertEquals(execute("First(List(True, \"abc\", 444))"), "True");
        assertEquals(execute("First([[1, 2, 3], 2, 3])"), List.of(1L, 2L, 3L));
    }
}
