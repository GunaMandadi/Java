package sets;


import java.util.HashSet;
        import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String fruit : stringSet) {
            System.out.println(fruit);
        }
    }
}
