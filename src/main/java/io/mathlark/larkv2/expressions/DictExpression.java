package io.mathlark.larkv2.expressions;

import java.util.HashMap;
import java.util.Map;

import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class DictExpression implements IExpression {
    public Map<IExpression, IExpression> map;
    
    public DictExpression(Map<IExpression, IExpression> map) {
        this.map = map;
    }
    
    @Override
    public IExpression evaluate() {
        Map<IExpression, IExpression> evalMap = new HashMap<>();
        for (IExpression key : map.keySet()) {
            evalMap.put(key, map.get(key).evaluate());
        }
        this.map = evalMap;
        return new DictExpression(this.map);
    }

    @Override
    public String inputForm() {
        return String.format("Dict(%s)", toString());
    }

    @Override
    public IExpression add(IExpression other) {
        Map<IExpression, IExpression> thisDict = this.map;
        IExpression otherExp = other.evaluate();
        if (otherExp instanceof DictExpression) {
            Map<IExpression, IExpression> otherDict = ((DictExpression) otherExp).map;
            thisDict.putAll(otherDict);
            return new DictExpression(thisDict);
        }
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression sub(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression mul(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression negate() {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression pow(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    public IExpression getValue(IExpression keyExp) {
        if (!map.containsKey(keyExp)) {
            System.out.println("Key does not exist: " + keyExp);
            return GlobalSymbols.UNDEFINED;
        }
        return map.get(keyExp);
    }

    @Override
    public IExpression div(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression mod(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public StringExpression head() {
        return new StringExpression("Dict");
    }

    @Override
    public Object val() {
        return this.map;
    }

    @Override
    public IExpression length() {
        return new NumericExpression(this.map.size());
    }

    @SuppressWarnings("unchecked")
    public boolean equals(Object other) {
        Map<IExpression, IExpression> otherDict;
        if (other instanceof DictExpression) {
            otherDict = ((DictExpression) other).map;
        }
        else {
            otherDict = (Map<IExpression, IExpression>) other;
        }

        for (IExpression key: this.map.keySet()) {
            if (!this.map.get(key).equals(otherDict.get(key))) {
                return false;
            }
        }
        return true;
    }
    
}
