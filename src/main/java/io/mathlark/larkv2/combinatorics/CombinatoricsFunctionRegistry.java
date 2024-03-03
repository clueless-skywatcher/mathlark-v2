package io.mathlark.larkv2.combinatorics;

import io.mathlark.larkv2.FunctionRegistryContract;
import io.mathlark.larkv2.combinatorics.funcs.*;

public class CombinatoricsFunctionRegistry extends FunctionRegistryContract {
    public CombinatoricsFunctionRegistry() {
        register(PermutationFunc.class);
        register(PermutationComposeFunc.class);
        register(PermutationCyclesFunc.class);
    }
}
