package Lists;


import java.util.ArrayList;

public class ArrayListTraversal {

    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");


        System.out.println("Traversing ArrayList using a traditional for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }


        System.out.println("\nTraversing ArrayList using an enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}

