package hashsettest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExampleTest {

    @Test
    public void testHashSetIteration() {
        // Create a HashSet to store strings
        HashSet<String> stringSet = new HashSet<>();

        // Add 4 strings to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Mango");

        // Expected result
        String[] expectedStrings = {"Apple", "Banana", "Orange", "Mango"};
        StringBuilder expectedOutput = new StringBuilder();
        for (String s : expectedStrings) {
            expectedOutput.append(s).append("\n");
        }

        // Iterate HashSet using Iterator
        StringBuilder actualOutputIterator = new StringBuilder();
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            actualOutputIterator.append(iterator.next()).append("\n");
        }
        assertEquals(expectedOutput.toString(), actualOutputIterator.toString());

        // Iterate HashSet using for loop
        StringBuilder actualOutputForLoop = new StringBuilder();
        for (String element : stringSet) {
            actualOutputForLoop.append(element).append("\n");
        }
        assertEquals(expectedOutput.toString(), actualOutputForLoop.toString());

        // Iterate HashSet using enhanced for loop (Java 8+)
        StringBuilder actualOutputEnhancedForLoop = new StringBuilder();
        stringSet.forEach(s -> actualOutputEnhancedForLoop.append(s).append("\n"));
        assertEquals(expectedOutput.toString(), actualOutputEnhancedForLoop.toString());
    }
}

