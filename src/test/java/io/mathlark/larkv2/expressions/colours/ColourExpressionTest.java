package io.mathlark.larkv2.expressions.colours;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ColourExpressionTest {
    @Test
    public void testColours() {
        assertEquals(execute("ColourValues(Red)"), List.of(255L, 0L, 0L));
        assertEquals(execute("ColourValues(RGBColour(211, 55, 90))"), List.of(211L, 55L, 90L));
        
        assertEquals(execute("ColourValues(RGBColour(290, 0, 0))"), List.of(255L, 0L, 0L));
        assertEquals(execute("ColourValues(RGBColour(0, 3000, 0))"), List.of(0L, 255L, 0L));
        assertEquals(execute("ColourValues(RGBColour(0, 0, 56456))"), List.of(0L, 0L, 255L));

        assertEquals(execute("ColourValues(RGBColour(-5641, 11, 11))"), List.of(0L, 11L, 11L));
        assertEquals(execute("ColourValues(RGBColour(11, -987, 11))"), List.of(11L, 0L, 11L));
        assertEquals(execute("ColourValues(RGBColour(11, 11, -8789))"), List.of(11L, 11L, 0L));

        execute("a1 := RGBColour(11, 121, 83)");
        assertEquals(execute("ColourValues(a1)"), List.of(11L, 121L, 83L));
    }
}
