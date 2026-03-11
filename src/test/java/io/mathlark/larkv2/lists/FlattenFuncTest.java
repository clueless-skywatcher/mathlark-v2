package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FlattenFuncTest {
    @Test
    public void testFlattenOnNormalList() {
        assertEquals(execute("Flatten([1, 2, 3])"), List.of(1L, 2L, 3L));
    }

    @Test
    public void testFlattenOnNestedListLevel1() {
        assertEquals(execute("Flatten([1, [1, 2], 3])"), List.of(1L, 1L, 2L, 3L));
        assertEquals(execute("Flatten([1, [], 3])"), List.of(1L, 3L));
        assertEquals(execute("Flatten([1, [2], 3])"), List.of(1L, 2L, 3L));
        assertEquals(execute("Flatten([[1, 2], [3, 4]])"), List.of(1L, 2L, 3L, 4L));
        assertEquals(execute("Flatten([[], [], []])"), List.of());
    }

    @Test
    public void testFlattenOnDeeplyNestedList() {
        assertEquals(execute("Flatten([1, [2, [3, [4]]]])"), List.of(1L, 2L, 3L, 4L));
        assertEquals(execute("Flatten([[[1]], [[2]], [[3]]])"), List.of(1L, 2L, 3L));
        assertEquals(execute("Flatten([[[[5]]]])"), List.of(5L));
    }

    @Test
    public void testFlattenOnEmptyList() {
        assertEquals(execute("Flatten([])"), List.of());
        assertEquals(execute("Flatten([[]])"), List.of());
        assertEquals(execute("Flatten([[], [[]]])"), List.of());
    }

    @Test
    public void testFlattenWithMixedTypes() {
        assertEquals(execute("Flatten([[1, \"a\"], [True, 2]])"), List.of(1L, "a", true, 2L));
        assertEquals(execute("Flatten([[1, 2], \"hello\", [3]])"), List.of(1L, 2L, "hello", 3L));
    }

    @Test
    public void testFlattenOnSingleElementLists() {
        assertEquals(execute("Flatten([1])"), List.of(1L));
        assertEquals(execute("Flatten([[1]])"), List.of(1L));
        assertEquals(execute("Flatten([[[1]]])"), List.of(1L));
    }
}
