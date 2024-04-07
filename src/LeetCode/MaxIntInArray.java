package LeetCode;

public class MaxIntInArray {
    public static void maxInArray(int[] arr) {
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] nums = {2,34,54,65,122};
        maxInArray(nums);
    }
}
