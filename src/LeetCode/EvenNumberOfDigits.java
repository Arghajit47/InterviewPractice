package LeetCode;

public class EvenNumberOfDigits {

    public static int findNumbersNew(int[] nums) {
        int count = 0;
        for (int num : nums) {
            String str = String.valueOf(num);
            if (str.length()%2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbersNew(nums));
    }
}
