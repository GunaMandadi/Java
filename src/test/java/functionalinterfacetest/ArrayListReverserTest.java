package functionalinterfacetest;

import functionalinterface.ArrayListReverser;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

// ArrayListReverserTest.java
public class ArrayListReverserTest {
    @Test
    public void testReverse() {
        // Test case with integer elements
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        ArrayListReverser.reverse(list1);
        assertEquals("[4, 3, 2, 1]", list1.toString());

        // Test case with String elements
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("orange");
        list2.add("grape");
        ArrayListReverser.reverse(list2);
        assertEquals("[grape, orange, banana, apple]", list2.toString());


    }
}

