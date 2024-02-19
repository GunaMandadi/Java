package exceptionstest;


import exceptions.StringToIntConverter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringToIntConverterTest {

    @Test
    public void testConvertToInt_ValidInput() {
        assertEquals(23, StringToIntConverter.convertToInt("23"));
    }

    @Test
    public void testConvertToInt_DecimalInput() {
        try {
            StringToIntConverter.convertToInt("45.67");
        } catch (IllegalArgumentException e) {
            assertEquals("Input string cannot be converted to an integer", e.getMessage());
        }
    }

    @Test
    public void testConvertToInt_NonNumericInput() {
        try {
            StringToIntConverter.convertToInt("test");
        } catch (IllegalArgumentException e) {
            assertEquals("Input string cannot be converted to an integer", e.getMessage());
        }
    }

    @Test
    public void testConvertToInt_NumericWithNonDigitInput() {
        try {
            StringToIntConverter.convertToInt("123f");
        } catch (IllegalArgumentException e) {
            assertEquals("Input string cannot be converted to an integer", e.getMessage());
        }
    }
}
