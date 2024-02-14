package hashset;


import java.util.HashSet;
        import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store strings
        HashSet<String> stringSet = new HashSet<>();

        // Add 4 strings to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Mango");

        // Iterate HashSet using Iterator
        System.out.println("Iterating HashSet using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Iterate HashSet using for loop
        System.out.println("\nIterating HashSet using for loop:");
        for (String element : stringSet) {
            System.out.println(element);
        }

        // Iterate HashSet using enhanced for loop (Java 8+)
        System.out.println("\nIterating HashSet using enhanced for loop:");
        stringSet.forEach(System.out::println);
    }
}
