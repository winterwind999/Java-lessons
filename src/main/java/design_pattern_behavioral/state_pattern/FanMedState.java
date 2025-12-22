package design_pattern_behavioral.state_pattern;

public class FanMedState extends State {
    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning Fan on to high.");
        fan.setState(fan.getHighState());
    }

    @Override
    public String toString() {
        return "Fan is on medium";
    }
}
