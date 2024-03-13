package io.mathlark.larkv2.combinatorics.permutations;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import io.mathlark.larkv2.combinatorics.group.GroupExpression;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;

public class PermutationGroupExp implements GroupExpression<PermutationExp> {
    private PermutationGroup val;
    private List<PermutationObject> elems;
    private List<PermutationObject> generators;

    public PermutationGroupExp(List<PermutationExp> generators) {
        List<PermutationObject> gens = generators.stream()
            .map(x -> (PermutationObject) x.val())
            .collect(Collectors.toList());

        this.val = new PermutationGroup(gens);
        this.elems = this.val.getElements();
        this.generators = gens;
        Collections.sort(gens);
        Collections.sort(elems);
    }

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return toString();
    }

    public String toString() {
        return this.val.toString();
    }

    @Override
    public IExpression add(IExpression other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public IExpression sub(IExpression other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sub'");
    }

    @Override
    public IExpression mul(IExpression other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mul'");
    }

    @Override
    public IExpression negate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'negate'");
    }

    @Override
    public IExpression pow(IExpression other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pow'");
    }

    @Override
    public IExpression div(IExpression other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'div'");
    }

    @Override
    public IExpression mod(IExpression other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mod'");
    }

    @Override
    public StringExpression head() {
        return new StringExpression("PermutationGroup");
    }

    @Override
    public Object val() {
        return this.val;
    }

    @Override
    public IExpression length() {
        return new NumericExpression(this.elems.size());
    }

    @Override
    public List<PermutationExp> getElements() {
        return elems.stream()
                .map(x -> new PermutationExp(x))
                .collect(Collectors.toList());
    }

    @Override
    public List<PermutationExp> getGenerators() {
        return generators.stream()
                .map(x -> new PermutationExp(x))
                .collect(Collectors.toList());
    }

    @Override
    public PermutationExp getIdentity() {
        return new PermutationExp(this.val.identity());
    }
}
