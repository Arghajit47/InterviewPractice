package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class MaxWordCountInSentence {
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String sentence : sentences){
            if (countWords(sentence) > max) {
                max = countWords(sentence);
            }
        }
        return max;
    }
    public static int countWords(String sentence) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, sentence.split(" "));
        return list.size();
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
