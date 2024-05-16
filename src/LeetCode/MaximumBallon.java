package LeetCode;

import java.util.HashMap;

public class MaximumBallon {
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int minCount = Math.min(map.getOrDefault('b', 0),
                Math.min(map.getOrDefault('a', 0),
                        Math.min(map.getOrDefault('l', 0)/2,
                                Math.min(map.getOrDefault( 'o', 0)/2,
                                        map.getOrDefault('n', 0)))));

        return minCount;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("oonbalxballpoon"));
    }
}
