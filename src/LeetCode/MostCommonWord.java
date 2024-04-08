package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> hashMap = new HashMap<>();
        String mostCommonWord = "";
        int maxCount = 0;
        String[] arr = getWords(paragraph);
        for (String ele : arr) {
            if (!bannedSet.contains(ele)){
                hashMap.put(ele, hashMap.getOrDefault(ele, 0) + 1);
                if (hashMap.get(ele) > maxCount) {
                    maxCount = hashMap.get(ele);
                    mostCommonWord = ele;
                }
            }
        }
        return mostCommonWord;
    }

    public static String[] getWords(String paragraph) {
        String cleanString = paragraph.toLowerCase();
        return cleanString.split("[\\p{Punct}\\s]+");    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
}
