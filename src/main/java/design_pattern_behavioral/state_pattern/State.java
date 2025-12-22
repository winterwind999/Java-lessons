package design_pattern_behavioral.state_pattern;

public abstract class State {
    public void handleRequest() {
        System.out.println("Shouldn't be able to get here.");
    }
}
