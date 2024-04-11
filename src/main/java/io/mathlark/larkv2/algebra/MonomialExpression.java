package io.mathlark.larkv2.algebra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.general.ExpressionComparison;
import io.mathlark.larkv2.lists.LexicographicComparator;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import io.mathlark.larkv2.utils.FunctionUtils;
import lombok.Getter;

public class MonomialExpression implements IExpression, Comparable<MonomialExpression> {
    private @Getter Map<String, IExpression> powerMap;
    private @Getter List<String> symbols;
    private List<NumericExpression> sortedDegrees;

    public MonomialExpression(Map<String, IExpression> powerMap) {
        this.powerMap = powerMap;
        this.symbols = powerMap.keySet().stream().sorted().collect(Collectors.toList());
        this.sortedDegrees = new ArrayList<>();
        
        for (String s: this.symbols) {
            if (!FunctionUtils.isInstanceOf(powerMap.get(s), NumericExpression.class)) {
                throw new UnsupportedOperationException("Powers should always be an integer");
            }
            else if (((NumericExpression) powerMap.get(s)).isDecimal()) {
                throw new UnsupportedOperationException("Powers should always be an integer");
            }
            if (!powerMap.get(s).equals(GlobalSymbols.ZERO))
                this.sortedDegrees.add((NumericExpression) powerMap.get(s));
        }
    }

    public MonomialExpression(HashMap<String, Long> powerMap) {
        this.powerMap = new HashMap<>();

        for (Map.Entry<String, Long> e: powerMap.entrySet()) {
            if (e.getValue() != 0)
                this.powerMap.put(e.getKey(), new NumericExpression(e.getValue()));
        }

        this.symbols = this.powerMap.keySet().stream().sorted().collect(Collectors.toList());
        this.sortedDegrees = new ArrayList<>();
        
        for (String s: this.symbols) {
            this.sortedDegrees.add((NumericExpression) this.powerMap.get(s));
        }
    }

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return "Monomial";
    }

    @Override
    public IExpression add(IExpression other) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public IExpression sub(IExpression other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sub'");
    }

    @Override
    public IExpression mul(IExpression other) {
        if (other.equals(GlobalSymbols.ZERO)) {
            return GlobalSymbols.ZERO;
        }
        if (other.equals(GlobalSymbols.ONE)) {
            return this;
        }

        if (!FunctionUtils.isInstanceOf(other, MonomialExpression.class)) {
            throw new UnsupportedOperationException("Can only multiply monomial with monomial");
        }

        Map<String, IExpression> newPowerMap = new HashMap<>();
        newPowerMap.putAll(powerMap);
        MonomialExpression otherMonomial = (MonomialExpression) other;

        for (String symbol: otherMonomial.powerMap.keySet()) {
            if (!newPowerMap.containsKey(symbol)) {
                newPowerMap.put(symbol, otherMonomial.powerMap.get(symbol));
            }
            else {
                newPowerMap.put(symbol, newPowerMap.get(symbol).add(otherMonomial.powerMap.get(symbol)));
            }
        }

        return new MonomialExpression(newPowerMap);
    }

    @Override
    public IExpression negate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'negate'");
    }

    @Override
    public IExpression pow(IExpression other) {
        if (!FunctionUtils.isInstanceOf(other, NumericExpression.class)) {
            throw new UnsupportedOperationException("Can only take powers of monomial with integers");
        }
        else if (((NumericExpression) other).isDecimal()) {
            throw new UnsupportedOperationException("Can only take powers of monomial with integers");
        }

        if (other.equals(GlobalSymbols.ZERO)) {
            return GlobalSymbols.ONE;
        }
        if (other.equals(GlobalSymbols.ONE)) {
            return this;
        }

        Map<String, IExpression> newPowerMap = new HashMap<>();
        for (String symbol: powerMap.keySet()) {
            newPowerMap.put(symbol, powerMap.get(symbol).mul(other));
        }

        return new MonomialExpression(newPowerMap);
    }

    @Override
    public IExpression div(IExpression other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'div'");
    }

    @Override
    public IExpression mod(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public StringExpression head() {
        return new StringExpression("Polynomial");
    }

    @Override
    public Object val() {
        return this.powerMap;
    }

    @Override
    public IExpression length() {
        return GlobalSymbols.ZERO;
    }

    public boolean equals(Object other) {
        if (!(other instanceof MonomialExpression)) {
            return false;
        }
        MonomialExpression otherMonomial = (MonomialExpression) other;
        
        Map<String, IExpression> cleanedPowerSelf = new HashMap<>();
        Map<String, IExpression> cleanedPowerOther = new HashMap<>();

        for (Map.Entry<String, IExpression> eSelf: this.powerMap.entrySet()) {
            if (!eSelf.getValue().equals(GlobalSymbols.ZERO)) cleanedPowerSelf.put(eSelf.getKey(), eSelf.getValue());
        }

        for (Map.Entry<String, IExpression> eOther: otherMonomial.powerMap.entrySet()) {
            if (!eOther.getValue().equals(GlobalSymbols.ZERO)) cleanedPowerOther.put(eOther.getKey(), eOther.getValue());
        }

        return cleanedPowerSelf.equals(cleanedPowerOther);
    }

    public String toString() {
        StringBuilder endRepr = new StringBuilder();
        Map<String, IExpression> treeMap = new TreeMap<>();
        treeMap.putAll(this.powerMap);

        for (Map.Entry<String, IExpression> e: treeMap.entrySet()) {
            String symbol = e.getKey();
            IExpression power = e.getValue();

            if (power.equals(GlobalSymbols.ONE)) {
                endRepr.append(symbol);
            }
            else if (ExpressionComparison.gt(power, GlobalSymbols.ZERO)) {
                endRepr.append(String.format("%s^%s", symbol, power.toString()));
            }
        }

        return endRepr.toString();
    }

    @Override
    public int compareTo(MonomialExpression o) {
        Set<String> symbols = new HashSet<>(this.symbols);
        symbols.addAll(o.symbols);
        List<String> sortedSymbols = new ArrayList<>(symbols);
        sortedSymbols.sort(null);

        List<NumericExpression> thisSortedDegrees = new ArrayList<>();
        List<NumericExpression> otherSortedDegrees = new ArrayList<>();

        for (String symbol: sortedSymbols) {
            if (!this.symbols.contains(symbol)) {
                thisSortedDegrees.add(GlobalSymbols.ZERO);
            }
            else {
                thisSortedDegrees.add((NumericExpression) this.powerMap.get(symbol));
            }

            if (!o.symbols.contains(symbol)) {
                otherSortedDegrees.add(GlobalSymbols.ZERO);
            }
            else {
                otherSortedDegrees.add((NumericExpression) o.powerMap.get(symbol));
            }
        }

        Comparator<List<NumericExpression>> comparator = new LexicographicComparator<NumericExpression>();
        return -comparator.compare(thisSortedDegrees, otherSortedDegrees);
    }

    public long degree(String symbol) {
        return ((NumericExpression) powerMap.get(symbol)).value.longValue();
    }
    
    public long degree() {
        long degree = 0;
        for (String symbol: powerMap.keySet()) {
            degree += ((NumericExpression) powerMap.get(symbol)).value.longValue();
        }

        return degree;
    }
}
