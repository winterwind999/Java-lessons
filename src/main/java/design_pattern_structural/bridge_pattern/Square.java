package design_pattern_structural.bridge_pattern;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
