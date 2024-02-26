package io.mathlark.larkv2.colours;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.colours.funcs.ColourFunc;
import io.mathlark.larkv2.colours.funcs.ColourTextFunc;
import io.mathlark.larkv2.colours.funcs.ColourValues;

public class ColourFunctionRegistry extends FunctionRegistryContract {
    public ColourFunctionRegistry() {
        register(ColourFunc.class);
        register(ColourTextFunc.class);
        register(ColourValues.class);
    }
}
