package constructor;


public class MyClass {
    private static int myStaticVariable;

    public static int getMyStaticVariable() {
        return myStaticVariable;
    }

    public static void setMyStaticVariable(int value) {
        myStaticVariable = value;
    }

    public static void main(String[] args) {
        setMyStaticVariable(10);
        System.out.println("Value of static variable: " + getMyStaticVariable());
    }
}
