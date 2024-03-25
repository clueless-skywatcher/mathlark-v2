package io.mathlark.larkv2.exceptions;

import io.mathlark.larkv2.expressions.IExpression;
import lombok.Getter;

public class ReturningException extends RuntimeException {
    private @Getter IExpression expr;
    
    public ReturningException(IExpression expression) {
        this.expr = expression;
    }
}
