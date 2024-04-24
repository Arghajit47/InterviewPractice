package LeetCode;

public class WordsAsString {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] arrSentence = sentence.split(" ");
        for (int i = 0; i < arrSentence.length; i++) {
            if (arrSentence[i].startsWith(searchWord)) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("this problem is an easy problem", "pro"));
    }
}
