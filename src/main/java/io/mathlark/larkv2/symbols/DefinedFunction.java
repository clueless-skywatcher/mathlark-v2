package io.mathlark.larkv2.symbols;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

import io.mathlark.larkv2.exceptions.ReturningException;
import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.fileread.LarkFileReadingVisitor;
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

    public IExpression invoke(List<IExpression> args, Map<String, DefinedFunction> funcs) {
        if (args.size() != this.paramNames.size()) {
            throw new RuntimeException("Illegal function call");
        }

        SymbolScope scope = new SymbolScope(parentScope, true);

        for (int i = 0; i < this.paramNames.size(); i++) {
            IExpression expr = args.get(i);
            scope.assign(this.paramNames.get(i), expr);
        }

        LarkFileReadingVisitor vis = new LarkFileReadingVisitor(scope, funcs);

        IExpression returnVal = GlobalSymbols.UNDEFINED;
        try {
            vis.visit(block);
        }
        catch (ReturningException r) {
            returnVal = r.getExpr();
        }
        return returnVal;
    }
}
