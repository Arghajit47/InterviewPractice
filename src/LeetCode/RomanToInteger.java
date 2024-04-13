package LeetCode;

import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int result = 0;
        int currentValue = 0;
        int previousValue = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            currentValue = hashMap.get(s.charAt(i));

            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            previousValue = currentValue;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "IV";
        System.out.println(romanToInt(s));
    }
}
