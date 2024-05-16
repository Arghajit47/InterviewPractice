package LeetCode;

import java.util.*;

public class SetMisMatch {
    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = -1;
        int n = nums.length;
        int actualSum = 0;

        for (int num : nums) {
            if (!set.add(num)) {
                duplicate = num;
            }
            actualSum += num;
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - (actualSum - duplicate);
        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
