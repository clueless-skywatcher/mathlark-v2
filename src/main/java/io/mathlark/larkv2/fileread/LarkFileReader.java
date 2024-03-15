package io.mathlark.larkv2.fileread;

import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import io.mathlark.larkv2.generated.LarkLexer;
import io.mathlark.larkv2.generated.LarkParser;

public class LarkFileReader {
    public static void executeFile(String fileName) {
        try {
            LarkLexer lexer = new LarkLexer(CharStreams.fromFileName(fileName));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            LarkParser parser = new LarkParser(tokens);
            for (LarkParser.ExprContext expr: parser.lkFile().expr()) {
                expr.exprObject.evaluate();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
