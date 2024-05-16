package LeetCode;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] > nums[j]){
                    count++;
                }
            }
            counts[i] = count;
        }
        return counts;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
