package arrays;




public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 5, 30};

        int[] minMax = FindMinMax.findMinMax(arr);
        int min = minMax[0];
        int max = minMax[1];

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}


