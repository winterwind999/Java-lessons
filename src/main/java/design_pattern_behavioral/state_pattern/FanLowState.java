package design_pattern_behavioral.state_pattern;

public class FanLowState extends State {
    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning Fan on to med.");
        fan.setState(fan.getMedState());
    }

    @Override
    public String toString() {
        return "Fan is on low";
    }
}
