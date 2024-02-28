package io.mathlark.larkv2.exceptions;

public class SymbolDoesNotExistException extends RuntimeException {
    public SymbolDoesNotExistException(String symbol) {
        super(String.format("%s does not exist", symbol));
    }
}
