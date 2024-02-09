package stringstest;


import org.junit.Test;
import strings.ReverseWords;

import static org.junit.Assert.*;

public class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        // Test case
        String inputSentence = "Java J2EE Reverse Me";
        String expectedOutput = "avaJ EE2J esreveR eM";

        // Call the method to get actual output
        String actualOutput = ReverseWords.reverseWords(inputSentence);

        // Assertion
        assertEquals(expectedOutput, actualOutput);
    }
}
