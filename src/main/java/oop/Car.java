package oop;

// Inheritance
// Car inherits the contract defined by Vehicle
public class Car extends VehicleAbstract {
    // Encapsulation
    // Internal state is private, hidden, and controlled through methods
    private boolean isDriving;
    private boolean isDrivable;

    public Car() {
        this.isDriving = false;
        this.isDrivable = true;
    }

    public Car(boolean isDrivable) {
        this.isDriving = false;
        this.isDrivable = isDrivable;
    }

    @Override
    public void go() {
        if (!isDrivable) {
            System.out.println("The car is not drivable");
            return;
        }

        if (isDriving) {
            System.out.println("The car is already driving");
            return;
        }

        isDriving = true;
        System.out.println("The car is driving");
    }

    @Override
    public void stop() {
        if (!isDriving) {
            System.out.println("The car is not driving");
            return;
        }

        isDriving = false;
        System.out.println("The car has stopped");
    }

    public boolean isDriving() {
        return isDriving;
    }

    public boolean isDrivable() {
        return isDrivable;
    }

    public void setDrivable(boolean drivable) {
        isDrivable = drivable;

        if (!drivable && isDriving) {
            isDriving = false;
        }
    }
}
