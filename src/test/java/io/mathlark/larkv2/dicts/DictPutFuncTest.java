package io.mathlark.larkv2.dicts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;

public class DictPutFuncTest {
    @Test
    public void testDictPut() {
        execute("m := {\"a\": 1, \"b\": True, \"c\": \"abc\", \"d\": {\"x\": 1, \"y\": 2}}");
        execute("DictPut(m, \"a\", 2)");
        execute("DictPut(m, \"b\", False)");
        execute("DictPut(m, \"c\", \"def\")");
        execute("DictPut(m, \"d\", {\"x\": 3, \"y\": 4})");
        assertEquals(execute("DictVal(m, \"a\")"), 2L);
        assertEquals(execute("DictVal(m, \"b\")"), "False");
        assertEquals(execute("DictVal(m, \"c\")"), "def");
        assertEquals(execute("DictVal(m, \"d\")"), Map.of(
            "x", 3L, "y", 4L
        ));
    }
}
