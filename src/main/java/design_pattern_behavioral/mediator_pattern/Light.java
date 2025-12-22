package design_pattern_behavioral.mediator_pattern;

public class Light {
    private boolean isOn = false;
    private String location = "";

    public Light() {

    }

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        System.out.println(location + "Light switched on");
        isOn = !isOn;
    }
}
