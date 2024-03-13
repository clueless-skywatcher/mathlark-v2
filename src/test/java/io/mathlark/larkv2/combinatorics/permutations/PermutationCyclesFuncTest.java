package io.mathlark.larkv2.combinatorics.permutations;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PermutationCyclesFuncTest {
    @Test
    public void testCycles() {
        assertEquals(execute("PermutationCycles([2, 1, 3])"), execute("[[1, 2]]"));
        assertEquals(execute("PermutationCycles([1, 2, 5, 6, 3, 4])"), execute("[[3, 5], [4, 6]]"));
    }
}
