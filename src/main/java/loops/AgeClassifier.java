package loops;
import java.util.Scanner;

public class AgeClassifier {

    public static void printAgeCategory(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        printAgeCategory(age);

        scanner.close();
    }
}

