package LeetCode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] shuffledArray = new int[nums.length];
        for (int i = 0; i < n; i++) {
            arr1[i] = nums[i];
        }
        for (int i = n; i < nums.length; i++) {
            arr2[i-n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            shuffledArray[i*2] = arr1[i];
            shuffledArray[i*2+1] = arr2[i];
        }
        return shuffledArray;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}
