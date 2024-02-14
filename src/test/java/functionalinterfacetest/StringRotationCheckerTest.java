package functionalinterfacetest;

// StringRotationCheckerTest.java
import functionalinterface.StringRotationChecker;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringRotationCheckerTest {
    @Test
    public void testAreRotations() {
        // Test cases for rotation
        assertTrue(StringRotationChecker.areRotations("hello", "lohel"));
        assertTrue(StringRotationChecker.areRotations("abcde", "eabcd"));
        assertTrue(StringRotationChecker.areRotations("12345", "45123"));

        // Test cases for non-rotation
        assertFalse(StringRotationChecker.areRotations("hello", "world"));
        assertFalse(StringRotationChecker.areRotations("abcde", "edcba"));
        assertFalse(StringRotationChecker.areRotations("12345", "54321"));


    }
}

