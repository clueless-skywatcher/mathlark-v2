package io.mathlark.larkv2.combinatorics.permutations;

import java.util.List;
import java.util.StringJoiner;
import java.util.ArrayList;

import io.mathlark.larkv2.combinatorics.group.IGroup;
import io.mathlark.larkv2.lists.ListUtils;
import lombok.Getter;

public class PermutationGroup implements IGroup<PermutationObject> {
    private @Getter List<PermutationObject> generators;
    private @Getter long order;
    private PermutationObject identity;

    public PermutationGroup(List<PermutationObject> generators) {
        this.generators = generators;
        int maxLength = 0;
        for (PermutationObject gen: generators) {
            if (gen.getLength() > maxLength) maxLength = gen.getLength();
        }
        this.identity = new PermutationObject(maxLength);
    }

    private List<PermutationObject> getElements(List<PermutationObject> generators, List<PermutationObject> interior, List<PermutationObject> boundary) {
        List<PermutationObject> elems = new ArrayList<>();
        if (boundary.isEmpty()) {
            return interior;
        }
        List<PermutationObject> tempInterior = ListUtils.union(interior, boundary);
        List<PermutationObject> tempBoundary = new ArrayList<>();

        for (PermutationObject h: boundary) {
            for (PermutationObject g: generators) {
                tempBoundary.add(h.compose(g));
            }
        }
        tempBoundary.removeAll(tempInterior);
        elems = ListUtils.union(elems, getElements(generators, tempInterior, tempBoundary));
        return elems;
    }

    public List<PermutationObject> getElements() {
        int maxLength = 0;
        for (PermutationObject gen: generators) {
            if (gen.getLength() > maxLength) {
                maxLength = gen.getLength();
            }
        }
        return getElements(generators, new ArrayList<>(), List.of(new PermutationObject(maxLength)));
    }

    @Override
    public PermutationObject identity() {
        return identity;
    }

    public String toString() {
        StringJoiner grp = new StringJoiner(", ");
        for (PermutationObject gen: generators) {
            grp.add(gen.toString());
        }
        return String.format("PermutationGroup(%s)", grp.toString());
    }
}
