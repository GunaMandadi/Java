package arrays;




        import org.junit.Test;
        import static org.junit.Assert.assertArrayEquals;

public class FindMinMaxTest {

    @Test
    public void testFindMinMax() {
        int[] arr = {10, 15, 20, 5, 30};
        int[] expectedMinMax = {5, 30};

        int[] actualMinMax = FindMinMax.findMinMax(arr);

        assertArrayEquals(expectedMinMax, actualMinMax);
    }
}

