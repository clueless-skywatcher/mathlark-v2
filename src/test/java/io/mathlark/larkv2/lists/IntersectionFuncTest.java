package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class IntersectionFuncTest {
    @Test
    public void testIntersection() {
        assertEquals(execute("Intersection([1, 2, 3], [1, 2], [2])"), List.of(2L));
        assertEquals(execute("Intersection([1, 2, 2, 3], [1, 2, 2], [2])"), List.of(2L));
        assertEquals(execute("Intersection([1, 2, 2, 3], [1, 2, 2])"), List.of(1L, 2L));
        assertEquals(execute("Intersection([1, 2, 3], [1, 2])"), List.of(1L, 2L));
        assertEquals(execute("Intersection([1, 2, 3])"), List.of(1L, 2L, 3L));
        assertEquals(execute("Intersection([])"), List.of());
        assertEquals(execute("Intersection([], [1, 2])"), List.of());
        assertEquals(execute("Intersection([1, 2, [1, 2]], [1])"), List.of(1L));
        assertEquals(execute("Intersection([1, 2, [1, 2]], [[1, 2]])"), List.of(List.of(1L, 2L)));
        assertEquals(execute("Intersection([[], 1, 2], [[]])"), List.of(List.of()));
        assertEquals(execute("Intersection([[1, 2, [1, 2]]], [[1, 2, [1, 2]], 3, 4])"), execute("[[1, 2, [1, 2]]]"));
        assertEquals(execute("Intersection([1, 1, 2, 3], [3, 1, 4], [4, 1, 3, 3])"), execute("[1, 3]"));
    }
}
