package Lists;


import java.util.ArrayList;

public class ArrayListTraversal {

    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");

        // Traversing the ArrayList using a traditional for loop
        System.out.println("Traversing ArrayList using a traditional for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        // Traversing the ArrayList using an enhanced for loop
        System.out.println("\nTraversing ArrayList using an enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}

