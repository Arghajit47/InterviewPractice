package LeetCode;

public class IsPrefixString {
    public static boolean isPrefixString(String s, String[] words) {
        String str = "";
        for(String word : words) {
            str = str + word;
            if(str.equals(s)) {
                return true;
            }
            if(str.length() > s.length()) {
                break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "ileetcode";
        String[] words = {"i","love","leetcode","apples"};
        System.out.println(isPrefixString(s,words));
    }
}
