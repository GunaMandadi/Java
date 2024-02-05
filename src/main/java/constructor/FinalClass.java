package constructor;

public class FinalClass {
    public static void main(String[] args) {
        // Creating an instance of FinalClass
        FinalClass finalObj = new FinalClass();

        // Accessing finalMethod within the same package
        finalObj.finalMethod(); // This will cause a compilation error due to access restrictions
    }

    // Final method accessible only within the same package
    final void finalMethod() {
        // Final variable
        int finalVariable = 10;
        System.out.println("Final method called. Value of finalVariable: " + finalVariable);
    }
}


