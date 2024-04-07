package LeetCode;

public class ConsistentString {
    public static int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        for (String word : words) {
            if (isConsistent(allowed, word)) {
                c ++;
            }
        }
        return c;
    }

    public static boolean isConsistent(String allowed, String word){
        int count = 0;
            for (int i = 0; i < word.length(); i++){
                if (allowed.contains(Character.toString(word.charAt(i)))) {
                    count++;
                }
            }
            if (count == word.length()) {
                return true;
            }
        return false;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }
}
