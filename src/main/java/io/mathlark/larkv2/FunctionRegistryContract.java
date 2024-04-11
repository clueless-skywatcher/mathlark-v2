package io.mathlark.larkv2;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import io.mathlark.larkv2.symbols.SymbolScope;

public class FunctionRegistryContract {
    protected static FunctionRegistryContract INSTANCE = new FunctionRegistryContract();
    public Map<String, Class<? extends LarkFunction>> functions = new HashMap<>();
    
    public void register(Class<? extends LarkFunction> class1) {
        try {
            functions.put(class1.getDeclaredConstructor(SymbolScope.class, Map.class).newInstance(null, null).getName(), class1);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            System.out.println("Failed to register function: " + class1.getSimpleName());
        
        }
        
    }
}
