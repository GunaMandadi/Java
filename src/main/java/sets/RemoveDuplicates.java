package sets;


import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String inputString = "hello world";
        String result = removeDuplicates(inputString);
        System.out.println("Resulting string after removing duplicates: " + result);
    }

    public static String removeDuplicates(String inputString) {
        return new LinkedHashSet<>(Arrays.asList(inputString.split(""))).toString().replaceAll("[^a-zA-Z]", "");
    }
}
