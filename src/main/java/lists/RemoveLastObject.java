package lists;


import java.util.ArrayList;

public class RemoveLastObject {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        // Display the ArrayList before removal
        System.out.println("ArrayList before removing the last object: " + list);

        // Check if the ArrayList is not empty
        if (!list.isEmpty()) {
            // Remove the last object from the ArrayList
            String removedObject = list.remove(list.size() - 1);

            // Display the removed object
            System.out.println("Removed object: " + removedObject);
        } else {
            // If the ArrayList is empty, display a message
            System.out.println("ArrayList is empty. No objects to remove.");
        }

        // Display the ArrayList after removal
        System.out.println("ArrayList after removing the last object: " + list);
    }
}
