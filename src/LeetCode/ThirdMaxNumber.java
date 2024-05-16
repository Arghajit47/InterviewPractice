package LeetCode;

import java.util.*;

public class ThirdMaxNumber {
    public static int thirdMax(int[] nums) {
        Set<Integer> setNums = new HashSet<>();
        for (int val: nums) {
            setNums.add(val);
        }
        List<Integer> aList = new ArrayList<>();
        for (int x : setNums){
            aList.add(x);
        }
        Collections.sort(aList);
         if (aList.size() == 1) {
            return aList.get(0);
        } else if (aList.size() == 2) {
            return aList.get(aList.size()-1);
        } else {
             return aList.get(aList.size()-3);
         }
    }

    public static void main(String[] args) {
        int[] nums = {2,2,13,4,5};
        System.out.println(thirdMax(nums));
    }
}
