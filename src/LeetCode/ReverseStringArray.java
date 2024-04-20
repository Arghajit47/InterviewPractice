package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseStringArray {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters at left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers towards each other
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseStringArray solution = new ReverseStringArray();

        // Example 1
        char[] input1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(input1);
        System.out.println(Arrays.toString(input1));

        // Example 2
        char[] input2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(input2);
        System.out.println(Arrays.toString(input2));
    }
}
