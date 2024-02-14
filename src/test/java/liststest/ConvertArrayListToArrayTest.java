
package liststest;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ConvertArrayListToArrayTest {

    @Test
    public void testArrayListToArrayConversion() {
        // Creating an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Converting ArrayList to Array
        String[] array = arrayList.toArray(new String[arrayList.size()]);

        // Expected array
        String[] expectedArray = {"Apple", "Banana", "Orange"};

        // Asserting equality
        assertArrayEquals(expectedArray, array);
    }
}

