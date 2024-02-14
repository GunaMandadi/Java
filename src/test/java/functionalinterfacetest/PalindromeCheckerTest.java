package functionalinterfacetest;


// PalindromeCheckerTest.java
import functionalinterface.PalindromeChecker;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        // Test cases for palindrome numbers
        assertTrue(PalindromeChecker.isPalindrome(121));
        assertTrue(PalindromeChecker.isPalindrome(12321));
        assertTrue(PalindromeChecker.isPalindrome(1234321));

        // Test cases for non-palindrome numbers
        assertFalse(PalindromeChecker.isPalindrome(123));
        assertFalse(PalindromeChecker.isPalindrome(1234));
        assertFalse(PalindromeChecker.isPalindrome(123456));

    }
}
