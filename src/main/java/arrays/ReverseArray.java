package arrays;


public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array

        System.out.println("Original array:");
        printArray(array);

        // Reverse the array
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        System.out.println("\nReversed array:");
        printArray(array);
    }

    // Function to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
