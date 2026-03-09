package io.mathlark.larkv2.dicts;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class DictHasFuncTest {
    @Test
    public void testDictHas() {
        execute("m := {\"a\": 1, \"b\": True, \"c\": \"abc\", \"d\": {\"x\": 1, \"y\": 2}}");
        assertEquals(execute("DictHas(m, \"a\")"), "True");
        assertEquals(execute("DictHas(m, \"b\")"), "True");
        assertEquals(execute("DictHas(m, \"c\")"), "True");
        assertEquals(execute("DictHas(m, \"d\")"), "True");
        assertEquals(execute("DictHas(m, \"e\")"), "False");
    }
}
