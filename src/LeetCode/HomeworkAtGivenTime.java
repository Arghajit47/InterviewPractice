package LeetCode;

public class HomeworkAtGivenTime {
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            for (int j = startTime[i]; j <= endTime[i]; j++) {
                if (j == queryTime){
                    count++;
                }
            }
        }
        return count;
    }
}
