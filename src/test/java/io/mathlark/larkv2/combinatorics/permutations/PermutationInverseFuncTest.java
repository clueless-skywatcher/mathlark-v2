package io.mathlark.larkv2.combinatorics.permutations;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PermutationInverseFuncTest {
    @Test
    public void testInverse() {
        execute("a := Permutation([3, 5, 1, 2, 4])");
        assertEquals(execute("PermutationInverse(a)"), execute("Permutation([3, 4, 1, 5, 2])"));
        execute("a := Permutation([4, 1, 2, 5, 3])");
        assertEquals(execute("PermutationInverse(a)"), execute("Permutation([2, 3, 5, 1, 4])"));
        execute("a := CyclesToPerm([[1, 4, 5, 3, 2]])");
        assertEquals(execute("PermutationInverse(a)"), execute("CyclesToPerm([[1, 2, 3, 5, 4]])"));
    }
}
