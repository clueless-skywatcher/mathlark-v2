package io.mathlark.larkv2.general;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.general.funcs.AsListFunc;
import io.mathlark.larkv2.general.funcs.ClearAllFunc;
import io.mathlark.larkv2.general.funcs.ClearFunc;
import io.mathlark.larkv2.general.funcs.ColumnFunc;
import io.mathlark.larkv2.general.funcs.DefinedVarsFunc;
import io.mathlark.larkv2.general.funcs.ExitFunc;
import io.mathlark.larkv2.general.funcs.HeadFunc;
import io.mathlark.larkv2.general.funcs.NestFunc;
import io.mathlark.larkv2.general.funcs.PrintLnFunc;

public class GeneralFunctionRegistry extends FunctionRegistryContract {
    public GeneralFunctionRegistry() {
        register(HeadFunc.class);
        register(ExitFunc.class);
        register(ClearAllFunc.class);
        register(NestFunc.class);
        register(DefinedVarsFunc.class);
        register(ClearFunc.class);
        register(AsListFunc.class);
        register(ColumnFunc.class);
        register(PrintLnFunc.class);
    }
}
