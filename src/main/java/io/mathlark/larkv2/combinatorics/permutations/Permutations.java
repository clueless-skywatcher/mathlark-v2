package io.mathlark.larkv2.combinatorics.permutations;

import java.util.Arrays;

public class Permutations {
    /**
     * Checks if a permutation has elements from 0 to n - 1
     * only
     * @return
     */
    public static boolean isValidPermutation(int[] perm) {
        int[] permCopy = new int[perm.length];
        System.arraycopy(perm, 0, permCopy, 0, perm.length);
        Arrays.sort(permCopy);

        for (int i = 0; i < perm.length; i++) {
            if (permCopy[i] != i) {
                return false;
            }
        }

        return true;
    }
}
