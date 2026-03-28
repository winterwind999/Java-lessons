package oop;

public class Boat extends VehicleAbstract {
    // Composition
    // Boat HAS-A Propeller and achieves behavior by delegating work instead of inheriting it
    private final Propeller propeller;

    // Dependency Injection
    public Boat(Propeller propeller) {
        this.propeller = propeller;
    }

    @Override
    public void go() {
        propeller.start();
        System.out.println("Boat is running");
    }

    @Override
    public void stop() {
        propeller.stop();
        System.out.println("Boat has stopped");
    }
}
