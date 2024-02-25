package io.mathlark.larkv2;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.generated.LarkInterpretLexer;
import io.mathlark.larkv2.generated.LarkInterpretParser;

public class LarkVM {
    public Object parse(String input) {
        CharStream inputStream = CharStreams.fromString(input);
        LarkInterpretLexer lexer = new LarkInterpretLexer(inputStream);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        LarkInterpretParser parser = new LarkInterpretParser(stream);
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
            return null;
        }
        return null;
    }
}
