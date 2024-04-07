package io.mathlark.larkv2.exceptions;

import java.util.List;
import java.util.StringJoiner;

public class WrongParameterTypeException extends RuntimeException {
    public WrongParameterTypeException(String message, Object... varArgs) {
        super(String.format(message, varArgs));
    }

    public WrongParameterTypeException(Class<?> expected, int pos, Class<?> actual) {
        this("Expected %s at position %d, got %s", expected.getSimpleName(), pos, actual.getSimpleName());
    }

    public WrongParameterTypeException(List<Class<?>> expected, int pos, Class<?> actual) {
        this("Expected %s at position %d, got %s", getJoiner(expected).toString(), pos, actual.getSimpleName());
    }

    private static StringJoiner getJoiner(List<Class<?>> expected) {
        StringJoiner classes = new StringJoiner(" or ");
        for (Class<?> klass: expected) {
            classes.add(klass.getSimpleName());
        }
        return classes;
    }
}
