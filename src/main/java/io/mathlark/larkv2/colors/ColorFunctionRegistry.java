package io.mathlark.larkv2.colors;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.colors.funcs.ColorTextFunc;
import io.mathlark.larkv2.colors.funcs.ColorFunc;

public class ColorFunctionRegistry extends FunctionRegistryContract {
    public ColorFunctionRegistry() {
        register(ColorFunc.class);
        register(ColorTextFunc.class);
    }
}
