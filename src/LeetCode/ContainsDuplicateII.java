package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j] && j - i <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean newCode(int[] nums, int k){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            // Maintain the window size of k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));
        System.out.println(newCode(nums, k));
    }
}
