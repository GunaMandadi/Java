package constructor;
public class MyClass {
    // Static variable
    private static int staticVariable = 0;

    // Static method to return the static variable
    public static int getStaticVariable() {

        return staticVariable;
    }


    public static void main(String[] args) {


        int value = MyClass.getStaticVariable();
        System.out.println("Static Variable Value: " + value);
    }

}