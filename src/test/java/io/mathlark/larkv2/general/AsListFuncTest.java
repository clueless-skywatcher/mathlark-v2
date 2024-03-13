package io.mathlark.larkv2.general;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class AsListFuncTest {
    @Test
    public void testAsList() {
        assertEquals(execute("AsList([1, 2, 3])"), List.of(1L, 2L, 3L));
        assertEquals(execute("AsList([])"), List.of());
        assertEquals(execute("AsList(DictKeys({1: 1, 2: 5, 3: 9}))"), List.of(1L, 2L, 3L));
        assertEquals(execute("AsList([Permutation([1, 2]), Permutation([1, 2, 3])])"), List.of(List.of(1L, 2L), List.of(1L, 2L, 3L)));
    }
}
