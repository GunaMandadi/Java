package arrays;


import static org.junit.Assert.assertArrayEquals;
        import org.junit.Test;

public class ReverseArrayTest {

    @Test
    public void testReverseArray() {
        // Input array
        int[] arr = {1, 2, 3, 4, 5};

        // Expected reversed array
        int[] expected = {5, 4, 3, 2, 1};

        // Reverse the array
        int[] reversed = ReverseArray.reverseArray(arr);

        // Assertion
        assertArrayEquals(expected, reversed);
    }

    @Test
    public void testReverseArrayEmpty() {
        // Input array
        int[] arr = {};

        // Expected result for empty array
        int[] expected = {};

        // Reverse the empty array
        int[] reversed = ReverseArray.reverseArray(arr);

        // Assertion for empty array
        assertArrayEquals(expected, reversed);
    }

}
