package io.mathlark.larkv2.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.mathlark.larkv2.LarkVM;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.symbols.SymbolTables;

public class LambdaExpression implements IExpression {
    private List<String> paramNames;
    private String bodyText;
    private Map<String, IExpression> capturedScope;

    public LambdaExpression(List<String> paramNames, String bodyText) {
        this.paramNames = paramNames;
        this.bodyText = bodyText;
        this.capturedScope = Map.of();
    }

    public LambdaExpression(List<String> paramNames, String bodyText, Map<String, IExpression> capturedScope) {
        this.paramNames = paramNames;
        this.bodyText = bodyText;
        this.capturedScope = capturedScope;
    }

    public List<String> getParamNames() {
        return paramNames;
    }

    public String getBodyText() {
        return bodyText;
    }

    public IExpression invoke(List<IExpression> args) {
        // Collect all names we need to save/restore: captured scope + params
        List<String> allNames = new ArrayList<>(capturedScope.keySet());
        for (String p : paramNames) {
            if (!allNames.contains(p)) {
                allNames.add(p);
            }
        }

        // Save existing values
        Map<String, IExpression> saved = new java.util.HashMap<>();
        for (String name : allNames) {
            saved.put(name, SymbolTables.evaluate(name));
        }

        // Bind captured scope variables
        for (Map.Entry<String, IExpression> entry : capturedScope.entrySet()) {
            SymbolTables.addLocal(entry.getKey(), entry.getValue());
        }

        // Bind parameters (overrides captured if same name)
        for (int i = 0; i < paramNames.size(); i++) {
            SymbolTables.addLocal(paramNames.get(i), args.get(i));
        }

        // Evaluate body
        IExpression result;
        try {
            result = LarkVM.parse(bodyText);
        } finally {
            // Restore previous values
            for (String name : allNames) {
                IExpression prev = saved.get(name);
                if (prev == GlobalSymbols.UNDEFINED) {
                    try {
                        SymbolTables.clear(name);
                    } catch (Exception e) {
                        // Variable didn't exist before, ignore
                    }
                } else {
                    SymbolTables.addLocal(name, prev);
                }
            }
        }

        return result;
    }

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public IExpression add(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression sub(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression mul(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression div(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression mod(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression pow(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression negate() {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public StringExpression head() {
        return new StringExpression("Lambda");
    }

    @Override
    public Object val() {
        return toString();
    }

    @Override
    public String inputForm() {
        return String.format("(%s) -> {%s}", String.join(", ", paramNames), bodyText);
    }

    @Override
    public String toString() {
        return inputForm();
    }

    @Override
    public IExpression length() {
        return GlobalSymbols.ZERO;
    }
}
