package arrays;


import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] array = {12, 5, 3, 7, 2, 9}; // Example array

        System.out.println("Original array:");
        printArray(array);

        Arrays.sort(array); // Sort the array

        System.out.println("\nSorted array:");
        printArray(array);
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

