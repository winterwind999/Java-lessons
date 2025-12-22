package design_pattern_structural.bridge_pattern;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
