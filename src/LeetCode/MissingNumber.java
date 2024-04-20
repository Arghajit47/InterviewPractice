package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int num = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n+1; i++) {
            map.put(i, 0);
        }
        System.out.println(map);
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) - 1);
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if(integerIntegerEntry.getValue() == 0){
                num = integerIntegerEntry.getKey();
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,0,1};
        System.out.println(missingNumber(nums));
    }
}
