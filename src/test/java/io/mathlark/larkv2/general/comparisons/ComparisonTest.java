package io.mathlark.larkv2.general.comparisons;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComparisonTest {
    @Test
    public void testEqualOp() {
        assertEquals(execute("1 == 1"), "True");
        assertEquals(execute("\"1\" == \"1\""), "True");
        assertEquals(execute("True == True"), "True");
        assertEquals(execute("Undefined == Undefined"), "True");
        assertEquals(execute("Factorial(12) == 479001600"), "True");
        assertEquals(execute("Permutation([1, 2, 3]) == Permutation([1, 2, 3])"), "True");
        execute("a := 6");
        execute("b := 6");
        assertEquals(execute("a == b"), "True");

        assertEquals(execute("1 == 2"), "False");
        assertEquals(execute("1 == \"abc\""), "False");
        assertEquals(execute("11 == Factorial(11)"), "False");
    }

    @Test
    public void testEqualsQFunc() {
        assertEquals(execute("EqualsQ(1, 1)"), "True");
        assertEquals(execute("EqualsQ(\"1\", \"1\")"), "True");
        assertEquals(execute("EqualsQ(True, True)"), "True");
        assertEquals(execute("EqualsQ(Undefined, Undefined)"), "True");
        assertEquals(execute("EqualsQ(Factorial(12), 479001600)"), "True");
        assertEquals(execute("EqualsQ(Permutation([1, 2, 3]), Permutation([1, 2, 3]))"), "True");
        assertEquals(execute("EqualsQ(a := 6, b := 6)"), "True");
        assertEquals(execute("EqualsQ(a, b)"), "True");
    }

    @Test
    public void testGteOp() {
        assertEquals(execute("1 >= 1"), "True");
        assertEquals(execute("\"1\" >= \"1\""), "True");
        assertEquals(execute("True >= True"), "Undefined");
        assertEquals(execute("Undefined >= Undefined"), "Undefined");
        assertEquals(execute("Factorial(12) >= 460000000"), "True");
        assertEquals(execute("Permutation([1, 2, 3]) >= Permutation([1, 2, 3])"), "Undefined");
        execute("a := 8");
        execute("b := 6");
        assertEquals(execute("a >= b"), "True");
    }

    @Test
    public void testGteQFunc() {
        assertEquals(execute("GreaterEqualQ(1, 2)"), "False");
        assertEquals(execute("GreaterEqualQ(\"1\", \"1\")"), "True");
        assertEquals(execute("GreaterEqualQ(True, True)"), "Undefined");
        assertEquals(execute("GreaterEqualQ(Undefined, Undefined)"), "Undefined");
        assertEquals(execute("GreaterEqualQ(Factorial(12), 46000000)"), "True");
        assertEquals(execute("GreaterEqualQ(Permutation([1, 2, 3]), Permutation([1, 2, 3]))"), "Undefined");
        assertEquals(execute("GreaterEqualQ(a := 8, b := 6)"), "True");
        assertEquals(execute("GreaterEqualQ(a, b)"), "True");
    }

    @Test
    public void testLtOp() {
        assertEquals(execute("1 < 1"), "False");
        assertEquals(execute("1 < 2"), "True");
        assertEquals(execute("True < True"), "Undefined");
        assertEquals(execute("Undefined < Undefined"), "Undefined");
        assertEquals(execute("Factorial(10) < 460000000"), "True");
        assertEquals(execute("Permutation([1, 2, 3]) < Permutation([1, 2, 3])"), "Undefined");
        execute("a := 6");
        execute("b := 8");
        assertEquals(execute("a < b"), "True");
    }

    @Test
    public void testLtFunc() {
        assertEquals(execute("LesserQ(1, 1)"), "False");
        assertEquals(execute("LesserQ(1, 2)"), "True");
        assertEquals(execute("LesserQ(True, True)"), "Undefined");
        assertEquals(execute("LesserQ(Undefined, Undefined)"), "Undefined");
        assertEquals(execute("LesserQ(Factorial(10), 46000000)"), "True");
        assertEquals(execute("LesserQ(Permutation([1, 2, 3]), Permutation([1, 2, 3]))"), "Undefined");
        assertEquals(execute("LesserQ(a := 6, b := 8)"), "True");
        assertEquals(execute("LesserQ(a, b)"), "True");
    }

    @Test
    public void testNotFunc() {
        assertEquals(execute("NotQ(True)"), "False");
        assertEquals(execute("NotQ(2 > 3)"), "True");
        assertEquals(execute("NotQ(EqualsQ(24, Factorial(4)))"), "False");
        assertEquals(execute("NotQ(LesserQ(3, 4))"), "False");
    }
}
