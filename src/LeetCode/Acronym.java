package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Acronym {
    public static boolean isAcronym(String[] words, String s){
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        int i = 0, j = 0;

        while(i < list.size() && j < s.length()) {
            if(list.get(i++).charAt(0) != s.charAt(j++))
                return false;
        }

        return i == list.size() && j == s.length();
    }

    public static void main(String[] args) {
        String[] words = {"alice","bob","charlie"};
        String s = "abc";
        String[] words1 = {"an","apple"};
        String a = "a";
        String[] words2 = {"never","gonna","give","up","on","you"};
        String b = "ngguoy";
        String[] words3 = {"fear", "for", "missing", "out"};
        String c = "gaal";
        System.out.println(isAcronym(words, s));
        System.out.println(isAcronym(words1, a));
        System.out.println(isAcronym(words2, b));
        System.out.println(isAcronym(words3, c));
    }
}
