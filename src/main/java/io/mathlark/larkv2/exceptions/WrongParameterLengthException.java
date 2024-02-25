package io.mathlark.larkv2.exceptions;

public class WrongParameterLengthException extends RuntimeException {
    public WrongParameterLengthException(String message, Object... varArgs) {
        super(String.format(message, varArgs));
    }
}
