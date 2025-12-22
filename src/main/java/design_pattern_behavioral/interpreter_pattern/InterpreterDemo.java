package design_pattern_behavioral.interpreter_pattern;

public class InterpreterDemo {
    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression alternation1 = new AndExpression(terminal1, terminal2);

        // Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal3, alternation1);

        return new AndExpression(terminal3, alternation2);
    }

    static void main() {
//        String context = "Lions";
//        String context = "Tigers";
//        String context = "Bears";
//        String context = "Lions Tigers";
//        String context = "Lions Bears";
        String context = "Tigers Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }
}

