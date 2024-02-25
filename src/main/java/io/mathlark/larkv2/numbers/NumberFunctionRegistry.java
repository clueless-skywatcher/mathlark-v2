package io.mathlark.larkv2.numbers;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.numbers.functions.GCDFunc;

public class NumberFunctionRegistry extends FunctionRegistryContract {
    public NumberFunctionRegistry() {
        register(GCDFunc.class);
    }
}
