package design_pattern_behavioral.interpreter_pattern.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo {
    static void main() {
        String input = "Lions, and tigers, and bears! Oh, my!";
        String lowercaseInput = input.toLowerCase();

        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger)");
        Matcher m = p.matcher(lowercaseInput);

        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }
    }
}
