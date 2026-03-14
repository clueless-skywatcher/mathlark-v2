package io.mathlark.larkv2.expressions;

import java.util.List;

import io.mathlark.larkv2.LarkVM;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.symbols.SymbolTables;

public class LambdaExpression implements IExpression {
    private List<String> paramNames;
    private String bodyText;

    public LambdaExpression(List<String> paramNames, String bodyText) {
        this.paramNames = paramNames;
        this.bodyText = bodyText;
    }

    public List<String> getParamNames() {
        return paramNames;
    }

    public String getBodyText() {
        return bodyText;
    }

    public IExpression invoke(List<IExpression> args) {
        // Save existing values for the parameter names
        IExpression[] saved = new IExpression[paramNames.size()];
        for (int i = 0; i < paramNames.size(); i++) {
            saved[i] = SymbolTables.evaluate(paramNames.get(i));
        }

        // Bind parameters
        for (int i = 0; i < paramNames.size(); i++) {
            SymbolTables.addLocal(paramNames.get(i), args.get(i));
        }

        // Evaluate body
        IExpression result;
        try {
            result = LarkVM.parse(bodyText);
        } finally {
            // Restore previous values
            for (int i = 0; i < paramNames.size(); i++) {
                if (saved[i] == GlobalSymbols.UNDEFINED) {
                    try {
                        SymbolTables.clear(paramNames.get(i));
                    } catch (Exception e) {
                        // Variable didn't exist before, ignore
                    }
                } else {
                    SymbolTables.addLocal(paramNames.get(i), saved[i]);
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
