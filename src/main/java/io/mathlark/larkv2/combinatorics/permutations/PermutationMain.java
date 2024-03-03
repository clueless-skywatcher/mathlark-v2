package io.mathlark.larkv2.combinatorics.permutations;

import java.util.List;

public class PermutationMain {
    public static void main(String[] args) {
        PermutationObject p1 = Permutations.cycleToPerm(List.of(
            List.of(0, 1, 2, 3)
        ));
        PermutationObject p2 = Permutations.cycleToPerm(List.of(
            List.of(0, 1),
            List.of(2, 3)
        ));
        PermutationGroup grp = new PermutationGroup(List.of(p1, p2));
        for (PermutationObject perm: grp.getElements()) {
            System.out.println(perm.toString());
        }
    }
}
