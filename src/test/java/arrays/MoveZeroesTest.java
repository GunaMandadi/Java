package arrays;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTest {

    @Test
    public void testMoveZeroes(){
        int[] nums = {0,1,0,3,0,4};
        MoveZeroes.moveZeroes(nums);
        int[] expected = {1,3,4,0,0,0};
        assertArrayEquals(expected, nums);
    }





}



