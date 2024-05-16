package LeetCode;

public class StringWithOddCounts {
    public static String generateTheString(int n) {
        String str = "";
        String pull = "z";
        String push = "d";
        String newStr = "";
        if (n == 1) {
            newStr = pull;
        } else if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                str = str + "p";
            }
            newStr = str + pull;
        } else {
            for (int i = 0; i < n - 2; i++) {
                str = str + "p";
            }
            newStr = str + pull + push;
        }

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(generateTheString(7));
    }
}
