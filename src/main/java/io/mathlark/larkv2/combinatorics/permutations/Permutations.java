package io.mathlark.larkv2.combinatorics.permutations;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;

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

    public static PermutationObject cycleToPerm(List<List<Integer>> cycles) {
        int maxVal = 0;
        for (List<Integer> cycle: cycles) {
            for(int i: cycle) {
                if (i > maxVal) {
                    maxVal = i;
                }
            }
        }
        return cycleToPerm(cycles, maxVal + 1);
    }

    public static PermutationObject cycleToPerm(List<List<Integer>> cycles, int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        for (List<Integer> cycle: cycles) {
            for (int i = 0; i < cycle.size(); i++) {
                result[cycle.get(i)] = cycle.get((i + 1) % cycle.size());
            }
        }
        return new PermutationObject(result);
    }

    public static PermutationExp cycleToPerm(ListExpression expr) {
        List<IExpression> exprs = expr.val();

        List<List<Integer>> cycles = new ArrayList<>();

        for (IExpression l: exprs) {
            List<Integer> cycle = new ArrayList<>();
            for (IExpression numExp: ((ListExpression) l).val()) {
                NumericExpression num = (NumericExpression) numExp;
                cycle.add(num.value.intValue() - 1);
            }
            cycles.add(cycle);
        }

        return new PermutationExp(cycleToPerm(cycles));
    }

    public static PermutationExp cycleToPerm(ListExpression expr, NumericExpression n) {
        List<IExpression> exprs = expr.val();

        List<List<Integer>> cycles = new ArrayList<>();

        for (IExpression l: exprs) {
            List<Integer> cycle = new ArrayList<>();
            for (IExpression numExp: ((ListExpression) l).val()) {
                NumericExpression num = (NumericExpression) numExp;
                cycle.add(num.value.intValue() - 1);
            }
            cycles.add(cycle);
        }

        int length = n.value.intValue();
        
        return new PermutationExp(cycleToPerm(cycles, length));
    }
}
