package LeetCode;

import java.util.Arrays;

public class LargestNumberTwiceofOthers {
    public static int dominantIndex(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int max = nums[nums.length-1];
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]*2 > max) {
                return -1;
            }
        }
        return 1;
    }
}
