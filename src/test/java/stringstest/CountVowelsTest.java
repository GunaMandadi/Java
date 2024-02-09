package stringstest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import strings.CountVowels;

public class CountVowelsTest {
    @Test
    public void testCountVowels(){
        assertEquals(5, CountVowels.countVowels("AEIOU"));

        assertEquals(0, CountVowels.countVowels("XYJ") );

        assertEquals(3, CountVowels.countVowels("AEIkfhndnb"));

        assertEquals(5, "AbcDEIOUjfngrnshbdf");
    }
}
