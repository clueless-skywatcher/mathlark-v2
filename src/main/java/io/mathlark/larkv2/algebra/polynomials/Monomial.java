package io.mathlark.larkv2.algebra.polynomials;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Monomial implements Comparable<Monomial> {
    private Map<String, Long> powerMap = new HashMap<>();
    private List<String> symbols;

    public Monomial(Map<String, Long> powerMap) {
        this.powerMap = powerMap;
        this.symbols = new ArrayList<>(this.powerMap.keySet());
        this.symbols.sort(null);
    }

    public String toString() {
        StringBuilder endRepr = new StringBuilder();
        Map<String, Long> treeMap = new TreeMap<>();
        treeMap.putAll(this.powerMap);

        for (Map.Entry<String, Long> e: treeMap.entrySet()) {
            String symbol = e.getKey();
            Long power = e.getValue();

            if (power == 1) {
                endRepr.append(symbol);
            }
            else if (power > 0) {
                endRepr.append(String.format("%s^%s", symbol, power.toString()));
            }
        }

        return endRepr.toString();
    }

    public boolean equals(Object other) {
        if (!(other instanceof Monomial)) {
            return false;
        }
        Monomial otherMonomial = (Monomial) other;
        
        Map<String, Long> cleanedPowerSelf = new HashMap<>();
        Map<String, Long> cleanedPowerOther = new HashMap<>();

        for (Map.Entry<String, Long> eSelf: this.powerMap.entrySet()) {
            if (eSelf.getValue() != 0) cleanedPowerSelf.put(eSelf.getKey(), eSelf.getValue());
        }

        for (Map.Entry<String, Long> eOther: otherMonomial.powerMap.entrySet()) {
            if (eOther.getValue() != 0) cleanedPowerOther.put(eOther.getKey(), eOther.getValue());
        }

        return cleanedPowerSelf.equals(cleanedPowerOther);
    }

    @Override
    public int compareTo(Monomial o) {
        Set<String> symbols = new HashSet<>(this.symbols);
        symbols.addAll(o.symbols);
        List<String> sortedSymbols = new ArrayList<>(symbols);
        sortedSymbols.sort(null);

        List<Long> thisSortedDegrees = new ArrayList<>();
        List<Long> otherSortedDegrees = new ArrayList<>();

        for (String symbol: sortedSymbols) {
            if (!this.symbols.contains(symbol)) {
                thisSortedDegrees.add(0L);
            }
            else {
                thisSortedDegrees.add((Long) this.powerMap.get(symbol));
            }

            if (!o.symbols.contains(symbol)) {
                otherSortedDegrees.add(0L);
            }
            else {
                otherSortedDegrees.add((Long) o.powerMap.get(symbol));
            }
        }

        Comparator<List<Long>> comparator = new LexicographicComparator<Long>();
        return -comparator.compare(thisSortedDegrees, otherSortedDegrees);
    }

    public Monomial mul(Monomial other) {
        Map<String, Long> newPowerMap = new HashMap<>();
        newPowerMap.putAll(powerMap);
        Monomial otherMonomial = (Monomial) other;

        for (String symbol: otherMonomial.powerMap.keySet()) {
            if (!newPowerMap.containsKey(symbol)) {
                newPowerMap.put(symbol, otherMonomial.powerMap.get(symbol));
            }
            else {
                newPowerMap.put(symbol, newPowerMap.get(symbol) + otherMonomial.powerMap.get(symbol));
            }
        }
        return new Monomial(newPowerMap);
    }

    public Monomial pow(Long other) {
        if (other == 0) {
            throw new RuntimeException("Cannot take monomial powers to 0");
        }

        if (other == 1) return this;

        Map<String, Long> newPowerMap = new HashMap<>();
        for (String symbol: powerMap.keySet()) {
            newPowerMap.put(symbol, powerMap.get(symbol) * other);
        }

        return new Monomial(newPowerMap);
    }
}
