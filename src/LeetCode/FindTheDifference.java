package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)-1);
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            if (characterIntegerEntry.getValue() == -1) {
                return characterIntegerEntry.getKey();
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
}
