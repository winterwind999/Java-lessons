package tdd.database;

import tdd.airport.Flight;

import java.util.*;

public class Database {
    private Map<String, String> registeredUsers = new HashMap<>();
    List<List<String>> queriedData = new ArrayList<>();

    public boolean login(Credentials credentials) {
        String username = credentials.getUsername();
        String password = credentials.getPassword();

        return registeredUsers.containsKey(username) && registeredUsers.get(username).equals(password);
    }

    public List<List<String>> getQueriedData() {
        return queriedData;
    }

    public double averageDistance(List<Flight> flightList) {
        return flightList.stream().mapToDouble(Flight::getDistance).average().getAsDouble();
    }

    public int minimumDistance(List<Flight> flightList) {
        return flightList.stream().mapToInt(Flight::getDistance).min().getAsInt();
    }

    public int maximumDistance(List<Flight> flightList) {
        return flightList.stream().mapToInt(Flight::getDistance).max().getAsInt();
    }
}
