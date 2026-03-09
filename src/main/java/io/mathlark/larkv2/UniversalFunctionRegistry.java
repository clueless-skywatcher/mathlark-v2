package io.mathlark.larkv2;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.algebra.AlgebraFunctionRegistry;
import io.mathlark.larkv2.colours.ColourFunctionRegistry;
import io.mathlark.larkv2.combinatorics.CombinatoricsFunctionRegistry;
import io.mathlark.larkv2.dicts.DictFunctionRegistry;
import io.mathlark.larkv2.expressions.FunctionCallExpression;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.general.GeneralFunctionRegistry;
import io.mathlark.larkv2.lists.ListFunctionRegistry;
import io.mathlark.larkv2.numbers.NumberFunctionRegistry;
import io.mathlark.larkv2.strings.StringFunctionsRegistry;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.FunctionTable;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.symbols.SymbolScope;
import io.mathlark.larkv2.symbols.SymbolTables;

public class UniversalFunctionRegistry {
    private static UniversalFunctionRegistry INSTANCE = new UniversalFunctionRegistry();
    private Map<String, Class<? extends LarkFunction>> functions = new HashMap<>();

    private UniversalFunctionRegistry() {
        register(new NumberFunctionRegistry());
        register(new GeneralFunctionRegistry());
        register(new ListFunctionRegistry());
        register(new ColourFunctionRegistry());
        register(new DictFunctionRegistry());
        register(new StringFunctionsRegistry());
        register(new CombinatoricsFunctionRegistry());
        register(new AlgebraFunctionRegistry());
    }

    public static IExpression invoke(String funcName, List<IExpression> exprs) {
        try {
            if (SymbolTables.isAnonFunc(funcName)) {
                return new FunctionCallExpression(funcName, exprs);
            }
            LarkFunction func = INSTANCE.functions.get(funcName).getDeclaredConstructor(
                SymbolScope.class, Map.class).newInstance(null, null);
            return func.evaluate(exprs.toArray(new IExpression[0]));
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            return GlobalSymbols.UNDEFINED;
        }
    }

    public static IExpression invokeWithScope(String funcName, List<IExpression> exprs, SymbolScope scope, Map<String, DefinedFunction> funcs) {
        try {
            if (SymbolTables.isAnonFunc(funcName)) {
                return new FunctionCallExpression(funcName, exprs, scope, funcs);
            }
            String key = String.format("%s%d", funcName, exprs.size());
            if (funcs.containsKey(key)) {
                // Single overload in local funcs map (defined in the same file).
                // Try it first; if type mismatch returns Undefined, fall through
                // to FunctionTable which may have other overloads.
                DefinedFunction function = funcs.get(key);
                IExpression result = function.invoke(exprs, funcs);
                if (result != GlobalSymbols.UNDEFINED) {
                    return result;
                }
            }
            // Try FunctionTable overloads (from stdlib or other loaded files).
            if (FunctionTable.has(funcName, exprs.size())) {
                IExpression result = FunctionTable.dispatch(funcName, exprs);
                if (result != GlobalSymbols.UNDEFINED) {
                    return result;
                }
            }
            LarkFunction func = INSTANCE.functions.get(funcName).
                getDeclaredConstructor(SymbolScope.class, Map.class).newInstance(scope, funcs);
            return func.evaluate(exprs.toArray(new IExpression[0]));
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            return GlobalSymbols.UNDEFINED;
        }
    }

    public static boolean isFunc(String name) {
        return INSTANCE.functions.containsKey(name);
    }

    public static boolean isLazy(String name) {
        try {
            Class<? extends LarkFunction> func = INSTANCE.functions.get(name);
            if (func == null) return false;
            LarkFunction funcInstance = func
                .getDeclaredConstructor(SymbolScope.class, Map.class)
                .newInstance(null, null);
            return funcInstance.isLazy();
        } catch (Exception e) {
            return false;
        }
    }

    public void register(FunctionRegistryContract funcRegistry) {
        functions.putAll(funcRegistry.functions);
    }
}
