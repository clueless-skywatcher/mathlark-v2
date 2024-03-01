package io.mathlark.larkv2.lists;

import java.util.ArrayList;
import java.util.Comparator;
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

    public static <T> List<T> intersection(List<T> list1, List<T> list2) {
        Set<T> set = new LinkedHashSet<>(ListUtils.removeDuplicates(list1));
        List<T> result = new ArrayList<>();
        for (T elem: list2) {
            if (set.contains(elem)) {
                result.add(elem);
            }
        }
        result.sort(new Comparator<T>() {
            @Override
            public int compare(T arg0, T arg1) {
                return arg0.toString().compareTo(arg1.toString());
            }
            
        });
        return result;
    }

    public static <T> List<T> union(List<T> list1, List<T> list2) {
        Set<T> set = new LinkedHashSet<>(list1);
        for (T elem: list2) {
            set.add(elem);
        }
        List<T> result = new ArrayList<>(set);
        result.sort(new Comparator<T>() {
            @Override
            public int compare(T arg0, T arg1) {
                return arg0.toString().compareTo(arg1.toString());
            }
        });
        return result;
    }
}
