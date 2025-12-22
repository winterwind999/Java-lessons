package design_pattern_structural.bridge_pattern;

public class Green implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}
