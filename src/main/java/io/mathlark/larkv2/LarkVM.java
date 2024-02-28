package io.mathlark.larkv2;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.generated.LarkLexer;
import io.mathlark.larkv2.generated.LarkParser;
import io.mathlark.larkv2.symbols.GlobalSymbols;

public class LarkVM {
    public static IExpression parse(String input) {
        CharStream inputStream = CharStreams.fromString(input);
        LarkLexer lexer = new LarkLexer(inputStream);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        LarkParser parser = new LarkParser(stream);
        parser.setErrorHandler(new BailErrorStrategy());

        try {
            IExpression expr  = parser.evaluator().exprObject;
            if (expr != null) {
                return expr.evaluate();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return GlobalSymbols.UNDEFINED;
        }
        return GlobalSymbols.UNDEFINED;
    }
}
