package LeetCode;

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while (left < right){
            if (!Character.isLetter(chars[left])){
                left ++;
            } else if (!Character.isLetter(chars[right])) {
                right --;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left ++;
                right--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
}
