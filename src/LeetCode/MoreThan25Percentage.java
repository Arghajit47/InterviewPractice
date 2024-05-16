package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MoreThan25Percentage {
    public static int findSpecialInteger(int[] arr) {
        int maxCount = (int) Math.ceil(arr.length * 0.25);
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() >= maxCount){
                answer = integerIntegerEntry.getKey();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,9,60};
        System.out.println(findSpecialInteger(arr));
    }
}
