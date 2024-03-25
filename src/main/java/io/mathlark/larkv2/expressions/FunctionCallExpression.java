package io.mathlark.larkv2.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import io.mathlark.larkv2.UniversalFunctionRegistry;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.symbols.SymbolScope;

public class FunctionCallExpression implements IExpression {

    private String funcName;
    private List<IExpression> args;
    private Object val;
    private SymbolScope scope;
    private Map<String, DefinedFunction> funcs;

    public FunctionCallExpression(String funcName, List<IExpression> args) {
        this.funcName = funcName;
        this.args = args;
    }

    public FunctionCallExpression(String funcName, List<IExpression> args, SymbolScope scope, Map<String, DefinedFunction> funcs) {
        this(funcName, args);
        this.scope = scope;
        this.funcs = funcs;
    }

    @Override
    public IExpression evaluate() {
        if (scope != null && funcs != null) {
            return evaluate(scope, funcs);
        }

        if (!UniversalFunctionRegistry.isFunc(funcName)) {
            this.val = toString();
            return new StringExpression((String) this.val);
        }
        List<IExpression> evalParams = new ArrayList<>();
        for (IExpression arg: args) {
            evalParams.add(arg.evaluate());
        }
        IExpression invocation = UniversalFunctionRegistry.invoke(funcName, evalParams).evaluate();
        this.val = invocation.val();
        return invocation;
    }

    public IExpression evaluate(SymbolScope scope, Map<String, DefinedFunction> funcs) {
        if (scope.resolve(funcName) == null || scope.resolve(funcName) instanceof AnonFunctionExpression) {
            this.val = toString();
            return new StringExpression((String) this.val);
        }
        List<IExpression> evalParams = new ArrayList<>();
        for (IExpression arg: args) {
            evalParams.add(arg.evaluate());
        }
        IExpression invocation = UniversalFunctionRegistry.invokeWithScope(funcName, evalParams, scope, funcs).evaluate();
        this.val = invocation.val();
        return invocation;
    }

    @Override
    public String inputForm() {
        StringJoiner str = new StringJoiner(",");
        for (int i = 0; i < args.size(); i++) {
            str.add(args.get(i).toString());
        }
        return String.format("%s(%s)", funcName, str.toString());
    }

    public String toString() {
        return inputForm();
    }

    @Override
    public IExpression add(IExpression other) {
        return this.evaluate().add(other);
    }

    @Override
    public IExpression sub(IExpression other) {
        return this.evaluate().sub(other);
    }

    @Override
    public IExpression mul(IExpression other) {
        return this.evaluate().mul(other);
    }

    @Override
    public IExpression negate() {
        return this.evaluate().negate();
    }

    @Override
    public IExpression pow(IExpression other) {
        return this.evaluate().pow(other);
    }

    @Override
    public IExpression div(IExpression other) {
        return this.evaluate().div(other);
    }

    @Override
    public IExpression mod(IExpression other) {
        return this.evaluate().mod(other);
    }

    @Override
    public StringExpression head() {
        return new StringExpression(funcName);
    }

    @Override
    public Object val() {
        return this.val;
    }

    @Override
    public IExpression length() {
        return GlobalSymbols.ZERO;
    }
    
}
