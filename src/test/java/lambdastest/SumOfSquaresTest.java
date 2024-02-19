package lambdastest;


import lambdas.SumOfSquares;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class SumOfSquaresTest {

    @Test
    public void testSumOfSquaresOfPositiveNumbers() {
        SumOfSquares sumOfSquares = new SumOfSquares();

        List<Integer> input = Arrays.asList(1, -2, 3, -4, 5);
        int expectedResult = 1 + 9 + 25; // 1^2 + 3^2 + 5^2 = 1 + 9 + 25 = 35

        int result = sumOfSquares.sumOfSquaresOfPositiveNumbers(input);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testSumOfSquaresOfPositiveNumbers_NoPositiveNumbers() {
        SumOfSquares sumOfSquares = new SumOfSquares();

        List<Integer> input = Arrays.asList(-1, -2, -3, -4);
        int expectedResult = 0; // No positive numbers in the list

        int result = sumOfSquares.sumOfSquaresOfPositiveNumbers(input);

        assertEquals(expectedResult, result);
    }
}
