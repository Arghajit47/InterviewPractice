package LeetCode;

public class PerfectNumber {

    public static boolean checkPerfectNumber(int num) {
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count = count + i;
            }
        }
        System.out.println(count);
        return num ==count;
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(checkPerfectNumber(num));
    }
}
