package io.mathlark.larkv2.stdlib.math;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.mathlark.larkv2.fileread.LarkFileReader;

public class TallyFuncTest {

    @BeforeAll
    public static void loadStdlib() {
        LarkFileReader.loadResource("src/math.lk");
    }

    @Test
    public void testTallyAllUnique() {
        assertEquals(execute("Tally([1, 2, 3])"), execute("[[1, 1], [2, 1], [3, 1]]"));
    }

    @Test
    public void testTallyAllSame() {
        assertEquals(execute("Tally([5, 5, 5])"), execute("[[5, 3]]"));
    }

    @Test
    public void testTallyMixed() {
        assertEquals(execute("Tally([1, 2, 1, 3, 2, 1])"), execute("[[1, 3], [2, 2], [3, 1]]"));
    }

    @Test
    public void testTallySingleElement() {
        assertEquals(execute("Tally([7])"), execute("[[7, 1]]"));
    }

    @Test
    public void testTallyEmptyList() {
        assertEquals(execute("Tally([])"), List.of());
    }

    @Test
    public void testTallyWithStrings() {
        assertEquals(execute("Tally([\"a\", \"b\", \"a\", \"a\"])"), execute("[[\"a\", 3], [\"b\", 1]]"));
    }

    @Test
    public void testTallyWithBooleans() {
        assertEquals(execute("Tally([True, False, True, True])"), execute("[[True, 3], [False, 1]]"));
    }

    @Test
    public void testTallyPreservesFirstOccurrenceOrder() {
        assertEquals(execute("Tally([3, 1, 2, 1, 3])"), execute("[[3, 2], [1, 2], [2, 1]]"));
    }
}
