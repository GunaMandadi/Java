package arrays;

public class ArrayRotation {

    public static void rotateLeft(int[] arr, int x) {
        int n = arr.length;
        x = x % n;
        reverse(arr, 0, x - 1);
        reverse(arr, x, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;
        rotateLeft(arr, x);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
