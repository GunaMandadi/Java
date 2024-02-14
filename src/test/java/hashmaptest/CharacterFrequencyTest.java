package hashmaptest;


import static org.junit.Assert.*;

import hashmap.CharacterFrequency;
import org.junit.Test;
        import java.io.ByteArrayOutputStream;
        import java.io.PrintStream;

public class CharacterFrequencyTest {

    @Test
    public void testPrintCharacterFrequency() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CharacterFrequency.printCharacterFrequency("test string");

        assertEquals("t-3\n" +
                "e-1\n" +
                "s-2\n" +
                "r-1\n" +
                "i-1\n" +
                "n-1\n" +
                "g-1\n", outContent.toString());
    }
}
