package io.mathlark.larkv2.lists;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.lists.funcs.ListFunc;

public class ListFunctionRegistry extends FunctionRegistryContract {
    public ListFunctionRegistry() {
        register(ListFunc.class);
    }
}