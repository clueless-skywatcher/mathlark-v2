package io.mathlark.larkv2.combinatorics.groups;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GroupOrderFuncTest {
    @Test
    public void testOrder() {
        execute("g := PermutationGroup([CyclesToPerm([[1, 3], [2, 4]]), CyclesToPerm([[1, 2]])])");
        assertEquals(execute("GroupOrder(g)"), execute("8"));
        execute("g := PermutationGroup([CyclesToPerm([[2, 10], [4, 11], [5, 7], [8, 9]]), CyclesToPerm([[1, 4, 3, 8], [2, 5, 6, 7]])])");
        assertEquals(execute("GroupOrder(g)"), execute("2880"));
    }
}
