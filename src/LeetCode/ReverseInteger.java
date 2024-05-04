package LeetCode;

public class ReverseInteger {
    public static int reverse(int x) {
        int num = Math.abs(x);
        int rev = 0;
        int n = 0;
        while(num != 0) {
            if (rev > (Integer.MAX_VALUE - n) / 10) {
                return 0;
            }
            n = num%10;
            rev = rev*10 + n;
            num = num/10;
        }
        if (x < 0){
            return rev*(-1);
        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
