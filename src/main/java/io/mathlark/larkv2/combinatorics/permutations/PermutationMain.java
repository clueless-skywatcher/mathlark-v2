package io.mathlark.larkv2.combinatorics.permutations;

public class PermutationMain {
    public static void main(String[] args) {
        PermutationObject p1 = new PermutationObject(new int[] {3, 2, 1});
        PermutationObject p2 = new PermutationObject(new int[] {2, 1, 3});

        System.out.println(p1.compose(p2));
        System.out.println(p2.compose(p1));
    }
}
