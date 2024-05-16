package LeetCode;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i-1] + nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}
