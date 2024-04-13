package LeetCode;

public class IndexOfString {

    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        } else {
            return haystack.indexOf(needle);
        }
    }
    public static void main(String[] args) {
        String s = "sadbutsad";
        String needle = "sad0";
        System.out.println(strStr(s,needle));
    }
}
