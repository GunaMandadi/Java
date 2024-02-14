package functionalinterface;


import java.util.HashSet;
import java.util.Set;

// RepeatedDigitsFinder.java
public class RepeatedDigitsFinder {
    public static Set<Integer> findRepeatedDigits(int number) {
        Set<Integer> repeatedDigits = new HashSet<>();
        Set<Integer> uniqueDigits = new HashSet<>();

        while (number > 0) {
            int digit = number % 10;
            if (!uniqueDigits.add(digit)) { // If the digit is already in uniqueDigits set, it's repeated
                repeatedDigits.add(digit);
            }
            number /= 10;
        }

        return repeatedDigits;
    }
}
