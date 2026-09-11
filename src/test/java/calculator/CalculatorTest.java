package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5.0, calc.add(2.0, 3.0), "2 + 3 should equal 5");
        assertEquals(1, calc.getHistory().size(), "History should contain 1 entry");
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(4.0, calc.subtract(10.0, 6.0), "10 - 6 should equal 4");
    }
}
