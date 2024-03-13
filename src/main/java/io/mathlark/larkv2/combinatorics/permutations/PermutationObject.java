package io.mathlark.larkv2.combinatorics.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import io.mathlark.larkv2.combinatorics.exceptions.PermutationException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.ListExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.general.BooleanArraysUtils;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class PermutationObject implements Comparable<PermutationObject> {
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
        int permLength = Math.max(this.p.length, other.p.length);
        PermutationObject thisPerm = this.castToLength(permLength);
        PermutationObject otherPerm = other.castToLength(permLength);

        if (thisPerm.p.length != otherPerm.p.length) {
            throw new PermutationException("Both permutations should have the same length");
        }
        int[] result = new int[permLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = otherPerm.p[thisPerm.p[i]];
        }

        return new PermutationObject(result);
    }

    public String toString() {
        List<List<Integer>> cycles = reprCyclize();

        StringJoiner outer = new StringJoiner("");
        for (List<Integer> cycle: cycles) {
            StringJoiner inner = new StringJoiner(", ");
            for (int c: cycle) {
                inner.add(Integer.toString(c));
            }
            outer.add(String.format("(%s)", inner.toString()));
        }

        return String.format("%s", outer.toString());
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

    public int getLength() {
        return this.p.length;
    }

    public List<IExpression> getList() {
        int[] array = getArray();
        List<IExpression> expr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            expr.add(new NumericExpression(array[i]));
        }
        return expr;
    }

    public List<List<Integer>> cyclize() {
        List<List<Integer>> cycles = new ArrayList<>();
        boolean[] checked = new boolean[this.p.length];
        Arrays.fill(checked, false);
        int lengthCovered = 0;

        while (lengthCovered < this.p.length) {
            int start = BooleanArraysUtils.getNextFalse(checked, 0);
            if (p[start] == start) {
                lengthCovered++;
                checked[start] = true;
                continue;
            }
            List<Integer> cycle = new ArrayList<>();
            while (!checked[start]) {
                checked[start] = true;
                ++lengthCovered;
                cycle.add(start);
                start = p[start];
            }
            cycles.add(cycle);
        }
        return cycles;
    }

    private List<List<Integer>> reprCyclize() {
        List<List<Integer>> cycles = cyclize();
        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> cyc: cycles) {
            List<Integer> cycle = new ArrayList<>();
            for (int p: cyc) {
                cycle.add(p + 1);
            }
            result.add(cycle);
        }

        return result;
    }

    public ListExpression cyclizeAsExpr() {
        List<List<Integer>> cycles = cyclize();

        List<IExpression> outerList = new ArrayList<>();
        for (List<Integer> cycle: cycles) {
            List<IExpression> innerList = new ArrayList<>();
            for (int a: cycle) {
                innerList.add(new NumericExpression(a).add(GlobalSymbols.ONE));
            }
            outerList.add(new ListExpression(innerList));
        }
        
        return new ListExpression(outerList);
    }
    
    public List<Object> permute(List<Object> objs) {
        if (p.length > objs.size()) {
            throw new PermutationException("Cannot permute on smaller objects");
        }
        Object[] resultArr = new Object[objs.size()];

        for (int i = 0; i < p.length; i++) {
            resultArr[p[i]] = objs.get(i);
        }
        for (int i = p.length; i < objs.size(); i++) {
            resultArr[i] = objs.get(i);
        }        
        return Arrays.asList(resultArr);
    }

    public int[] getInternalArray() {
        return p;
    }

    public int hashCode() {
        return Arrays.hashCode(this.p);
    }

    @Override
    public int compareTo(PermutationObject arg0) {
        return Arrays.compare(this.p, arg0.p);
    }

    public PermutationObject inverse() {
        int[] result = new int[this.p.length];
        for (int i = 0; i < this.p.length; i++) {
            result[p[i]] = i;
        }
        return new PermutationObject(result);
    }

    public PermutationObject power(long exp) {
        if (exp == 0) {
            return new PermutationObject(getLength());
        }
        if (exp < 0) {
            long pos = exp / -1;
            return power(pos).inverse();
        }

        PermutationObject result = new PermutationObject(this.p);
        PermutationObject factor = new PermutationObject(this.p);
        while (exp-- > 1) {
            result = result.compose(factor);
        }

        return result;
    }

    private PermutationObject castToLength(int n) {
        if (n < this.p.length) {
            throw new RuntimeException(String.format("Cannot cast permutation to lower than %d elements", this.p.length));
        }
        int[] newP = new int[n];
        for (int i = 0; i < this.p.length; i++) {
            newP[i] = this.p[i];
        }
        for (int i = this.p.length; i < n; i++) {
            newP[i] = i;
        }

        return new PermutationObject(newP);
    }
}
