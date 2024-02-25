package io.mathlark.larkv2;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.general.GeneralFunctionRegistry;
import io.mathlark.larkv2.numbers.NumberFunctionRegistry;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class UniversalFunctionRegistry {
    private static UniversalFunctionRegistry INSTANCE = new UniversalFunctionRegistry();
    private Map<String, Class<? extends LarkFunction>> functions = new HashMap<>();

    private UniversalFunctionRegistry() {
        register(new NumberFunctionRegistry());
        register(new GeneralFunctionRegistry());
    }

    public static IExpression invoke(String funcName, List<IExpression> exprs) {
        try {
            LarkFunction func = INSTANCE.functions.get(funcName).getDeclaredConstructor().newInstance();
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
