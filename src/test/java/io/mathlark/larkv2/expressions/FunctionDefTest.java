package io.mathlark.larkv2.expressions;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class FunctionDefTest {
    @Test
    public void testFuncDef() {
        assertEquals(execute("f1"), "Undefined");
        assertEquals(execute("<f1>"), "f1");
        assertEquals(execute("f1(1)"), "f1(1)");

        assertEquals(execute("<f2>"), "f2");
        assertEquals(execute("f2(f1(1))"), "f2(f1(1))");
    }

    @AfterEach
    public void clear() {
        execute("Clear()");
    }
}
