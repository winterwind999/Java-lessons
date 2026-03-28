package tdd_unit_tests.milage;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import tdd.airport.*;

public class FlightArgumentConverter extends SimpleArgumentConverter {

    @Override
    protected Object convert(Object source, Class<?> targetType) {
        Assertions.assertEquals(String.class, source.getClass(), "Can only convert from String");
        Assertions.assertEquals(Flight.class, targetType, "Can only convert to Flight");

        String[] flightString = source.toString().split(";");
        Flight flight = null;

        switch (flightString[1].toLowerCase().trim()) {
            case "b" : flight = new BusinessFlight(Integer.parseInt(flightString[0]));
                break;
            case "p" : flight = new PremiumFlight(Integer.parseInt(flightString[0]));
                break;
            case "e" : flight = new EconomyFlight(Integer.parseInt(flightString[0]));
                break;
        }

        flight.addPassenger(new Passenger(flightString[2].trim(), Boolean.valueOf(flightString[3].trim())));
        flight.setDistance(Integer.valueOf(flightString[4].trim()));

        return flight;
    }
}
