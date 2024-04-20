package LeetCode;

import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;
            while (n != 0) {
                int num = n%10;
                sum = sum + (num*num);
                n = n/10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
}
