package LeetCode;

public class WordsByCharacters {

//Example 1:

//Input: words = ["cat","bt","hat","tree"], chars = "atach"
//Output: 6
//Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

    public static int countCharacters(String[] words, String chars) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            String word = words[i];
            System.out.println(word);
            for (int j = 0; j < word.length(); j++) {
                if (chars.contains(Character.toString(word.charAt(j)))){
                    System.out.println("Increasing count");
                    count++;
                } else {
                    break;
                }
            }
            if (count == word.length()) {
                result = result + word.length();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }
}
