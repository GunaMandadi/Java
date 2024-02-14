package lists;


import java.util.ArrayList;

public class TraverseArrayList {
    public static void traverseWithForLoop(ArrayList<String> list) {
        System.out.println("Traversing with regular for loop:");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void traverseWithEnhancedForLoop(ArrayList<String> list) {
        System.out.println("Traversing with enhanced for loop:");
        for (String element : list) {
            System.out.println(element);
        }
    }

}
