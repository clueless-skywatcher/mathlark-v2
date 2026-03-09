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
    private List<String> paramTypes;
    private ParseTree block;
    private @Getter String name;

    public DefinedFunction(String name, SymbolScope parentScope, List<String> paramNames, ParseTree block) {
        this(name, parentScope, paramNames, null, block);
    }

    public DefinedFunction(String name, SymbolScope parentScope, List<String> paramNames, List<String> paramTypes, ParseTree block) {
        this.parentScope = parentScope;
        this.paramNames = paramNames;
        this.paramTypes = paramTypes;
        this.block = block;
        this.name = name;
    }

    public IExpression invoke(List<IExpression> args, Map<String, DefinedFunction> funcs) {
        if (args.size() != this.paramNames.size()) {
            throw new RuntimeException("Illegal function call");
        }

        // Type check: if a parameter has a type annotation, verify
        // the argument matches. Return Undefined on mismatch.
        if (paramTypes != null) {
            for (int i = 0; i < args.size(); i++) {
                String expectedType = paramTypes.get(i);
                if (expectedType != null && !matchesType(args.get(i), expectedType)) {
                    return GlobalSymbols.UNDEFINED;
                }
            }
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

    /**
     * Check if an expression matches a declared type name.
     * Uses head() which returns the expression's type as a string.
     * "Numeric" is a special alias that matches both "Integer" and "Decimal".
     */
    private static boolean matchesType(IExpression expr, String typeName) {
        String head = expr.head().toString();
        if (typeName.equals("Numeric")) {
            return head.equals("Integer") || head.equals("Decimal");
        }
        return head.equals(typeName);
    }
}
