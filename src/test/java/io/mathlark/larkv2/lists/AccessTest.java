package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class AccessTest {
    @Test
    public void testList() {
        assertEquals(execute("List(1, 2, 3){0}"), 1L);
        assertEquals(execute("List(1, 2, 3){1}"), 2L);
        assertEquals(execute("List(1, 2, 3){2}"), 3L);
        assertEquals(execute("List(69, 81, 95){-1}"), 95L);
        assertEquals(execute("List(69, True, 95){-2}"), "True");
        assertEquals(execute("List(\"||\", 81, 95){-3}"), "||");
    }

    @Test
    public void testElementAt() {
        execute("a := List(1, 2, 3)");
        assertEquals(execute("ElementAt(a, 0)"), 1L);
        assertEquals(execute("ElementAt(a, 1)"), 2L);
        assertEquals(execute("ElementAt(a, 2)"), 3L);
        execute("a := List(1, List(11, 23, 69), 3)");
        assertEquals(execute("ElementAt(a, 1)"), List.of(11L, 23L, 69L));
        assertEquals(execute("ElementAt(ElementAt(a, 1), 2)"), 69L);
        assertEquals(execute("ElementAt(a, -1)"), 3L);
        assertEquals(execute("ElementAt(a, -2)"), List.of(11L, 23L, 69L));
        assertEquals(execute("ElementAt(a, -3)"), 1L);
        assertEquals(execute("ElementAt(ElementAt(a, -2), -1)"), 69L);
        assertEquals(execute("ElementAt(ElementAt(a, -2), -2)"), 23L);
        assertEquals(execute("ElementAt(ElementAt(a, -2), -3)"), 11L);
    }
}