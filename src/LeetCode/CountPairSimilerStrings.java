package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class CountPairSimilerStrings {

//    Example 1:
//
//    Input: words = ["aba","aabb","abcd","bac","aabc"]
//    Output: 2
//    Explanation: There are 2 pairs that satisfy the conditions:
//            - i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'.
//            - i = 3 and j = 4 : both words[3] and words[4] only consist of characters 'a', 'b', and 'c'.

    public static int similarPairs(String[] words) {
        int similarCount = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (areSimilar(words[i], words[j])){
                    similarCount++;
                }
            }
        }
        return similarCount;
    }

    public static boolean areSimilar(String word1, String word2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char ch: word1.toCharArray()){
            set1.add(ch);
        }
        
        for (char ch : word2.toCharArray()) {
            set2.add(ch);
        }
        
        if (set1.equals(set2)){
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        System.out.println(similarPairs(words));
    }
}
