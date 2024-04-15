package LeetCode;

import java.util.Arrays;

public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        String str = s.substring(0,k);
        String reverse = rev(str);
        String[] arr = s.split(str);
        String newStr = reverse + arr[arr.length-1];
        return newStr;
    }

    public static String rev(String s) {
        StringBuilder sb = new StringBuilder(s);
        return String.valueOf(sb.reverse());
    }

    public static void main(String[] args) {
        String s = "abcd";
        int k =2;
        System.out.println(reverseStr(s,k));
    }
}
