package LeetCode;

public class PerfectValidSquare {
    public static boolean isPerfectSquare(int num) {
        int a = (int) Math.sqrt(num);
        return a * a == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
