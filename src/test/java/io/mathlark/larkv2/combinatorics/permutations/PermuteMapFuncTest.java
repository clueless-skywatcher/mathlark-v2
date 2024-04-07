package io.mathlark.larkv2.combinatorics.permutations;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PermuteMapFuncTest {
    @Test
    public void testPermuteMap() {
        assertEquals(execute("PermuteMap(1, Permutation([2, 1, 3, 5, 4]))"), 2L);
        assertEquals(execute("PermuteMap(2, Permutation([2, 1, 3, 5, 4]))"), 1L);
        assertEquals(execute("PermuteMap(3, Permutation([2, 1, 3, 5, 4]))"), 3L);
        assertEquals(execute("PermuteMap(4, Permutation([2, 1, 3, 5, 4]))"), 5L);
        assertEquals(execute("PermuteMap(5, Permutation([2, 1, 3, 5, 4]))"), 4L);

        assertEquals(execute("PermuteMap([], Permutation([2, 1, 3, 5, 4]))"), execute("[]"));
        assertEquals(execute("PermuteMap([1], Permutation([2, 1, 3, 5, 4]))"), execute("[2]"));
        assertEquals(execute("PermuteMap([1, 2], Permutation([2, 1, 3, 5, 4]))"), execute("[2, 1]"));
        assertEquals(execute("PermuteMap([1, 2, 3], Permutation([2, 1, 3, 5, 4]))"), execute("[2, 1, 3]"));
        assertEquals(execute("PermuteMap([1, 2, 3, 4], Permutation([2, 1, 3, 5, 4]))"), execute("[2, 1, 3, 5]"));
        assertEquals(execute("PermuteMap([1, 2, 3, 4, 5], Permutation([2, 1, 3, 5, 4]))"), execute("[2, 1, 3, 5, 4]"));

        assertEquals(execute("PermuteMap(1.5, [2, 1, 3, 5, 4])"), "Undefined");
        assertEquals(execute("PermuteMap(1, [2, 1, 3, 5, 4])"), "Undefined");
        assertEquals(execute("PermuteMap([1.5], Permutation([2, 1, 3, 5, 4]))"), "Undefined");
        assertEquals(execute("PermuteMap([1.5], [2, 1, 3, 5, 4])"), "Undefined");
    }
}
