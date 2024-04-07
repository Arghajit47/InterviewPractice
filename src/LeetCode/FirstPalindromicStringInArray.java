package LeetCode;

public class FirstPalindromicStringInArray {

    public static String solution(String[] words) {
        for (String word : words) {
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String str){
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        if (rev.equals(str)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(solution(words));
    }
}
