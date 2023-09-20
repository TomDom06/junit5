import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    void testSubtract() {
        int result = calculator.subtract(10, 3);
        assertEquals(7, result);
    }

    @Test
    void testMultiply() {
        int result = calculator.multiply(4, 6);
        assertEquals(24, result);
    }

    @Test
    void testDivide() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result);
    }
}
