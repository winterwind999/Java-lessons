package design_pattern_behavioral.mediator_pattern;

public class MediatorDemo {
    static void main() {
        Mediator mediator = new Mediator();
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);

        turnOnAllLightsCommand.execute();
    }
}
