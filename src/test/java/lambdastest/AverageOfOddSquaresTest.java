package lambdastest;


import static org.junit.Assert.assertEquals;

import lambdas.AverageOfOddSquares;
import org.junit.Test;

public class AverageOfOddSquaresTest {

    @Test
    public void testAverageOfOddSquares() {
        int[] numbers = {1, 2, 3, 4, 5};
        double expectedAverage = ((1 * 1) + (3 * 3) + (5 * 5)) / 3.0;

        assertEquals(expectedAverage, AverageOfOddSquares.averageOfOddSquares(numbers), 0.001);
    }

    @Test
    public void testAverageOfOddSquares_EmptyArray() {
        int[] numbers = {};
        assertEquals(0, AverageOfOddSquares.averageOfOddSquares(numbers), 0.001);
    }

    @Test
    public void testAverageOfOddSquares_NoOddNumbers() {
        int[] numbers = {2, 4, 6, 8};
        assertEquals(0, AverageOfOddSquares.averageOfOddSquares(numbers), 0.001);
    }

    @Test
    public void testAverageOfOddSquares_AllOddNumbers() {
        int[] numbers = {1, 3, 5, 7};
        double expectedAverage = ((1 * 1) + (3 * 3) + (5 * 5) + (7 * 7)) / 4.0;

        assertEquals(expectedAverage, AverageOfOddSquares.averageOfOddSquares(numbers), 0.001);
    }
}
