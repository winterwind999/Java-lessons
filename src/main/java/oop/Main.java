package oop;

public class Main {
    static void main() {
        Car car1 = new Car();
        car1.go();
        car1.go();
        car1.stop();
        car1.setDrivable(false);
        car1.go();
        car1.stop();

        System.out.println();

        Car car2 = new Car(false);
        car2.go();
        car2.stop();
        car2.setDrivable(true);
        car2.go();
        car2.stop();

        System.out.println();

        // Polymorphism
        // The same Vehicle reference calls go(), but the Car implementation is executed at runtime.
        VehicleAbstract car3 = new Car();
        car3.go();
        car3.go();

        System.out.println();

        Propeller propeller = new Propeller();
        VehicleAbstract boat = new Boat(propeller);
        boat.go();
        boat.stop();
    }
}
