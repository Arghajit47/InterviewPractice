package LeetCode;

public class NimGame {
    public static boolean canWinNim(int n) {
        int c = 0;
        int i = n;
        while (i >= 1) {
            i = i - 3;
            c++;
        }
        if (c%2 == 0) {
            return false;
        }else {
            return true;
        }
    }

    public static boolean solution(int n) {
        return n%4 != 0;
    }
    public static void main(String[] args) {
        System.out.println(canWinNim(1));
        System.out.println(solution(8));
    }
}
