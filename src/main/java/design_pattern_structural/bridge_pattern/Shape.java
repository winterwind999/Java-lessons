package design_pattern_structural.bridge_pattern;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
