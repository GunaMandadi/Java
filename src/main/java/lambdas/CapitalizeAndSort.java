package lambdas;


import java.util.Arrays;

public class CapitalizeAndSort {

    public static String[] capitalizeAndSort(String[] strings) {
        // Capitalize the first letter of each string
        for (int i = 0; i < strings.length; i++) {
            strings[i] = capitalizeFirstLetter(strings[i]);
        }

        // Sort the strings alphabetically
        Arrays.sort(strings);

        return strings;
    }

    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
