package lambdas;


@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class MathOperationLambda {
    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Testing the addition operation
        int result = addition.operate(5, 3);
        System.out.println("Result of addition: " + result);
    }
}
