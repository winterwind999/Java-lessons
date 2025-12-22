package design_pattern_structural.decorator_pattern;

public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Bread";
    }
}
