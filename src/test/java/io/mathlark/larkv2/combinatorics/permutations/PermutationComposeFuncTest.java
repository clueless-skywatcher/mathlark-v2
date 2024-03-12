package io.mathlark.larkv2.combinatorics.permutations;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PermutationComposeFuncTest {
    @Test
    public void testCompose() {
        assertEquals(execute("PermutationCompose([1, 2, 3], [3, 1, 2])"), execute("Permutation([3, 1, 2])"));
        assertEquals(execute("PermutationCompose(Permutation([1, 2, 3]), Permutation([3, 1, 2]))"), execute("Permutation([3, 1, 2])"));
        assertEquals(execute("PermutationCompose([2, 1, 3], Permutation([1, 3, 2]))"), execute("Permutation([3, 1, 2])"));
        assertEquals(execute("PermutationCompose(Permutation([1, 3, 2]), [2, 1, 3])"), execute("Permutation([2, 3, 1])"));

        execute("a := CyclesToPerm([[1, 2]])");
        execute("b := CyclesToPerm([[1, 3]])");
        assertEquals(execute("PermutationCompose(a, b)"), execute("CyclesToPerm([[1, 2, 3]])"));
        assertEquals(execute("PermutationCompose(b, a)"), execute("CyclesToPerm([[1, 3, 2]])"));
    }
}
