package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongPressedLetters {
    public static boolean isLongPressedName(String name, String typed) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: name.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (char c: typed.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)-1);
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            if (characterIntegerEntry.getValue() > 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isLongPressedName("aleex", "allex"));
    }
}
