package LeetCode;

import java.util.Arrays;

public class MaximumStringValueInArray {
    public static int solution(String[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (isNan(arr[i])){
                newArr[i] = Integer.parseInt(arr[i]);
            } else {
                newArr[i] = arr[i].length();
            }
        }
        Arrays.sort(newArr);
        return (newArr[newArr.length-1]);
    }


    public static boolean isNan(String str) {
        String regex = ".*[a-zA-Z].*";
        if (str.matches(regex)){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String[] strs = {"1alic3","bobsdfd","333","47","0000"};
        System.out.println(solution(strs));
    }
}
