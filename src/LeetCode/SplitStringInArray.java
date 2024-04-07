package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class SplitStringInArray {
    public static List<String> splitWordsBySeparator(String[] words, char separator) {
        // Creating a list to store the resulting substrings
        List<String> splitWords = new ArrayList<>();

        // Iterating through each string in the list of words
        for (String word : words) {
            // Splitting the current word by the separator and escaping it if it's a special regex character
            String[] parts = word.split(Pattern.quote(String.valueOf(separator)));

            // Adding each non-empty part to the result list
            for (String part : parts) {
                if (!part.isEmpty()) {
                    splitWords.add(part);
                }
            }
        }

        // Returning the list of split substrings
        return splitWords;
    }


    public static void main(String[] args) {
        String[] words = {"one.two.three","four.five","six"};
        char separator = '.';
        System.out.println(splitWordsBySeparator(words, separator));

    }
}
