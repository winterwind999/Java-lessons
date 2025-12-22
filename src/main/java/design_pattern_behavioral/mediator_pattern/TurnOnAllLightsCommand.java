package design_pattern_behavioral.mediator_pattern;

public class TurnOnAllLightsCommand implements Command {
    private final Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
