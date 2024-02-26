package io.mathlark.larkv2.expressions;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class DictExpressionTest {
    @Test
    public void testDict() {
        assertEquals(execute("{}"), Map.of());
        assertEquals(execute("{1: 1}"), Map.of(1L, 1L));
        assertEquals(execute("{1: 2, 2: 3, 3.5: 8.6}"), Map.of(1L, 2L, 2L, 3L, 3.5, 8.6));
        assertEquals(execute("{True: 2, 1: \"b\", \"a\": 222}"), Map.of(true, 2L, 1L, "b", "a", 222L));
        assertEquals(execute("{GCD(498, 168): 25, \"a\": {25: GCD(498, 168)}}"), Map.of(
            6L, 25L, "a", Map.of(25L, 6L)
        ));
    }

    @Test
    public void testAdd() {
        assertEquals(execute("{\"a\": 1} + {}"), execute("{\"a\": 1}"));
        assertEquals(execute("{} + {\"a\": 1}"), execute("{\"a\": 1}"));
        assertEquals(execute("{True: 16} + {\"a\": 1}"), execute("{True: 16, \"a\": 1}"));
        assertEquals(execute("{\"a\": 0} + {\"a\": 1}"), execute("{\"a\": 1}"));
        assertEquals(execute("{\"a\": 0} + {\"b\": {1: 2, 3: 4}}"), execute("{\"a\": 0, \"b\": {1: 2, 3: 4}}"));
        assertEquals(execute("{1: 2} + 1"), "Undefined");
    }

    @AfterEach
    public void clear() {
        execute("ClearAll()");
    }
}
