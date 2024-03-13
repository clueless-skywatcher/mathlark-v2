package io.mathlark.larkv2.combinatorics.permutations;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CyclesToPermFuncTest {
    @Test
    public void testCycle2List() {
        assertEquals(execute("CyclesToPerm([[3, 5], [4, 6]])"), execute("Permutation([1, 2, 5, 6, 3, 4])"));
        execute("a := [1, 2, 5, 6, 3, 4]");
        assertEquals(execute("CyclesToPerm(PermutationCycles(a))"), execute("Permutation(a)"));
        assertEquals(execute("CyclesToPerm([[3, 5], [4, 6]], 7)"), execute("Permutation([1, 2, 5, 6, 3, 4, 7])"));
    }
}
