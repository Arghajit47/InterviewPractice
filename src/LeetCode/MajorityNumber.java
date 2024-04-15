package LeetCode;

import java.util.HashMap;

public class MajorityNumber {
    public static int majorityElement(int[] nums) {
        int length = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int val : nums) {
            hashMap.put(val, hashMap.getOrDefault(val, 0)+1);
        }
        for (int val : nums) {
            if (hashMap.get(val) > length/2) {
                return val;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
