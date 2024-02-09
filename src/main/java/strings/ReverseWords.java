package strings;


public class ReverseWords {
    public static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        // Reverse each word and append to the reversed sentence
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        // Remove the trailing space and return the reversed sentence
        return reversedSentence.toString().trim();
    }
}