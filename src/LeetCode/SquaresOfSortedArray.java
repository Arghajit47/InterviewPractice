package LeetCode;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] squ = new int[nums.length];
        for (int i = 0; i < squ.length; i++) {
            squ[i] = nums[i]*nums[i];
        }
        Arrays.sort(squ);
        return squ;
    }
}
