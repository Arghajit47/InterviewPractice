package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatchingInArray {
    public static List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].contains(words[j])){
                    if (!list.contains(words[j])){
                        list.add(words[j]);
                    }
                } else if (words[j].contains(words[i])){
                    if (!list.contains(words[i])){
                        list.add(words[i]);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));

    }
}
