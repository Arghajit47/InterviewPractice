package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class SlowestKeyPress {
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] time = new int[releaseTimes.length];
        time[0] = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            time[i] = releaseTimes[i] - releaseTimes[i-1];
        }
        System.out.println(Arrays.toString(time));
        int max = maxElement(time);
        return keysPressed.charAt(max);


    }

    public static int maxElement(int[] arr) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] time = {23,34,43,59,62,80,83,92,97};
        String key = "qgkzzihfc";
        System.out.println(slowestKey(time, key));
    }
}
