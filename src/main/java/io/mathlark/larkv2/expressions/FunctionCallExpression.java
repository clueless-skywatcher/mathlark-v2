package io.mathlark.larkv2.expressions;

import java.util.ArrayList;
import java.util.List;

import io.mathlark.larkv2.UniversalFunctionRegistry;

public class FunctionCallExpression implements IExpression {

    private String funcName;
    private List<IExpression> args;
    private Object val;

    public FunctionCallExpression(String funcName, List<IExpression> args) {
        this.funcName = funcName;
        this.args = args;
    }

    @Override
    public IExpression evaluate() {
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

    @Override
    public String inputForm() {
        return String.format("%s(%s)", funcName, args.toString());
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
    
}
