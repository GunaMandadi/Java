package arrays;


public class MoveZeroes {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};

        System.out.println("Original array:");
        printArray(numbers);

        moveZeroesToEnd(numbers);

        System.out.println("\nArray after moving zeroes to the end:");
        printArray(numbers);
    }

    public static void moveZeroesToEnd(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
