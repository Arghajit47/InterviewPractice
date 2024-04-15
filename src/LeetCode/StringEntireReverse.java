package LeetCode;

import java.util.Arrays;

public class StringEntireReverse {
    public static String reverseWordsEntirely(String s) {
        StringBuilder sb = new StringBuilder(s);
        return String.valueOf(sb.reverse());
    }

    public static String reverseWordsByString(String s) {
        String reverseString = "";
        String[] words = s.split("\\s+");
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            if (i == 0){
                reverseString = reverseString + reverse(words[i]);
            } else {
                reverseString = reverseString + " " + reverse(words[i]);
            }
        }
        return reverseString;
    }
    public static String reverse(String s) {
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        return rev;
    }

    public static void main(String[] args) {
        String s= "Let's take LeetCode contest";
        System.out.println(reverseWordsEntirely(s));
        System.out.println(reverseWordsByString(s));
    }
}
