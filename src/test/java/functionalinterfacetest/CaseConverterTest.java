package functionalinterfacetest;


import functionalinterface.CaseConverter;
import org.junit.Test;
import static org.junit.Assert.*;

// CaseConverterTest.java
public class CaseConverterTest {
    @Test
    public void testSwapCase() {
        // Test case with only lower-case characters
        String input1 = "hello world";
        String expected1 = "HELLO WORLD";
        assertEquals(expected1, CaseConverter.swapCase(input1));

        // Test case with only upper-case characters
        String input2 = "HELLO WORLD";
        String expected2 = "hello world";
        assertEquals(expected2, CaseConverter.swapCase(input2));

        // Test case with mixed characters
        String input3 = "HeLLo WoRLD";
        String expected3 = "hEllO wOrld";
        assertEquals(expected3, CaseConverter.swapCase(input3));

    }
}
