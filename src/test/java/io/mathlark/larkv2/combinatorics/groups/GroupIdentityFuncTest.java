package io.mathlark.larkv2.combinatorics.groups;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;

public class GroupIdentityFuncTest {
    @Test
    public void testIdentity() {
        execute("g := PermutationGroup([CyclesToPerm([[1, 3], [2, 4]]), CyclesToPerm([[1, 2]])])");
        assertEquals(execute("GroupIdentity(g)"), execute("Permutation([1, 2, 3, 4])"));
    }
}
