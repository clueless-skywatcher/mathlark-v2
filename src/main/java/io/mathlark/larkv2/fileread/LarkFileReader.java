package io.mathlark.larkv2.fileread;

import java.util.Map;
import java.util.HashMap;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import io.mathlark.larkv2.generated.LarkFileParser;
import io.mathlark.larkv2.generated.LarkLexer;
import io.mathlark.larkv2.symbols.DefinedFunction;
import io.mathlark.larkv2.symbols.FunctionTable;
import io.mathlark.larkv2.symbols.SymbolScope;

public class LarkFileReader {
    public static void executeFile(String fileName) {
        try {
            SymbolScope scope = new SymbolScope();
            LarkLexer lexer = new LarkLexer(CharStreams.fromFileName(fileName));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            Map<String, DefinedFunction> funcs = new HashMap<>();

            LarkFileParser parser = new LarkFileParser(tokens);
            LarkFileReadingVisitor visitor = new LarkFileReadingVisitor(scope, funcs);
            visitor.visit(parser.lkFile());
        
            FunctionTable.registerAll(funcs);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadResource(String resourcePath) {
        try {
            InputStream stream = LarkFileReader.class
                .getClassLoader()
                .getResourceAsStream(resourcePath);

            if (stream == null) {
                System.err.println("Could not find resource: " + resourcePath);
            }

            SymbolScope scope = new SymbolScope();
            LarkLexer lexer = new LarkLexer(CharStreams.fromStream(stream));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            Map<String, DefinedFunction> funcs = new HashMap<>();

            LarkFileParser parser = new LarkFileParser(tokens);
            LarkFileReadingVisitor visitor = new LarkFileReadingVisitor(scope, funcs);
            visitor.visit(parser.lkFile());

            FunctionTable.registerAll(funcs);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
