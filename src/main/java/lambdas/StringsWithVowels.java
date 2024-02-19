package lambdas;


public class StringsWithVowels {

    public static void printStringsWithVowels(String[] strings) {
        for (String str : strings) {
            if (containsVowels(str)) {
                int vowelCount = countVowels(str);
                System.out.println("String: " + str + ", Number of Vowels: " + vowelCount);
            }
        }
    }

    private static boolean containsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    private static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
