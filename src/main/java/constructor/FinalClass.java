package constructor;

public class FinalClass {
    final int finalVariable = 10;

    void finalMethod() {
        System.out.println("Final method invoked");
    }

    public static void main(String[] args) {
        FinalClass finalObject = new FinalClass();
        System.out.println("Final variable value: " + finalObject.finalVariable);
        finalObject.finalMethod();
    }
}
