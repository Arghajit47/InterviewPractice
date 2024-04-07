package LeetCode;

public class TruncateString {
    public static String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        String newStr = "";
        for (int i = 0; i < k; i++) {
            if (!newStr.equals("")){
                newStr = newStr + " " + str[i];
            } else {
                newStr = newStr + str[i];
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));
    }
}
