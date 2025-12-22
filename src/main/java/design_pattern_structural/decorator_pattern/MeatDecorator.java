package design_pattern_structural.decorator_pattern;

public class MeatDecorator extends SandwichDecorator {
    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + turkey";
    }
}
