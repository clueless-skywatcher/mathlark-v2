package io.mathlark.larkv2.colours;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.colours.funcs.RGBColourFunc;
import io.mathlark.larkv2.colours.funcs.ColourTextFunc;
import io.mathlark.larkv2.colours.funcs.ColourValuesFunc;

public class ColourFunctionRegistry extends FunctionRegistryContract {
    public ColourFunctionRegistry() {
        register(RGBColourFunc.class);
        register(ColourTextFunc.class);
        register(ColourValuesFunc.class);
    }
}
