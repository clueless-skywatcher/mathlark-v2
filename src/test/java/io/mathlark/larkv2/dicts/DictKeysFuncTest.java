package io.mathlark.larkv2.dicts;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;


public class DictKeysFuncTest {
    @Test
    public void testDict() {
        execute("m := {\"a\": 1, \"b\": True, \"c\": \"abc\"}");
        assertEquals(execute("DictKeys(m)"), List.of(
            "a", "b", "c"
        ));
        execute("m := {}");
        assertEquals(execute("DictKeys(m)"), List.of());
    }
}
