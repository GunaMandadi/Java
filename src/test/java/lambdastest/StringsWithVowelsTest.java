package lambdastest;


import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import lambdas.StringsWithVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringsWithVowelsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testPrintStringsWithVowels() {
        String[] strings = {"hello", "world", "Java", "programming", "is", "fun"};
        String expectedOutput = "String: hello, Number of Vowels: 2\n" +
                "String: Java, Number of Vowels: 2\n" +
                "String: is, Number of Vowels: 1\n" +
                "String: fun, Number of Vowels: 1\n";

        StringsWithVowels.printStringsWithVowels(strings);
        assertEquals(expectedOutput, outContent.toString());
    }
}
