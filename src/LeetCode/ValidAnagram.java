package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] str1 = s.toLowerCase().toCharArray();
        char[] str2 = t.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    public static void main(String[] args) {
        String s = "Anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
