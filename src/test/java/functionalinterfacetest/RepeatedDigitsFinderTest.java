package functionalinterfacetest;

import functionalinterface.RepeatedDigitsFinder;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Set;

// RepeatedDigitsFinderTest.java
public class RepeatedDigitsFinderTest {
    @Test
    public void testFindRepeatedDigits() {
        // Test case with repeated digits
        int number1 = 122345;
        Set<Integer> expected1 = Set.of(2);
        assertEquals(expected1, RepeatedDigitsFinder.findRepeatedDigits(number1));

        // Test case with no repeated digits
        int number2 = 123456;
        Set<Integer> expected2 = Set.of();
        assertEquals(expected2, RepeatedDigitsFinder.findRepeatedDigits(number2));

    }
}

