package io.mathlark.larkv2.lists;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.lists.funcs.FirstFunc;
import io.mathlark.larkv2.lists.funcs.LastFunc;
import io.mathlark.larkv2.lists.funcs.LengthFunc;
import io.mathlark.larkv2.lists.funcs.ListFunc;
import io.mathlark.larkv2.lists.funcs.RestFunc;

public class ListFunctionRegistry extends FunctionRegistryContract {
    public ListFunctionRegistry() {
        register(ListFunc.class);
        register(FirstFunc.class);
        register(LastFunc.class);
        register(RestFunc.class);
        register(LengthFunc.class);
    }
}