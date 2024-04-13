package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicateI(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > 0){
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateII(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for (int num : nums) {
            if (hashset.contains(num)){
                return true;
            }
            hashset.add(num);
        }
        return false;
    }

    public static boolean containsDuplicateIII(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-3,-4};
        System.out.println(containsDuplicateI(nums));
        System.out.println(containsDuplicateII(nums));
        System.out.println(containsDuplicateIII(nums));
    }
}
