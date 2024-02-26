package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class RestFuncTest {
    @Test
    public void testRest() {
        assertEquals(execute("Rest([])"), List.of());
        assertEquals(execute("Rest([1])"), List.of());
        assertEquals(execute("Rest([1, 2, 3])"), List.of(2L, 3L));
        assertEquals(execute("Rest(List(1, 2))"), List.of(2L));
        assertEquals(execute("Rest(List(True, 444, \"abc\"))"), List.of(444L, "abc"));
        assertEquals(execute("Rest([1, 2, [11, 29, 35]])"), List.of(2L, List.of(11L, 29L, 35L)));
        assertEquals(execute("Rest([[1, 2, 3], 11, 16])"), List.of(11L, 16L));
    }
}
