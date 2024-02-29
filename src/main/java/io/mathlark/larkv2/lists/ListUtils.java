package io.mathlark.larkv2.lists;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListUtils {
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> set = new LinkedHashSet<T>();
        for (T elem: list) {
            if (!set.contains(elem)) {
                set.add(elem);
            }
        }

        return new ArrayList<T>(set);
    }
}
