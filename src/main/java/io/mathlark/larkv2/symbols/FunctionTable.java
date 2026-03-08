package io.mathlark.larkv2.symbols;

import java.util.HashMap;
import java.util.Map;

public class FunctionTable {
    private static final Map<String, DefinedFunction> functions = new HashMap<>();

    public static void registerAll(Map<String, DefinedFunction> funcs) {
        functions.putAll(funcs);
    }

    public static DefinedFunction get(String name, int arity) {
        return functions.get(String.format("%s%d", name, arity));
    }

    public static boolean has(String name, int arity) {
        return functions.containsKey(String.format("%s%d", name, arity));
    }

    public static Map<String, DefinedFunction> getAll() {
        return functions;
    }
}
