package LeetCode;

import java.util.Arrays;

public class ConvertIntegerToNonZeroSum {
    public static int[] getNoZeroIntegers(int n) {
        int a = 1;
        while (true) {
            if (!containsZero(a)) {
                int b = n - a ;
                if (!containsZero(b)) {
                    return new int[]{a,b};
                }
            }
            a++;
        }

    }

    public static boolean containsZero(int num) {
        while (num > 0) {
            if (num%10 == 0) {
                return true;
            }
            num = num/10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNoZeroIntegers(1010)));
    }
}
