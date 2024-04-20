package LeetCode;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        int[] set = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                set[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(set));
    }

    public static void moveZeroesII(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                if (i != index){
                    nums[i] = 0;
                }
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};    // [3,2,8,0,0]
        moveZeroesII(nums);
    }
}
