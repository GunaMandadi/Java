package lambdastest;

import lambdas.NumberProcessor;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class NumberProcessorTest {

    @Test
    public void testFilterAndDouble() {
        NumberProcessor processor = new NumberProcessor();

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expectedResult = Arrays.asList(2, 6, 10);

        List<Integer> result = processor.filterAndDouble(input);

        assertEquals(expectedResult, result);

    }

}

