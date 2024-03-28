package io.mathlark.larkv2.colours;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.colours.funcs.*;

public class ColourFunctionRegistry extends FunctionRegistryContract {
    public ColourFunctionRegistry() {
        register(RGBColourFunc.class);
        register(ColourTextFunc.class);
        register(ColourValuesFunc.class);
        register(HueFunc.class);
    }
}
