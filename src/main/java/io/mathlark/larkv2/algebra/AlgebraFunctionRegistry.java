package io.mathlark.larkv2.algebra;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.algebra.funcs.*;

public class AlgebraFunctionRegistry extends FunctionRegistryContract {
    public AlgebraFunctionRegistry() {
        register(VarFunc.class);
        register(PolyQuotRemFunc.class);
        register(PolyDegreeFunc.class);
    }
}
