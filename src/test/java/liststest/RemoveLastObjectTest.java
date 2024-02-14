package liststest;



import static org.junit.Assert.assertEquals;

import lists.TraverseArrayList;
import org.junit.Test;
        import java.io.ByteArrayOutputStream;
        import java.io.PrintStream;
        import java.util.ArrayList;

public class RemoveLastObjectTest {

    @Test
    public void testTraverseWithForLoop() {
        // Redirect System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create test list
        ArrayList<String> testList = new ArrayList<>();
        testList.add("One");
        testList.add("Two");
        testList.add("Three");

        // Call the method to be tested
        TraverseArrayList.traverseWithForLoop(testList);

        // Restore System.out
        System.setOut(System.out);

        // Check if the output matches the expected output
        String expectedOutput = "Traversing with regular for loop:\nOne\nTwo\nThree\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}