package constructor;
public class MyClass {

    private static int staticVariable = 0;

    public static int getStaticVariable() {

        return staticVariable;
    }


    public static void main(String[] args) {


        int value = MyClass.getStaticVariable();
        System.out.println("Static Variable Value: " + value);
    }

}