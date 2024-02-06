package constructor;

public class FinalClass {
    public static void main(String[] args) {

        FinalClass finalObj = new FinalClass();


        finalObj.finalMethod();
    }

    final void finalMethod() {

        int finalVariable = 10;
        System.out.println("Final method called. Value of finalVariable: " + finalVariable);
    }
}


