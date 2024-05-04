package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(convert(nums)));
        list.add(target);
        Collections.sort(list);
        return list.indexOf(target);
    }

    public static Integer[] convert(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(searchInsert(nums, 5));
    }

}
