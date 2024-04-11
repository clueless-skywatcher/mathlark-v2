package io.mathlark.larkv2.lists;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LexicographicComparator<T extends Comparable<T>> implements Comparator<List<T>> {
    private Comparator<T> comparator;

    public LexicographicComparator() {
        this.comparator = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        };
    }

    @Override
    public int compare(List<T> o1, List<T> o2) {
        Iterator<T> i1 = o1.iterator();
        Iterator<T> i2 = o2.iterator();

        while (i1.hasNext() && i2.hasNext()) {
            int compare = comparator.compare(i1.next(), i2.next());
            if (compare != 0) return compare;
        }

        if (!i1.hasNext() && i2.hasNext()) return -1;
        if (i1.hasNext() && !i2.hasNext()) return 1;
        return 0;
    }
    
}
