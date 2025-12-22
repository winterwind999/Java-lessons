package tdd.database;

import tdd.airport.*;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtil {

    private DatabaseUtil() {

    }

    public static List<Flight> buildFlightsList(List<List<String>> queriedData) {
        List<Flight> flightsList = new ArrayList<>();
        for (List<String> row : queriedData) {
            Flight flight;
            if (row.get(1).equals("e")) {
                flight = new EconomyFlight(Integer.parseInt(row.get(0)));
            } else if (row.get(1).equals("b")) {
                flight = new BusinessFlight(Integer.parseInt(row.get(0)));
            } else {
                flight = new PremiumFlight(Integer.parseInt(row.get(0)));
            }
            flight.addPassenger(new Passenger(row.get(2), Boolean.parseBoolean(row.get(3))));
            flight.setDistance(Integer.parseInt(row.get(4)));
            flightsList.add(flight);
        }
        return flightsList;
    }
}