package strings;

public class VowelCounter {

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase to handle both uppercase and lowercase vowels

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int vowelCount = countVowels(inputString);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
