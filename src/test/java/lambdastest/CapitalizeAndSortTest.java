package lambdastest;


import lambdas.CapitalizeAndSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class CapitalizeAndSortTest {

    @Test
    public void testCapitalizeAndSort() {
        String[] input = {"apple", "banana", "cherry", "date"};
        String[] expected = {"Apple", "Banana", "Cherry", "Date"};

        String[] result = CapitalizeAndSort.capitalizeAndSort(input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testCapitalizeAndSortWithEmptyString() {
        String[] input = {""};
        String[] expected = {""};

        String[] result = CapitalizeAndSort.capitalizeAndSort(input);

        assertArrayEquals(expected, result);

    }
}
