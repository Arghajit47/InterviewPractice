package LeetCode;

public class ConsecutiveCharacters {
    public static int maxPower(String s) {
        int max = 1;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("triplepillooooow"));
    }
}
