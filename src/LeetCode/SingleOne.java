package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleOne {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for(int val : nums){
            list.put(val, list.getOrDefault(val, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : list.entrySet()) {
            if (integerIntegerEntry.getValue().equals(1)){
                return integerIntegerEntry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,4,89,4,4};
        System.out.println(singleNumber(nums));
    }
}
