// You are given a 0-indexed array of strings words and a character x.
// Return an array of indices representing the words that contain the character x.
// Note that the returned array may be in any order.
// Example 1: Input: words = ["leet","code"], x = "e" Output: [0,1]
// Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.


package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0 ; i < words.length; i++){
            String java = words[i];
            if (java.indexOf(x) != -1){
                list.add(i);
            }
        }
        return list;
    }
        public static void main(String[] args) {
            String[] words = {"Leet", "Code"};
            char x = 'e';
            System.out.println(findWordsContaining(words,x));
    }
}
