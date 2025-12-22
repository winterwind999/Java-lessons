package design_pattern_behavioral.state_pattern;

public class FanOffState extends State {
    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning Fan on to low.");
        fan.setState(fan.getLowState());
    }

    @Override
    public String toString() {
        return "Fan is off";
    }
}
