package io.mathlark.larkv2.dicts;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;


public class DictValFuncTest {
    @Test
    public void testDictVal() {
        execute("m := {\"a\": 1, \"b\": True, \"c\": \"abc\", \"d\": {\"x\": 1, \"y\": 2}}");
        assertEquals(execute("DictVal(m, \"a\")"), 1L);
        assertEquals(execute("DictVal(m, \"b\")"), "True");
        assertEquals(execute("DictVal(m, \"c\")"), "abc");
        assertEquals(execute("DictVal(m, \"d\")"), Map.of(
            "x", 1L, "y", 2L
        ));

        execute("m := {1: StringLength(\"abc\"), 0: {2: \"def\", \"ghi\": 1111}, \"a\": 25}");
        assertEquals(execute("DictVal(m, 1)"), 3L);
        assertEquals(execute("DictVal(m, 0)"), Map.of(
            2L, "def", "ghi", 1111L
        ));
        assertEquals(execute("DictVal(m, \"a\")"), 25L);
        assertEquals(execute("DictVal(DictVal(m, 0), 2)"), "def");
        assertEquals(execute("DictVal(DictVal(m, 0), \"ghi\")"), 1111L);
    }
}
