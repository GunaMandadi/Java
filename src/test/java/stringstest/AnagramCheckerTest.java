package stringstest;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import strings.AnagramChecker;


public class AnagramCheckerTest {

    @Test
    public void testAreAnagrams(){
        assertTrue(AnagramChecker.areAnagrams("listen", "silent"));

        assertFalse(AnagramChecker.areAnagrams("hello", "world"));

        assertTrue(AnagramChecker.areAnagrams("Debit", "Card"));

        assertFalse(AnagramChecker.areAnagrams("Jack", "Rose"));

    }

}
