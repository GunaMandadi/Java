package maps;


import java.util.HashMap;

public class CharacterCounter {

    public static void main(String[] args) {
        String input = "test string";
        printCharacterCounts(input);
    }

    public static void printCharacterCounts(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();


        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.print("Output: ");
        for (char c : charCountMap.keySet()) {
            System.out.print(c + "-" + charCountMap.get(c) + ", ");
        }
        System.out.println();
    }
}
