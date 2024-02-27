package io.mathlark.larkv2.symbols;

import java.util.HashMap;
import java.util.Map;

import io.mathlark.larkv2.expressions.AnonFunctionExpression;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;

public class SymbolTables {
    private static SymbolTables INSTANCE = new SymbolTables();

    private Map<String, IExpression> localSymbols;
    private Map<String, IExpression> globalSymbols;

    private SymbolTables() {
        localSymbols = new HashMap<>();
        globalSymbols = GlobalSymbols.SYMBOLS;
    }
    
    public static IExpression evaluate(String symbol) {
        if (INSTANCE.globalSymbols.containsKey(symbol)) {
            return INSTANCE.globalSymbols.get(symbol);
        }
        if (INSTANCE.localSymbols.containsKey(symbol)) { 
            return INSTANCE.localSymbols.get(symbol);
        }
        return GlobalSymbols.UNDEFINED;
    }

    public static IExpression evalGlobal(String symbol) {
        return INSTANCE.globalSymbols.get(symbol);
    }

    public static boolean isGlobal(String symbol) {
        return INSTANCE.globalSymbols.containsKey(symbol);
    }

    public static void addLocal(String symVal, IExpression expr) {
        INSTANCE.localSymbols.put(symVal, expr);
    }

    public static IExpression registerAnonFunc(String name) {
        INSTANCE.localSymbols.put(name, new AnonFunctionExpression(name));
        return new StringExpression(name);
    }

    public static boolean isAnonFunc(String name) {
        if (INSTANCE.localSymbols.containsKey(name)) {
            return (INSTANCE.localSymbols.get(name)) instanceof AnonFunctionExpression;
        }
        return false;
    }

    public static void clear() {
        INSTANCE.localSymbols.clear();
    }

    public static void init() {

    }
}
