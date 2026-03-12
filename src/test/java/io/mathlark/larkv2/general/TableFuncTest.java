package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TableFuncTest {
    @Test
    public void testTableSingleRange() {
        // Table((i) -> {i^2}, [6]) = [0, 1, 4, 9, 16, 25] (i from 0 to 5)
        assertEquals(execute("Table((i) -> {i^2}, [6])"), List.of(0L, 1L, 4L, 9L, 16L, 25L));
    }

    @Test
    public void testTableStartEnd() {
        // Table((i) -> {i * 2}, [1, 5]) = [2, 4, 6, 8, 10]
        assertEquals(execute("Table((i) -> {i * 2}, [1, 5])"), List.of(2L, 4L, 6L, 8L, 10L));
    }

    @Test
    public void testTableStartEndStep() {
        // Table((i) -> {i}, [0, 10, 3]) = [0, 3, 6, 9]
        assertEquals(execute("Table((i) -> {i}, [0, 10, 3])"), List.of(0L, 3L, 6L, 9L));
    }

    @Test
    public void testTableWithNamedFunction() {
        assertEquals(execute("Table(Factorial, [1, 5])"), List.of(1L, 2L, 6L, 24L, 120L));
    }

    @Test
    public void testTableMultiRange() {
        // Table((i, j) -> {i + j}, [3], [3]) produces nested lists
        // i=0: [0+0, 0+1, 0+2] = [0, 1, 2]
        // i=1: [1+0, 1+1, 1+2] = [1, 2, 3]
        // i=2: [2+0, 2+1, 2+2] = [2, 3, 4]
        assertEquals(execute("Table((i, j) -> {i + j}, [3], [3])"), execute("[[0, 1, 2], [1, 2, 3], [2, 3, 4]]"));
    }

    @Test
    public void testTableSingleElement() {
        assertEquals(execute("Table((i) -> {i + 1}, [0, 0])"), List.of(1L));
    }

    @Test
    public void testTablePowWithStartEnd() {
        assertEquals(execute("Table((i) -> {i^2}, [0, 5])"), List.of(0L, 1L, 4L, 9L, 16L, 25L));
    }
}
