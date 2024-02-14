package functionalinterfacetest;

import functionalinterface.CharacterRepeater;
import org.junit.Test;
import static org.junit.Assert.*;


public class CharacterRepeaterTest {
    @Test
    public void testPrintRepeatedCharacters() {
        // Test case with repeated characters
        String str1 = "programming";
        System.out.println("Testing string: " + str1);
        CharacterRepeater.printRepeatedCharacters(str1);
        System.out.println();

        // Test case with no repeated characters
        String str2 = "abcdef";
        System.out.println("Testing string: " + str2);
        CharacterRepeater.printRepeatedCharacters(str2);
        System.out.println();



    }
}

