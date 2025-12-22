package tdd_unit_tests.airconditioning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import tdd.airconditioning.Sensor;
import tdd.airconditioning.Thermometer;
import tdd_unit_tests.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ThermometerTest {
    @InjectMocks
    Thermometer thermometer;

    @Mock
    Sensor sensor;

    @Test
    void testWorkingSensor() {
        thermometer.setTemperature(25.0);
        when(sensor.isBlocked()).thenReturn(false);
        Assertions.assertEquals(sensor, thermometer.getSensor());
        Assertions.assertEquals(25.0, thermometer.getTemperature(), 0.001);
        verify(sensor, times(1)).isBlocked();
    }

    @Test
    void testBlockedSensor() {
        thermometer.setTemperature(25.0);
        when(sensor.isBlocked()).thenReturn(true);
        Assertions.assertEquals(sensor, thermometer.getSensor());
        Assertions.assertThrows(RuntimeException.class, () -> thermometer.getTemperature());
        verify(sensor, times(1)).isBlocked();
    }
}
