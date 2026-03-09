package io.mathlark.larkv2.symbols;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.expressions.IExpression;

/**
 * Global registry for user-defined functions loaded from .lk files.
 *
 * Unlike the local funcs map (which stores one DefinedFunction per key),
 * FunctionTable stores a LIST of overloads per key. This enables
 * type-based dispatch: Square(x: Numeric) and Square(x: Polynomial)
 * both live under key "Square1".
 *
 * On invocation, overloads are tried in registration order. The first
 * one whose type annotations match the arguments wins. If none match,
 * Undefined is returned.
 */
public class FunctionTable {
    private static final Map<String, List<DefinedFunction>> functions = new HashMap<>();

    /**
     * Register all functions from a .lk file. Each function is APPENDED
     * to the overload list for its key, rather than replacing the existing
     * entry. This is how multiple overloads accumulate.
     */
    public static void registerAll(Map<String, DefinedFunction> funcs) {
        for (Map.Entry<String, DefinedFunction> entry : funcs.entrySet()) {
            functions.computeIfAbsent(entry.getKey(), k -> new ArrayList<>())
                     .add(entry.getValue());
        }
    }

    /**
     * Get the list of overloads for a function name + arity.
     * Returns null if no overloads exist.
     */
    public static List<DefinedFunction> getOverloads(String name, int arity) {
        return functions.get(String.format("%s%d", name, arity));
    }

    /**
     * Try each overload in order until one matches the given args.
     * Returns Undefined if no overload matches.
     */
    public static IExpression dispatch(String name, List<IExpression> args) {
        List<DefinedFunction> overloads = getOverloads(name, args.size());
        if (overloads == null) return GlobalSymbols.UNDEFINED;

        // Flatten all overloads into a single funcs map for the invocation,
        // so the function body can call other user-defined functions.
        Map<String, DefinedFunction> allFuncs = getAll();

        for (DefinedFunction overload : overloads) {
            IExpression result = overload.invoke(args, allFuncs);
            // If the overload returned Undefined due to a type mismatch,
            // try the next overload. If it returned Undefined because the
            // function body genuinely returned Undefined, that's also fine —
            // the next overload gets a chance.
            if (result != GlobalSymbols.UNDEFINED) {
                return result;
            }
        }
        return GlobalSymbols.UNDEFINED;
    }

    public static boolean has(String name, int arity) {
        return functions.containsKey(String.format("%s%d", name, arity));
    }

    /**
     * Check if any function with this name exists (any arity).
     * Used by the REPL grammar to recognize MathLark-defined function
     * names before arity is known.
     */
    public static boolean hasName(String name) {
        for (String key : functions.keySet()) {
            if (key.matches(name + "\\d+")) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a flat Map<String, DefinedFunction> for backwards compatibility.
     * For keys with multiple overloads, the FIRST overload is returned.
     * This is used when passing funcs to DefinedFunction.invoke() and
     * UniversalFunctionRegistry.invokeWithScope().
     */
    public static Map<String, DefinedFunction> getAll() {
        Map<String, DefinedFunction> flat = new HashMap<>();
        for (Map.Entry<String, List<DefinedFunction>> entry : functions.entrySet()) {
            flat.put(entry.getKey(), entry.getValue().get(0));
        }
        return flat;
    }
}
