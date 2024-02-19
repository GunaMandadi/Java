package lambdastest;


import lambdas.GroupByLength;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class GroupByLengthTest {

    @Test
    public void testGroupStringsByLength() {
        GroupByLength groupByLength = new GroupByLength();

        List<String> input = Arrays.asList("cat", "dog", "lion", "elephant", "ant");
        Map<Integer, List<String>> expectedResult = Map.of(
                3, Arrays.asList("cat", "dog"),
                4, Arrays.asList("lion", "ant"),
                8, Arrays.asList("elephant")
        );

        Map<Integer, List<String>> result = groupByLength.groupStringsByLength(input);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testGroupStringsByLength_EmptyList() {
        GroupByLength groupByLength = new GroupByLength();

        List<String> input = Arrays.asList();
        Map<Integer, List<String>> expectedResult = Map.of();

        Map<Integer, List<String>> result = groupByLength.groupStringsByLength(input);

        assertEquals(expectedResult, result);
    }
}
