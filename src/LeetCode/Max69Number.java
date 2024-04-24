package LeetCode;

public class Max69Number {
    public static int maximum69Number (int num) {
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '6') {
                return Integer.parseInt(numStr.substring(0, i) + '9' + numStr.substring(i+1));
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }
}
