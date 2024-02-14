package hashmaptest;


import static org.junit.Assert.*;

import hashmap.TwoSum;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] expected = {3, 5};
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
}
