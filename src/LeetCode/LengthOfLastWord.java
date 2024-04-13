package LeetCode;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String[] str = s.trim().split("\\s+");
        return str[str.length-1].length();
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
