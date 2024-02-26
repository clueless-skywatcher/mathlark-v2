package io.mathlark.larkv2.general;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.general.funcs.ClearAllFunc;
import io.mathlark.larkv2.general.funcs.ExitFunc;
import io.mathlark.larkv2.general.funcs.HeadFunc;

public class GeneralFunctionRegistry extends FunctionRegistryContract {
    public GeneralFunctionRegistry() {
        register(HeadFunc.class);
        register(ExitFunc.class);
        register(ClearAllFunc.class);
    }
}
