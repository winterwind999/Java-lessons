package design_pattern_structural.bridge_pattern;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
