package io.mathlark.larkv2.lists;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.lists.funcs.*;

public class ListFunctionRegistry extends FunctionRegistryContract {
    public ListFunctionRegistry() {
        register(ListFunc.class);
        register(FirstFunc.class);
        register(LastFunc.class);
        register(RestFunc.class);
        register(LengthFunc.class);
        register(AppendFunc.class);
        register(ExtendFunc.class);
        register(ElementAtFunc.class);
    }
}