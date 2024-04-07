package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MapFuncTest {
    @Test
    public void testMap() {
        execute("<f>");
        assertEquals(execute("Map(f, [1, 2, 3])"), execute("[f(1), f(2), f(3)]"));
        assertEquals(execute("Map(Factorial, [1, 2, 3])"), execute("[1, 2, 6]"));
    }   
}               