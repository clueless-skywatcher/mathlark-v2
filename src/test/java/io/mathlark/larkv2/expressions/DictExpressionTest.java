package io.mathlark.larkv2.expressions;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class DictExpressionTest {
    @Test
    public void testList() {
        assertEquals(execute("{}"), Map.of());
        assertEquals(execute("{1: 1}"), Map.of(1L, 1L));
        assertEquals(execute("{1: 2, 2: 3, 3.5: 8.6}"), Map.of(1L, 2L, 2L, 3L, 3.5, 8.6));
        assertEquals(execute("{True: 2, 1: \"b\", \"a\": 222}"), Map.of(true, 2L, 1L, "b", "a", 222L));
    }

    @Test
    public void testAdd() {
        
    }

    @AfterEach
    public void clear() {
        execute("ClearAll()");
    }
}
