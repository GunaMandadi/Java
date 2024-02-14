package hashsettest;


import static org.junit.Assert.*;

import hashset.RemoveDuplicates;
import org.junit.Test;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        String input = "test string";
        String expectedOutput = "tes ring";
        String result = RemoveDuplicates.removeDuplicates(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testRemoveDuplicatesWithDuplicates() {
        String input = "hello";
        String expectedOutput = "helo";
        String result = RemoveDuplicates.removeDuplicates(input);
        assertEquals(expectedOutput, result);
    }
}