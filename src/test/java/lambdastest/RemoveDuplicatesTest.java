package lambdastest;


import lambdas.RemoveDuplicates;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 8, 9, 9);
        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); // Expected result without duplicates

        List<Integer> result = removeDuplicates.removeDuplicates(input);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testRemoveDuplicates_NoDuplicates() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5); // No duplicates in the input list

        List<Integer> result = removeDuplicates.removeDuplicates(input);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testRemoveDuplicates_EmptyList() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        List<Integer> input = Arrays.asList();
        List<Integer> expectedResult = Arrays.asList(); // Empty list

        List<Integer> result = removeDuplicates.removeDuplicates(input);

        assertEquals(expectedResult, result);
    }
}
