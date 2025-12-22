package design_pattern_behavioral.state_pattern;

public class FanHighState extends State {
    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning Fan on to off.");
        fan.setState(fan.getOffState());
    }

    @Override
    public String toString() {
        return "Fan is on high";
    }
}
