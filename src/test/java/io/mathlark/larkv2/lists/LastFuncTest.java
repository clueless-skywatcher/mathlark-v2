package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LastFuncTest {
    @Test
    public void testLast() {
        assertEquals(execute("Last([1, 2, 3])"), 3L);
        assertEquals(execute("Last([1])"), 1L);
        assertEquals(execute("Last(List(1, 2, 3))"), 3L);
        assertEquals(execute("Last(List(True, 444, \"abc\"))"), "abc");
        assertEquals(execute("Last([1, 2, [1, 2, 3]])"), List.of(1L, 2L, 3L));
        assertEquals(execute("Last([])"), "Undefined");
    }
}
