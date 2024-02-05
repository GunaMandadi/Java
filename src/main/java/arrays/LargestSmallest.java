package arrays;


public class LargestSmallest {

    public static void main(String[] args) {
        int[] array = {10, 5, 7, 20, 15, 3}; // Example array

        int largest = array[0];
        int smallest = array[0];

        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest number in the array: " + largest);
        System.out.println("Smallest number in the array: " + smallest);
    }
}
