package io.mathlark.larkv2.expressions;



public interface IExpression {
    public IExpression evaluate();

    public String toString();

    public String inputForm();

    public IExpression add(IExpression other);

    public IExpression sub(IExpression other);

    public IExpression mul(IExpression other);

    public IExpression negate();

    public IExpression pow(IExpression other);

    public IExpression div(IExpression other);

    public IExpression mod(IExpression other);

    public StringExpression head();

    public Object val();

    public IExpression length();
}
