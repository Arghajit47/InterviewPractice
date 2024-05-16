package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LuckyIntegerInArray {
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for (int val: arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == integerIntegerEntry.getKey()) {
                if (max < integerIntegerEntry.getValue()){
                    max = integerIntegerEntry.getValue();
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4};
        System.out.println(findLucky(arr));
    }
}
