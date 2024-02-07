package arrays;

import java.util.Arrays;

public class MoveZeroes{

    public static void moveZeroes(int[] nums) {
        int count = 0;

        for(int i = 0;  i< nums.length; i++){
            if (nums[i] != 0){
                nums[count++] = nums[i];

            }
        }
        while (count< nums.length) {
            nums[count++] = 0;

        }

    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,8,0,9};
        moveZeroes(nums);
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(nums));
    }
}

