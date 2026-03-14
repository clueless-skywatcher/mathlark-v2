package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.fileread.LarkFileReader;

public class SelectFuncTest {

    @BeforeAll
    public static void loadStdlib() {
        LarkFileReader.loadResource("src/math.lk");
    }

    @Test
    public void testSelectWithBuiltinPredicate() {
        assertEquals(execute("Select([1, 2, 3, 4, 5, 6], EvenQ)"), List.of(2L, 4L, 6L));
        assertEquals(execute("Select([1, 2, 3, 4, 5], OddQ)"), List.of(1L, 3L, 5L));
    }

    @Test
    public void testSelectWithIntQ() {
        assertEquals(execute("Select([1, 2, 3], IntQ)"), List.of(1L, 2L, 3L));
    }

    @Test
    public void testSelectNoneMatch() {
        assertEquals(execute("Select([1, 3, 5, 7], EvenQ)"), List.of());
    }

    @Test
    public void testSelectAllMatch() {
        assertEquals(execute("Select([2, 4, 6], EvenQ)"), List.of(2L, 4L, 6L));
    }

    @Test
    public void testSelectEmptyList() {
        assertEquals(execute("Select([], EvenQ)"), List.of());
    }

    @Test
    public void testSelectSingleElement() {
        assertEquals(execute("Select([3], EvenQ)"), List.of());
        assertEquals(execute("Select([4], EvenQ)"), List.of(4L));
    }
}
