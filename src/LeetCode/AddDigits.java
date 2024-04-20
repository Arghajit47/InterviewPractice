package LeetCode;

public class AddDigits {
    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                int n = num % 10;
                sum = sum + n;
                num = num / 10;
            }
            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(98));
    }
}
