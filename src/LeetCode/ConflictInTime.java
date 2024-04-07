package LeetCode;

public class ConflictInTime {
    public static boolean solution(String[] event1, String[] event2){
        int t11 = parseTimeInterval(event1[0]); // 30
        int t12 = parseTimeInterval(event1[1]); // 90
        int t21 = parseTimeInterval(event2[0]); // 45
        int t22 = parseTimeInterval(event2[1]); // 120
        return t21 <= t12 && t22 >= t11;

    }

    public static int parseTimeInterval(String time){
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0])*60+Integer.parseInt(parts[1]);
    }

    public static void main(String[] args) {
        String[] event1 = {"01:00","02:00"};
        String[] event2 = {"01:20","03:00"};
        System.out.println(solution(event1,event2));
    }
}
