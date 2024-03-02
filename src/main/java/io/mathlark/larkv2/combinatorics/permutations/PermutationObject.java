package io.mathlark.larkv2.combinatorics.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import io.mathlark.larkv2.combinatorics.exceptions.PermutationException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;

public class PermutationObject {
    private int[] p;

    /**
     * Generates an identity permutation of length n
     * @param length length of the permutation
     */
    public PermutationObject(int length) {
        p = new int[length];
        for (int i = 0; i < length; i++) {
            p[i] = i;
        }
    }

    /**
     * Generates a permutation made of the specified array
     * @param p
     */
    public PermutationObject(int[] p) {
        if (!Permutations.isValidPermutation(p)) {
            throw new PermutationException("Permutation must contain numbers from 0 to " + Integer.toString(p.length - 1));
        }
        this.p = p;
    }

    public PermutationObject(List<IExpression> p) {
        this(processList(p));
    }

    private static int[] processList(List<IExpression> p) {
        int[] val = new int[p.size()];
        for (int i = 0; i < p.size(); i++) {
            val[i] = ((NumericExpression) p.get(i)).value.intValue();
        }
        return val;
    }

    public PermutationObject compose(PermutationObject other) {
        if (this.p.length != other.p.length) {
            throw new PermutationException("Both permutations should have the same length");
        }
        int[] result = new int[this.p.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = other.p[this.p[i]];
        }

        return new PermutationObject(result);
    }

    public String toString() {
        return String.format("Permutation(%s)", Arrays.toString(getArray()));
    }

    public boolean equals(Object other) {
        if (other instanceof PermutationObject) {
            return Arrays.equals(this.p, ((PermutationObject) other).p);
        }
        return false;
    }

    public int[] getArray() {
        int[] copy = new int[p.length];
        System.arraycopy(p, 0, copy, 0, p.length);
        for (int i = 0; i < copy.length; i++) {
            copy[i]++;
        }
        return copy;
    }

    public List<IExpression> getList() {
        int[] array = getArray();
        List<IExpression> expr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            expr.add(new NumericExpression(array[i]));
        }
        return expr;
    }
}
