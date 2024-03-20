package io.mathlark.larkv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.fileread.LarkFileReader;
import io.mathlark.larkv2.symbols.SymbolScope;
import jline.TerminalFactory;
import jline.console.ConsoleReader;
import jline.console.completer.StringsCompleter;

public class LarkInterpreter {
    public static void main(String[] args) {
        SymbolScope scope = new SymbolScope();
        if (args.length > 0) {
            LarkFileReader.executeFile(args[0], scope);
            return;
        }
        console();
    }

    public static void console() {
        try {
            try (ConsoleReader console = new ConsoleReader()) {
                console.setExpandEvents(false);
                List<String> strList = new ArrayList<>();

                InputStream stream = LarkInterpreter.class.getClassLoader().getResourceAsStream("functions.lst");
                BufferedReader br = new BufferedReader(new InputStreamReader(stream));
                String fct;
                while ((fct = br.readLine()) != null) {
                    strList.add(fct);
                }
                
                console.addCompleter(new StringsCompleter(strList));
                console.setPrompt(">> ");

                String line;
                while ((line = console.readLine()) != null) {
                    IExpression result = LarkVM.parse(line);
                    if (result != null) {
                        System.out.println(result.toString());
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                TerminalFactory.get().restore();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
