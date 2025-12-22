package tdd.milage;

import tdd.airport.Passenger;

import java.util.HashMap;
import java.util.Map;

public class Milage {
    public static final int VIP_FACTOR = 10;
    public static final int USUAL_FACTOR = 20;

    private Map<Passenger, Integer> passengersMilageMap = new HashMap<>();
    private Map<Passenger, Integer> passengerPointsMap = new HashMap<>();

    public Map<Passenger, Integer> getPassengerPointsMap() {
        return passengerPointsMap;
    }

    public void addMilage(Passenger passenger, int miles) {
        if (passengersMilageMap.containsKey(passenger)) {
            passengersMilageMap.put(passenger, passengersMilageMap.get(passenger) + miles);
        } else {
            passengersMilageMap.put(passenger, miles);
        }
    }

    public void calculateGivenPoint() {
        for (Passenger passenger : passengersMilageMap.keySet()) {
            if (passenger.isVip()) {
                passengerPointsMap.put(passenger, passengersMilageMap.get(passenger) / VIP_FACTOR);
            } else {
                passengerPointsMap.put(passenger, passengersMilageMap.get(passenger) / USUAL_FACTOR);
            }
        }
    }
}
