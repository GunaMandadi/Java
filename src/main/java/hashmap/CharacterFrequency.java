package hashmap;


import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "test string";
        printCharacterFrequency(input);
    }

    public static void printCharacterFrequency(String input) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();

        // Counting character frequency
        for (char ch : input.toCharArray()) {
            if (charFrequency.containsKey(ch)) {
                charFrequency.put(ch, charFrequency.get(ch) + 1);
            } else {
                charFrequency.put(ch, 1);
            }
        }

        // Printing distinct characters and their frequencies
        for (char ch : charFrequency.keySet()) {
            System.out.println(ch + "-" + charFrequency.get(ch));
        }
    }
}
