package lambdas;


public class AverageOfOddSquares {

    public static double averageOfOddSquares(int[] numbers) {
        int sum = 0;
        int count = 0;

        for (int num : numbers) {
            if (num % 2 != 0) { // Check if the number is odd
                sum += num * num; // Square the odd number and add it to the sum
                count++; // Increment count for calculating average later
            }
        }

        if (count == 0) {
            return 0; // Avoid division by zero
        }

        return (double) sum / count; // Calculate average
    }
}
