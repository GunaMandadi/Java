package functionalinterface;

import java.util.HashMap;
import java.util.Map;

// CharacterRepeater.java
public class CharacterRepeater {
    public static void printRepeatedCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character in the string
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print repeated characters
        System.out.println("Repeated characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}

