package io.mathlark.larkv2.combinatorics.groups;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;

public class GroupGeneratorsFuncTest {
    @Test
    public void testGen() {
        execute("p1 := Permutation([1, 2, 3, 4])");
        execute("p2 := Permutation([2, 1, 4, 3])");
        assertEquals(execute("GroupGenerators(PermutationGroup([p1, p2]))"), execute("[p1, p2]"));
        assertEquals(execute("GroupGenerators(PermutationGroup([p2, p1]))"), execute("[p1, p2]"));
    }
}
