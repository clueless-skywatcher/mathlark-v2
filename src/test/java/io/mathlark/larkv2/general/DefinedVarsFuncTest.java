package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class DefinedVarsFuncTest {
    @Test
    public void testDefinedVars() {
        assertEquals(execute("DefinedVars()"), List.of());
        execute("a := 2");
        assertEquals(execute("DefinedVars()"), List.of("a"));
        execute("ClearAll()");
        assertEquals(execute("DefinedVars()"), List.of());
    }
}
