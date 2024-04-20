package LeetCode;

import java.util.HashMap;

public class UniqueCharacterInString {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return s.indexOf(ch);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
