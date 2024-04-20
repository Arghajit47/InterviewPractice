package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        char[] pat = pattern.toCharArray();
        if (pat.length != str.length) {
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for (int k = 0; k < str.length; k++) {
            char patternChar = pat[k];
            String word = str[k];
            if (!map1.containsKey(patternChar) && !map2.containsKey(word)) {
                map1.put(patternChar, word);
                map2.put(word, patternChar);
            } else if (!word.equals(map1.get(patternChar)) || pat[k] != map2.get(word)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String p = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(p, s));
    }
}
