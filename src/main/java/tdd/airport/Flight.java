package tdd.airport;

import java.util.HashSet;
import java.util.Set;

public abstract class Flight {
    private int id;
    private int distance;
    protected Set<Passenger> passengers = new HashSet<>();

    public Flight(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Set<Passenger> getPassengers() {
        return passengers;
    }

    public abstract boolean addPassenger(Passenger passenger);

    public abstract boolean removePassenger(Passenger passenger);
}
