package lambdas;


import java.util.List;

public class SumOfSquares {

    public int sumOfSquaresOfPositiveNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0) // Filter out positive numbers
                .mapToInt(n -> n * n) // Square each positive number
                .sum(); // Calculate the sum
    }
}
