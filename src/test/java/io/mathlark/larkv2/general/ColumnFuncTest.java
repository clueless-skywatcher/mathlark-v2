package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ColumnFuncTest {
    @Test
    public void testColumn() {
        assertEquals(execute("Column([1, 2, 3])"), "1\n2\n3");
        assertEquals(execute("Column([[1, 2, 3], 4, [5, 6]])"), "[1, 2, 3]\n4\n[5, 6]");
    }
}
