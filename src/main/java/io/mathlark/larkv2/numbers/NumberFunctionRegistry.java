package io.mathlark.larkv2.numbers;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.numbers.functions.FactorialFunc;
import io.mathlark.larkv2.numbers.functions.GCDFunc;
import io.mathlark.larkv2.numbers.functions.IncrementFunc;
import io.mathlark.larkv2.numbers.functions.IntQFunc;

public class NumberFunctionRegistry extends FunctionRegistryContract {
    public NumberFunctionRegistry() {
        register(GCDFunc.class);
        register(IntQFunc.class);
        register(IncrementFunc.class);
        register(FactorialFunc.class);
    }
}
