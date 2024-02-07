package arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }
}


