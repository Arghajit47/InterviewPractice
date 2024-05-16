package LeetCode;

import java.util.Arrays;

public class MaxProductOfTwoElementsInArray {
    public static int maxProduct(int[] nums) {
        int max = (nums[0]-1)*(nums[1]-1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j && (nums[i]-1)*(nums[j]-1) > max){
                    max = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return max;
    }

    public static int maxProductNew(int[] nums){
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(maxProduct(arr));
        System.out.println(maxProductNew(arr));
    }
}
