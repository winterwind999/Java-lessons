package design_pattern_behavioral.command_pattern;

// invoker
public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
