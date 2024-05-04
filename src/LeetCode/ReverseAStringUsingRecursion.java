package LeetCode;

public class ReverseAStringUsingRecursion {

    public static String reverse(String str, int length) {
        if (length < 1) {
            return " ";
        }
        if (length == 1) {
            return String.valueOf(str.charAt(0));
        }
        return str.charAt(length - 1) + reverse(str, length-1);

    }

    public static void main(String[] args) {
        String str = "Geeks for geeks";
        System.out.println(reverse(str, str.length()));
    }
}
