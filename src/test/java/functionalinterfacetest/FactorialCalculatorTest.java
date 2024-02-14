package functionalinterfacetest;

// FactorialCalculatorTest.java
import functionalinterface.FactorialCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialCalculatorTest {
    @Test
    public void testCalculateFactorial() {
        // Test case for 0! (factorial of 0)
        assertEquals(1, FactorialCalculator.calculateFactorial(0));

        // Test cases for positive integers
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
        assertEquals(2, FactorialCalculator.calculateFactorial(2));
        assertEquals(6, FactorialCalculator.calculateFactorial(3));

        // Test case for large number
        assertEquals(479001600, FactorialCalculator.calculateFactorial(12));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumber() {
        FactorialCalculator.calculateFactorial(-5); // Negative number should throw an exception
    }
}

