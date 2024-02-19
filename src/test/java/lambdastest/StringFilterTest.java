package lambdastest;

import lambdas.StringFilter;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class StringFilterTest {

    @Test
    public void testFilterStringsStartingWithA() {
        StringFilter stringFilter = new StringFilter();

        List<String> input = Arrays.asList("Apple", "Banana", "Avocado", "Orange", "Grapes");
        List<String> expectedResult = Arrays.asList("Apple", "Avocado");

        List<String> result = stringFilter.filterStringsStartingWithA(input, s -> s.startsWith("A"));

        assertEquals(expectedResult, result);

    }
}

