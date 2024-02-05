package Lists;


import java.util.ArrayList;

public class RemoveLastObject {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");

        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
            System.out.println("Last element removed successfully.");
        } else {
            System.out.println("The ArrayList is already empty.");
        }

        System.out.println("ArrayList after removing the last element: " + stringList);
    }
}
