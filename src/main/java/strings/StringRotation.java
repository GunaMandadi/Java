package strings;


public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        // Check if lengths are equal and not empty
        if (s1.length() != s2.length() || s1.length() == 0)
            return false;

        // Concatenate s1 with itself
        String concatenated = s1 + s1;

        // Check if s2 is a substring of the concatenated string
        return concatenated.contains(s2);
    }
}