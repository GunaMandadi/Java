package arrays;


import org.junit.Test;
        import static org.junit.Assert.*;

public class ArraySearchTest {

    @Test
    public void testLinearSearch() {
        int[] arr = {2, 3, 5, 7, 11, 13, 17};
        int target = 7;
        int expectedIndex = 3;

        int resultIndex = ArraySearch.linearSearch(arr, target);

        assertEquals(expectedIndex, resultIndex);
    }

    @Test
    public void testLinearSearch_NotFound() {
        int[] arr = {2, 3, 5, 7, 11, 13, 17};
        int target = 8;

        int resultIndex = ArraySearch.linearSearch(arr, target);

        assertEquals(-1, resultIndex);
    }
}

