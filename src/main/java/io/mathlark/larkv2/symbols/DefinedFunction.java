package io.mathlark.larkv2.symbols;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import lombok.Getter;

public class DefinedFunction {
    private @Getter SymbolScope parentScope;
    private List<String> paramNames;
    private ParseTree block;
    private @Getter String name; 

    public DefinedFunction(String name, SymbolScope parentScope, List<String> paramNames, ParseTree block) {
        this.parentScope = parentScope;
        this.paramNames = paramNames;
        this.block = block;
        this.name = name;
    }
}
