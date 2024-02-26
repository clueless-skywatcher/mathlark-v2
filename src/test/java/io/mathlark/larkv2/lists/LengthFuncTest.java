package io.mathlark.larkv2.lists;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class LengthFuncTest {
    @Test
    public void testLength() {
        assertEquals(execute("Length([1, 2, 3])"), 3L);
        assertEquals(execute("Length(List(1, 2))"), 2L);
        assertEquals(execute("Length([])"), 0L);
        assertEquals(execute("Length([[1, 2, 3], 2, 3])"), 3L);

        assertEquals(execute("Length(1)"), 0L);
        assertEquals(execute("Length(True)"), 0L);
        assertEquals(execute("Length(2.5)"), 0L);
        assertEquals(execute("Length(\"abc\")"), 0L);
        execute("a1 := 1");
        assertEquals(execute("Length(a1)"), 0L);
    }

    @AfterEach
    public void clear() {
        execute("ClearAll()");
    }
}
