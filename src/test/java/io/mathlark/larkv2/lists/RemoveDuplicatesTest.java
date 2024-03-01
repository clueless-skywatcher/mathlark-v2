package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
    @Test
    public void testRemove() {
        assertEquals(execute("RemoveDuplicates([1, 2, 1, 2, 3])"), List.of(1L, 2L, 3L));
        assertEquals(execute("RemoveDuplicates([True, False, True, False])"), List.of(true, false));
        assertEquals(execute("RemoveDuplicates([\"a\", \"b\", \"a\"])"), List.of("a", "b"));
        assertEquals(execute("RemoveDuplicates([1, 2, 3, [1, 2], [1, 2]])"), List.of(1L, 2L, 3L, List.of(1L, 2L)));
        assertEquals(execute("RemoveDuplicates([[1, 2], 3, [1, 2]])"), List.of(List.of(1L, 2L), 3L));
        assertEquals(execute("RemoveDuplicates([1])"), List.of(1L));
        assertEquals(execute("RemoveDuplicates([1, 1])"), List.of(1L));
    }
}
