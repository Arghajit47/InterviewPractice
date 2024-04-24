package LeetCode;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()){
            return false;
        } else if (s.contains(goal.substring(0, 3))){
            int index = s.indexOf(goal.substring(0, 3));
            String str1 = s.substring(0, index);
            String str2 = s.substring(index, s.length());
            System.out.println(str1);
            System.out.println(str2);
            String rotate = str2 + str1;
            if (!goal.equals(rotate)){
                return false;
            }
            return true;
        } else if (s.endsWith(String.valueOf(goal.charAt(0)))) {
            int index = s.indexOf(goal.charAt(0));
            String str1 = s.substring(0, index);
            String str2 = s.substring(index, s.length());
            System.out.println(str1);
            System.out.println(str2);
            String rotate = str2 + str1;
            if (!goal.equals(rotate)){
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("gcmbf", "fgcmb"));
    }
}
