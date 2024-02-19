package exceptions;


public class StringToIntConverter {

    public static int convertToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input string cannot be converted to an integer");
        }
    }
}
