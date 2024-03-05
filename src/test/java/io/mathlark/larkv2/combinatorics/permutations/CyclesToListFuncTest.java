package io.mathlark.larkv2.combinatorics.permutations;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CyclesToListFuncTest {
    @Test
    public void testCycle2List() {
        assertEquals(execute("CyclesToList([[3, 5], [4, 6]])"), execute("Permutation([1, 2, 5, 6, 3, 4])"));
        execute("a := [1, 2, 5, 6, 3, 4]");
        assertEquals(execute("CyclesToList(PermutationCycles(a))"), execute("Permutation(a)"));
        assertEquals(execute("CyclesToList([[3, 5], [4, 6]], 7)"), execute("Permutation([1, 2, 5, 6, 3, 4, 7])"));
    }
}
