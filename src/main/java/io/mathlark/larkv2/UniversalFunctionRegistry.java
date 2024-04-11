package io.mathlark.larkv2;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            if (funcs.containsKey(String.format("%s%d", funcName, exprs.size()))) {
                DefinedFunction function = funcs.get(String.format("%s%d", funcName, exprs.size()));
                return function.invoke(exprs, funcs);
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

    public void register(FunctionRegistryContract funcRegistry) {
        functions.putAll(funcRegistry.functions);
    }
}
