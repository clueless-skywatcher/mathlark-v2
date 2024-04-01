package io.mathlark.larkv2.lists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;

public class RangeFuncTest {
    @Test
    public void testRange() {
        assertEquals(execute("Range(5)"), execute("[1, 2, 3, 4, 5]"));
        assertEquals(execute("Range(5.0)"), execute("[1.0, 2.0, 3.0, 4.0, 5.0]"));
        assertEquals(execute("Range(2, 10)"), execute("[2, 3, 4, 5, 6, 7, 8, 9, 10]"));
        assertEquals(execute("Range(2, 10.0)"), execute("[2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0]"));
        assertEquals(execute("Range(1, 11, 2)"), execute("[1, 3, 5, 7, 9, 11]"));
        assertEquals(execute("Range(1, 10, 2)"), execute("[1, 3, 5, 7, 9]"));
        assertEquals(execute("Range(10, 1, -1)"), execute("[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]"));
        assertEquals(execute("Range(10, 5, -1)"), execute("[10, 9, 8, 7, 6, 5]"));
        assertEquals(execute("Range(10, 5, -2)"), execute("[10, 8, 6]"));
    }
}
