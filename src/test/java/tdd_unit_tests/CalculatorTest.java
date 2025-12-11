package tdd_unit_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.Calculator;

public class CalculatorTest {
    @DisplayName("Testing calculator")
    @Test
    public void myTest() {
        Calculator calculator = new Calculator();

        Assertions.assertEquals(5, calculator.add(2,3));
        Assertions.assertEquals(-1, calculator.subtract(2,3));
    }
}
