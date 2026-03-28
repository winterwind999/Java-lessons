package tdd_unit_tests.airconditioning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import tdd.airconditioning.AirConditioningSystem;
import tdd.airconditioning.Thermometer;
import tdd_unit_tests.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AirConditioningSystemTest {

    @InjectMocks
    AirConditioningSystem airConditioningSystem;

    @Mock
    Thermometer thermometer;

    @Test
    void testAirConditionedSystemStarted() {
        when(thermometer.getTemperature()).thenReturn(25.0);
        airConditioningSystem.setTemperatureThreshold(24.0);
        airConditioningSystem.checkAirConditioningSystem();
        Assertions.assertTrue(airConditioningSystem.isOpen());
        verify(thermometer, times(1)).getTemperature();
    }

    @Test
    void testAirConditionedSystemStopped() {
        when(thermometer.getTemperature()).thenReturn(23.0);
        airConditioningSystem.setTemperatureThreshold(24.0);
        airConditioningSystem.checkAirConditioningSystem();
        Assertions.assertFalse(airConditioningSystem.isOpen());
        verify(thermometer, times(1)).getTemperature();
    }
}
