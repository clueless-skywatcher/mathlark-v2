package io.mathlark.larkv2.expressions.colours;

import static io.mathlark.larkv2.utils.LarkExecUtils.execute;

import org.junit.jupiter.api.Test;

/**
 * Can't think of any tests here. The only test would be to print a rainbow I guess
 */
public class HueFuncTest {
    @Test
    public void testHue() {
        int n = 1000;
        for (int i = 0; i <= n; i++) {
            System.out.print(execute(String.format("Hue(%f)", i * 1.0 / n)));
        }
        System.out.println();
    }
}
