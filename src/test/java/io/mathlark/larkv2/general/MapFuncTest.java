package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MapFuncTest {
    @Test
    public void testMapWithEmptyFunction() {
        execute("<f>");
        assertEquals(execute("Map(f, [1, 2, 3])"), execute("[f(1), f(2), f(3)]"));
    }

    @Test
    public void testMapWithBuiltinFunction() {
        assertEquals(execute("Map(Factorial, [1, 2, 3])"), execute("[1, 2, 6]"));
    }

    @Test
    public void testMapWithEmptyList() {
        assertEquals(execute("Map(Factorial, [])"), execute("[]"));
    }

    @Test
    public void testMapWithSingleElement() {
        assertEquals(execute("Map(Factorial, [5])"), execute("[120]"));
    }

    @Test
    public void testMapWithNestedLists() {
        assertEquals(execute("Map(Length, [[1, 2], [3, 4, 5], [6]])"), execute("[2, 3, 1]"));
    }

    @Test
    public void testMapWithIntQ() {
        assertEquals(execute("Map(IntQ, [1, 2, 3])"), execute("[True, True, True]"));
    }

    @Test
    public void testMapWithStringFunction() {
        assertEquals(execute("Map(StringLength, [\"hello\", \"hi\", \"mathlark\"])"), execute("[5, 2, 8]"));
    }

    @Test
    public void testMapWithFirst() {
        assertEquals(execute("Map(First, [[10, 20], [30, 40], [50, 60]])"), execute("[10, 30, 50]"));
    }

    @Test
    public void testMapWithLast() {
        assertEquals(execute("Map(Last, [[10, 20], [30, 40], [50, 60]])"), execute("[20, 40, 60]"));
    }
}               