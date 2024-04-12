package io.mathlark.larkv2.general;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.general.funcs.*;
import io.mathlark.larkv2.general.funcs.comparison.*;

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
        register(EqualsQFunc.class);
        register(GreaterQFunc.class);
        register(GreaterEqualQFunc.class);
        register(LesserEqualQFunc.class);
        register(LesserQFunc.class);
        register(NotQFunc.class);
        register(MapFunc.class);
    }
}
