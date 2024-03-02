package io.mathlark.larkv2.combinatorics.permutations;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PermutationFuncTest {
    @Test
    public void testPermutationFuncTest() {
        assertEquals(execute("AsList(Permutation([1, 2, 3]))"), List.of(1L, 2L, 3L));
        assertEquals(execute("AsList(Permutation([]))"), List.of());
        assertEquals(execute("AsList(Permutation(3))"), execute("[1, 2, 3]"));
    }

    @Test
    public void testComposition() {
        execute("ClearAll()");
        execute("p1 := Permutation([2, 1, 3])");
        execute("p2 := Permutation([1, 3, 2])");
        assertEquals(execute("AsList(p1 * p2)"), execute("[3, 1, 2]"));
        assertEquals(execute("AsList(p2 * p1)"), execute("[2, 3, 1]"));
        assertEquals(execute("AsList(Permutation(List(2, 1, 3)))"), execute("List(2, 1, 3)"));
        assertEquals(execute("Permutation([2, 1, 3]) * Permutation([1, 3, 2])"), execute("Permutation([3, 1, 2])"));
        assertEquals(execute("Permutation([1, 3, 2]) * Permutation([2, 1, 3])"), execute("Permutation([2, 3, 1])"));
    }
}
