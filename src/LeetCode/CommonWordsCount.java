package LeetCode;

import java.util.*;

public class CommonWordsCount {

    public static int solution(String[] words1, String[] words2) {
        int count = 0;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words1));
        list.addAll(Arrays.asList(words2));
        HashMap<String, Integer> hashmap = new HashMap<>();
        for (String val : list) {
            hashmap.put(val, hashmap.getOrDefault(val, 0) + 1);
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : hashmap.entrySet()) {
            if (stringIntegerEntry.getValue() == 2) {
                count++;
            }
        }
        return count;
    }

    public static int sol(String[] words1, String[] words2) {
        int count =0;
        HashMap<String, Integer> hashmap = new HashMap<>();
        for (String word : words1) {
            hashmap.put(word, hashmap.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            if (hashmap.containsKey(word) && hashmap.get(word) < 2) {
                hashmap.put(word, hashmap.getOrDefault(word, 0) - 1);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : hashmap.entrySet()) {
            if (stringIntegerEntry.getValue() == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words1 = {"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = {"amazing", "leetcode", "is"};
        System.out.println(sol(words1, words2));
    }
}
