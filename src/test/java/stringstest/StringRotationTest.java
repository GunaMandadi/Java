package stringstest;


import org.junit.Test;
import strings.StringRotation;

import static org.junit.Assert.*;

public class StringRotationTest {

    @Test
    public void testIsRotation() {
        // Test case
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";

        // Call the method to get actual output
        boolean actualOutput = StringRotation.isRotation(s1, s2);

        // Assertion
        assertTrue(actualOutput);
    }
}
