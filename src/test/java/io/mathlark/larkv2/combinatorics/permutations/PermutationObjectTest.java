package io.mathlark.larkv2.combinatorics.permutations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import io.mathlark.larkv2.combinatorics.exceptions.PermutationException;
import io.mathlark.larkv2.expressions.math.NumericExpression;

public class PermutationObjectTest {
    @Test
    public void testObj() {
        PermutationObject perm1 = new PermutationObject(new int[] { 1, 0, 2 });
        PermutationObject perm2 = new PermutationObject(List.of(
                new NumericExpression(1),
                new NumericExpression(0),
                new NumericExpression(2)));
        assertEquals(perm1, perm2);

        perm1 = new PermutationObject(3);
        perm2 = new PermutationObject(List.of(
                new NumericExpression(0),
                new NumericExpression(1),
                new NumericExpression(2)));
        assertEquals(perm1, perm2);

        assertThrows(PermutationException.class, new Executable() {
            @SuppressWarnings("unused")
            @Override
            public void execute() throws Throwable {
                PermutationObject perm1 = new PermutationObject(new int[] { 1, 3, 8 });
            }
        });
    }

    @Test
    public void testCompose() {
        PermutationObject p1 = new PermutationObject(new int[] { 2, 1, 0 });
        PermutationObject p2 = new PermutationObject(new int[] { 1, 0, 2 });
        PermutationObject p2p1 = new PermutationObject(new int[] { 1, 2, 0 });
        assertEquals(p2.compose(p1), p2p1);

        PermutationObject p1p2 = new PermutationObject(new int[] { 2, 0, 1 });
        assertEquals(p1.compose(p2), p1p2);
        assertNotEquals(p1.compose(p2), p2.compose(p1));
    }

    @Test
    public void testCyclize() {
        PermutationObject p1 = new PermutationObject(new int[] { 2, 1, 0 });
        assertEquals(p1.cyclize(), List.of(List.of(0, 2)));
        PermutationObject p2 = new PermutationObject(new int[] { 0, 1, 4, 5, 2, 3 });
        assertEquals(p2.cyclize(), List.of(List.of(2, 4), List.of(3, 5)));
    }

    @Test
    public void testCycle() {
        PermutationObject p2 = new PermutationObject(new int[] { 0, 1, 4, 5, 2, 3 });
        List<List<Integer>> cycles = p2.cyclize();
        assertEquals(Permutations.cycleToPerm(cycles), new PermutationObject(new int[] { 0, 1, 4, 5, 2, 3 }));
        assertEquals(Permutations.cycleToPerm(cycles, 10),
                new PermutationObject(new int[] { 0, 1, 4, 5, 2, 3, 6, 7, 8, 9 }));
    }

    @Test
    public void testPermFromCycle() {
        List<List<Integer>> cycles = List.of(
                List.of(2, 19, 21, 8),
                List.of(3, 17, 20, 10),
                List.of(4, 6, 7, 5));
        assertEquals(Permutations.cycleToPerm(cycles), new PermutationObject(new int[] {
                0, 1, 19, 17, 6, 4, 7, 5, 2, 9, 3, 11, 12, 13, 14, 15, 16, 20, 18, 21, 10, 8
        }));
    }

    @Test
    public void testPermute() {
        PermutationObject p1 = new PermutationObject(new int[] { 2, 1, 0 });
        assertEquals(p1.permute(List.of("abc", "def", "ghi")), List.of("ghi", "def", "abc"));
        assertEquals(p1.permute(List.of("abc", "def", "ghi", "jkl", "mno")),
                List.of("ghi", "def", "abc", "jkl", "mno"));
        assertThrows(PermutationException.class, new Executable() {
            public void execute() {
                p1.permute(List.of("abc", "def"));
            }
        });
        PermutationObject p2 = new PermutationObject(new int[] {0, 1, 4, 5, 2, 3});
        List<List<Integer>> cycles = p2.cyclize();
        assertEquals(Permutations.cycleToPerm(cycles), new PermutationObject(new int[] {0, 1, 4, 5, 2, 3}));
        assertEquals(Permutations.cycleToPerm(cycles, 10), new PermutationObject(new int[] {0, 1, 4, 5, 2, 3, 6, 7, 8, 9}));
    }

    @Test
    public void testInverse() {
        PermutationObject p1 = new PermutationObject(new int[]{4, 3, 1, 0, 2});
        assertEquals(p1.inverse(), new PermutationObject(new int[]{3, 2, 4, 1, 0}));
        assertEquals(p1.inverse().inverse(), p1);
        PermutationObject p2 = new PermutationObject(new int[]{0});
        assertEquals(p2.inverse(), new PermutationObject(new int[]{0}));
        assertEquals(p2.inverse().inverse(), p2);
        PermutationObject p3 = new PermutationObject(new int[]{0, 1});
        assertEquals(p3.inverse(), new PermutationObject(new int[]{0, 1}));
        assertEquals(p3.inverse().inverse(), p3);
        PermutationObject p4 = new PermutationObject(new int[]{1, 2, 0});
        assertEquals(p4.inverse(), new PermutationObject(new int[]{2, 0, 1}));
        assertEquals(p4.inverse().inverse(), p4);
    }

    @Test
    public void testPower() {
        PermutationObject p1 = new PermutationObject(new int[]{2, 0, 3, 4, 1});
        assertEquals(p1.power(-1), new PermutationObject(new int[]{1, 4, 0, 2, 3}));
        assertEquals(p1.power(2), p1.compose(p1));
        assertEquals(p1.power(1), p1);
        assertEquals(p1.power(3), p1.compose(p1.compose(p1)));
        assertEquals(p1.power(10), p1.power(5).compose(p1.power(5)));
        assertEquals(p1.power(0), new PermutationObject(p1.getLength()));
    }
}
