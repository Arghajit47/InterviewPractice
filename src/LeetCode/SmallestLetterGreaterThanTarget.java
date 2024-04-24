package LeetCode;

import java.util.Arrays;

public class SmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        for (int i = 0; i < letters.length; i++) {
            if (target < letters[i]) {
                return letters[i];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] ch = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(ch, target));
    }
}
