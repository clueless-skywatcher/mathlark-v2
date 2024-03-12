package io.mathlark.larkv2.combinatorics.permutations;

import java.util.List;

public class PermutationMain {
    public static void main(String[] args) {
        PermutationObject p1 = Permutations.cycleToPerm(List.of(
            List.of(0, 1)
        ));
        PermutationObject p2 = Permutations.cycleToPerm(List.of(
            List.of(0, 2)
        ));

        System.out.println(p1.compose(p2));
    }
}
