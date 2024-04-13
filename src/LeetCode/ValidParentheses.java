package LeetCode;

public class ValidParentheses {

    public static boolean isValid(String s) {
        int countP = 0;
        int countC = 0;
        int countS = 0;
        for (char ch : s.toCharArray()){
            switch (ch) {
                case '(' :
                    countP++;
                    break;
                case ')' :
                    countP--;
                    if (countP < 0) {
                        return false;
                    }
                    break;
                case '{' :
                    countC++;
                    break;
                case '}' :
                    countC--;
                    if (countC < 0) {
                        return false;
                    }
                    break;
                case '[' :
                    countS++;
                    break;
                case ']' :
                    countS--;
                    if (countS < 0) {
                        return false;
                    }
                    break;
            }

        }
        return countP == 0 && countC == 0 && countS == 0;
    }

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }
}
