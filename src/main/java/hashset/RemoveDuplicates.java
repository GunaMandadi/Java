package hashset;



import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "test string";
        String result = removeDuplicates(input);
        System.out.println("Resulting string after removing duplicates: " + result);
    }

    public static String removeDuplicates(String input) {
        // Use LinkedHashSet to maintain insertion order and remove duplicates
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        // Iterate through the string, adding characters to the set
        for (char ch : input.toCharArray()) {
            charSet.add(ch);
        }

        // Build the resulting string from the set
        StringBuilder sb = new StringBuilder();
        for (char ch : charSet) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
