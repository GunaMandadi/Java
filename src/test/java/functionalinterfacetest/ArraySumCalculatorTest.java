package functionalinterfacetest;


import functionalinterface.ArraySumCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

// ArraySumCalculatorTest.java
public class ArraySumCalculatorTest {
    @Test
    public void testCalculateSum() {
        // Test case with positive numbers
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(15, ArraySumCalculator.calculateSum(array1));

        // Test case with negative numbers
        int[] array2 = {-1, -2, -3, -4, -5};
        assertEquals(-15, ArraySumCalculator.calculateSum(array2));

        // Test case with mixed numbers
        int[] array3 = {1, -2, 3, -4, 5};
        assertEquals(3, ArraySumCalculator.calculateSum(array3));

    }
}
