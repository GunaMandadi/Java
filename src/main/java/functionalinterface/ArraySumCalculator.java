package functionalinterface;


// ArraySumCalculator.java
public class ArraySumCalculator {
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
