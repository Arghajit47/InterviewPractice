package LeetCode;

public class StudentAttendence {

    public static boolean checkRecord(String s) {
        int count =0;
        if (s.contains("LLL")){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                count++;
            }
        }
        if (count >= 2) {
            return false;
        }
        return true;
    }
}
