package io.mathlark.larkv2.dicts;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.dicts.funcs.DictFunc;
import io.mathlark.larkv2.dicts.funcs.DictKeysFunc;
import io.mathlark.larkv2.dicts.funcs.DictValFunc;
import io.mathlark.larkv2.dicts.funcs.DictValsFunc;

public class DictFunctionRegistry extends FunctionRegistryContract {
    public DictFunctionRegistry() {
        register(DictFunc.class);
        register(DictKeysFunc.class);
        register(DictValFunc.class);
        register(DictValsFunc.class);
    }
}
