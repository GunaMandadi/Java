package arrays;


public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;

        System.out.println("Original array:");
        printArray(arr);

        rotateLeft(arr, x);

        System.out.println("\nArray after rotating left by " + x + " positions:");
        printArray(arr);
    }


    public static void rotateLeft(int[] arr, int x) {
        int n = arr.length;
        x %= n;
        reverseArray(arr, 0, x - 1);
        reverseArray(arr, x, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            arr[start] ^= arr[end];
            arr[end] ^= arr[start];
            arr[start] ^= arr[end];
            start++;
            end--;
        }
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
