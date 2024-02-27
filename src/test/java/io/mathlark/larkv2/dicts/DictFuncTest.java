package io.mathlark.larkv2.dicts;

import java.util.Map;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DictFuncTest {
    @Test
    public void testCall() {
        execute("m := Dict([\"a\", 1], [\"b\", True], [\"c\", \"abc\"], [1, False])");
        assertEquals(execute("m"), Map.of(
           "a", 1L, "b", true, "c", "abc", 1L, false
        ));
        execute("m := Dict()");
        assertEquals(execute("m"), Map.of());
    }

    @Test
    public void testNested() {
        execute("m := Dict([\"a\", 1], [\"b\", True], [\"c\", Dict([\"x\", 5])])");
        assertEquals(execute("m"), Map.of(
            "a", 1L, "b", true, "c", Map.of("x", 5L)
        ));
    }
}
