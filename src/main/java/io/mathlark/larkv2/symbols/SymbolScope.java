package io.mathlark.larkv2.symbols;

import java.util.HashMap;
import java.util.Map;

import io.mathlark.larkv2.expressions.IExpression;
import lombok.Getter;

public class SymbolScope {
    private @Getter SymbolScope parent;
    private Map<String, IExpression> vars;
    private @Getter boolean isFunc;

    public SymbolScope(SymbolScope parent, boolean isFunc) {
        this.parent = parent;
        this.isFunc = isFunc;
        this.vars = new HashMap<>();
    }

    public SymbolScope() {
        this(null, false);
        this.vars = GlobalSymbols.SYMBOLS;
    }

    public boolean isGlobal() {
        return parent == null;
    }

    public IExpression resolve(String name) {
        return resolve(name, true);
    }

    public IExpression resolve(String name, boolean checkParent) {
        IExpression expr = vars.get(name);
        if (expr != null) {
            return expr;
        }
        else if (checkParent && !isGlobal()) {
            return parent.resolve(name, !parent.isFunc);
        }
        return GlobalSymbols.UNDEFINED;
    }

    public void assign(String var, IExpression value) {
        if(resolve(var, !isFunc) != null && resolve(var, !isFunc) != GlobalSymbols.UNDEFINED) {
            this.reAssign(var, value);
        }
        else {
            vars.put(var, value);
        }
    }

    private void reAssign(String identifier, IExpression value) {
        if(vars.containsKey(identifier)) {
            vars.put(identifier, value);
        }
        else if(parent != null) {
            parent.reAssign(identifier, value);
        }
    }

}
