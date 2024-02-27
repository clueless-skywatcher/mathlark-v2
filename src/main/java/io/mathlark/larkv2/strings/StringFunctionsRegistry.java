package io.mathlark.larkv2.strings;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.strings.funcs.StringLengthFunc;

public class StringFunctionsRegistry extends FunctionRegistryContract {
    public StringFunctionsRegistry() {
        register(StringLengthFunc.class);
    }
}
