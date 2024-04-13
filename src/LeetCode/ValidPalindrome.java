package LeetCode;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String string =str.replaceAll("[^a-zA-Z0-9]", "");
        String rev = "";
        for (int i = 0; i < string.length(); i++) {
            rev = string.charAt(i) + rev;
        }
        if (rev.equals(string)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "A man, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
