package arraystest;


import arrays.ArrayRotation;
import org.junit.Test;
        import static org.junit.Assert.assertArrayEquals;

public class ArrayRotationTest {

    @Test
    public void testRotateLeft() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;
        ArrayRotation.rotateLeft(arr, x);
        int[] expected = {3, 4, 5, 6, 7, 1, 2};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testRotateLeftWithZeroShift() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 0;
        ArrayRotation.rotateLeft(arr, x);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected, arr);
    }

    }

