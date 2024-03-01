package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class UnionFuncTest {
    @Test
    public void testUnion() {
        assertEquals(execute("Union([1, 2, 3], [1, 2], [2])"), List.of(1L, 2L, 3L));
        assertEquals(execute("Union([1, 2, 2, 3], [1, 2, 2], [2])"), List.of(1L, 2L, 3L));
        assertEquals(execute("Union([1, 2, 2, 3], [1, 2, 2])"), List.of(1L, 2L, 3L));
        assertEquals(execute("Union([1, 2, 3], [1, 2])"), List.of(1L, 2L, 3L));
        assertEquals(execute("Union([1, 2, 3])"), List.of(1L, 2L, 3L));
        assertEquals(execute("Union([])"), List.of());
        assertEquals(execute("Union([], [1, 2])"), List.of(1L, 2L));
        assertEquals(execute("Union([1, 2, [1, 2]], [1])"), execute("[1, 2, [1, 2]]"));
        assertEquals(execute("Union([1, 2, [1, 2]], [[1, 2]])"), execute("[1, 2, [1, 2]]"));
        assertEquals(execute("Union([[], 1, 2], [[]])"), execute("[1, 2, []]"));
        assertEquals(execute("Union([[1, 2, [1, 2]]], [[1, 2, [1, 2]], 3, 4])"), execute("[3, 4, [1, 2, [1, 2]]]"));
        assertEquals(execute("Union([1, 1, 2, 3], [3, 1, 4], [4, 1, 3, 3])"), execute("[1, 2, 3, 4]"));
        assertEquals(execute("Union([1, 2, 1, 3, 6, 2, 2])"), execute("[1, 2, 3, 6]"));
    }
}
