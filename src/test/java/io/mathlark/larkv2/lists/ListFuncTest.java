package io.mathlark.larkv2.lists;

import java.util.List;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class ListFuncTest {
    @Test
    public void testFunc() {
        assertEquals(execute("[1, 2, 3]"), execute("List(1, 2, 3)"));
        assertEquals(execute("[1, 2, List(1, 2), 3]"), execute("List(1, 2, List(1, 2), 3)"));
        assertEquals(execute("[1, 2, [1, 2], 3]"), execute("List(1, 2, List(1, 2), 3)"));
        execute("a1 := List(1, 2, 3)");
        assertEquals(execute("a1"), List.of(1L, 2L, 3L));
        execute("a := List(4, 5, 6)");
        assertEquals(execute("a1 + a"), execute("List(1, 2, 3, 4, 5, 6)"));
        assertEquals(execute("List(\"a\", \"b\", \"c\")"), List.of("a", "b", "c"));
        assertEquals(execute("[a1 := 2, 2, 8, 1]"), execute("List(2, 2, 8, 1)"));
        assertEquals(execute("a1"), 2L);
    }

    @Test
    public void testAdd() {
        assertEquals(execute("List(1, 2, 3) + 1"), execute("List(1, 2, 3, 1)"));
        assertEquals(execute("List(1, 2, 3) + List(1, 2)"), execute("List(1, 2, 3, 1, 2)"));
        execute("l1 := List(1, 2, 3)");
        execute("l2 := List(4, 5, 6)");
        execute("s := \"a\"");
        execute("l3 := l1 + l2");
        assertEquals(execute("l3"), execute("List(1, 2, 3, 4, 5, 6)"));
        assertEquals(execute("l3 + s"), execute("List(1, 2, 3, 4, 5, 6, \"a\")"));
    }

    @Test
    public void testHead() {
        assertEquals("List", execute("Head(List(1, 2, 3))"));
    }

    @AfterEach
    public void clear() {
        execute("ClearAll()");
    }
}
