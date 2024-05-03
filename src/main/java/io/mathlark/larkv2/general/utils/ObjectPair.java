package io.mathlark.larkv2.general.utils;

import java.util.List;

import lombok.Getter;

public class ObjectPair<A, B> {
    private @Getter A first;
    private @Getter B second;

    public ObjectPair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public List<Object> asList() {
        return List.of(this.first, this.second);
    }
}
