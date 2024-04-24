package LeetCode;

import java.util.Arrays;

public class CheckStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        int deltaX = coordinates[1][0] - coordinates[0][0];
        int deltaY = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            int deltaXCurrent = coordinates[i][0] - coordinates[0][0];
            int deltaYCurrent = coordinates[i][1] - coordinates[0][1];

            if (deltaX * deltaYCurrent != deltaY * deltaXCurrent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] cor = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        int[][] cordi = {{0, 0}, {0, 1}, {0, -1}};
        System.out.println(checkStraightLine(cordi)); // Output: true
    }
}
