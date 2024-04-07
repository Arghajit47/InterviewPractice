package LeetCode;// You are given a 0-indexed string array words.
//Let's define a boolean function isPrefixAndSuffix that takes two strings, str1 and str2: isPrefixAndSuffix(str1, str2) returns true if str1 is both a prefix and a suffix
// of str2, and false otherwise.
//For example, isPrefixAndSuffix("aba", "ababa") is true because "aba" is a prefix of "ababa" and also a suffix, but isPrefixAndSuffix("abc", "abcd") is false.
//Return an integer denoting the number of index pairs (i, j) such that i < j, and isPrefixAndSuffix(words[i], words[j]) is true.


public class IsSuffixAndPrefix {
    public static int solution(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String str1 = words[i];
            for (int j = i + 1; j < words.length; j++) {
                String str2 = words[j];
                if (str2.startsWith(str1) && str2.endsWith(str1)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"a", "aba", "ababa", "aa"};
        System.out.println(solution(words)); // Output: 4
        String[] words1 = {"pa", "papa", "ma", "mama"};
        System.out.println(solution(words1)); // Output: 2
        String[] words2 = {"abab","ab"};
        System.out.println(solution(words2)); //Output: 0
    }
}
