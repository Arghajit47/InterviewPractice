package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class BuddyString {
    public static boolean buddyStrings(String s, String goal) {
        ArrayList<Integer> list = new ArrayList<>();
        if(s.length() != goal.length()) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    list.add(i);
                }
            }
            System.out.println(list);
            if (list.size() > 2) {
                System.out.println("more than 2");
                return false;
            } else {
                String swap = swapping(s, list.get(0), list.get(1));
                if (goal.equals(swap)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public static String swapping(String s, int a, int b) {
         char[] chars = s.toCharArray();
         String str = "";
         char temp = 0;
         temp = chars[a];
         chars[a] = chars[b];
         chars[b] = temp;
        for (int i = 0; i < chars.length; i++) {
            str += chars[i];
        }

         System.out.println(str);
         return str;
    }

    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba"));
    }

}
