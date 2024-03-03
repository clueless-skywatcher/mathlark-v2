package io.mathlark.larkv2.combinatorics.group;

import java.util.List;

public interface IGroup<T> {
    public List<T> getElements();
    public T identity();
}
