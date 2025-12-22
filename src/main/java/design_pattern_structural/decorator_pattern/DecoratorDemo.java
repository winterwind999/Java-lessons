package design_pattern_structural.decorator_pattern;

public class DecoratorDemo {
    static void main() {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
