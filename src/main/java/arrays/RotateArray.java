package arrays;


public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int x = 2; // Number of positions to rotate

        System.out.println("Original array:");
        printArray(arr);

        rotateLeft(arr, x);

        System.out.println("\nArray after rotating left by " + x + " positions:");
        printArray(arr);
    }

    // Function to rotate the array left by x positions
    public static void rotateLeft(int[] arr, int x) {
        int n = arr.length;
        x %= n; // Handle cases where x is greater than the length of the array
        reverseArray(arr, 0, x - 1);
        reverseArray(arr, x, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    // Function to reverse a portion of the array
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            arr[start] ^= arr[end];
            arr[end] ^= arr[start];
            arr[start] ^= arr[end];
            start++;
            end--;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
