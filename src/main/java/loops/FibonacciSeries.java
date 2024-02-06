package loops;


import java.util.Scanner;

public class FibonacciSeries {

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + N + " term:");
        printFibonacciSeries(N);

        scanner.close();
    }
}
