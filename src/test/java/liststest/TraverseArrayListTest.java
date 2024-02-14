package liststest;


import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import lists.TraverseArrayList;
import org.junit.Before;
import org.junit.Test;

public class TraverseArrayListTest {

    private ArrayList<String> testList;

    @Before
    public void setUp() {
        testList = new ArrayList<>();
        testList.add("One");
        testList.add("Two");
        testList.add("Three");
    }

    @Test
    public void testTraverseWithForLoop() {
        System.out.println("Test Traversing with regular for loop:");
        TraverseArrayList.traverseWithForLoop(testList);
        // You can add assertions here if needed
    }

    @Test
    public void testTraverseWithEnhancedForLoop() {
        System.out.println("Test Traversing with enhanced for loop:");
        TraverseArrayList.traverseWithEnhancedForLoop(testList);
        // You can add assertions here if needed
    }
}


