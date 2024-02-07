package arrays;

public class ArraySearch {

    // Linear search method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target if found
            }
        }
        return -1; // If target is not found
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17};
        int target = 7;

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

