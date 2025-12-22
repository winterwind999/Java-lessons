package tdd_unit_tests.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import tdd.airport.Flight;
import tdd.database.Database;
import tdd_unit_tests.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static tdd.database.DatabaseUtil.buildFlightsList;

@ExtendWith(MockitoExtension.class)
public class StatisticsTest {
    @Spy
    private Database database;

    private List<List<String>> queriedData;
    private List<Flight> flightsList;

    @BeforeEach
    void before() {
        queriedData = new ArrayList<>();
        List<String> row1 = Arrays.asList("1", "e", "Mike", "false", "349");
        List<String> row2 = Arrays.asList("2", "b", "John", "true", "278");
        List<String> row3 = Arrays.asList("3", "e", "Mike", "false", "319");
        List<String> row4 = Arrays.asList("4", "p", "John", "true", "817");
        List<String> row5 = Arrays.asList("5", "e", "Mike", "false", "623");
        List<String> row6 = Arrays.asList("6", "e", "John", "true", "978");
        queriedData.add(row1);
        queriedData.add(row2);
        queriedData.add(row3);
        queriedData.add(row4);
        queriedData.add(row5);
        queriedData.add(row6);
    }

    @Test
    void testQueriedData() {
        when(database.getQueriedData()).thenReturn(queriedData);
        flightsList = buildFlightsList(queriedData);
        Assertions.assertEquals(6, database.getQueriedData().size());
        Assertions.assertEquals(6, flightsList.size());
        Assertions.assertEquals(560.666, database.averageDistance(flightsList), 0.001);
        Assertions.assertEquals(278, database.minimumDistance(flightsList));
        Assertions.assertEquals(978, database.maximumDistance(flightsList));
    }
}