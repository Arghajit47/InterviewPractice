package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PositiveNegative {
    public static List<Integer> positiveNegative(int[] num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (Math.abs(num[i]) == Math.abs(num[j])) {
                    list.add(num[i]);
                    list.add(num[j]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {-1,1,8,7,9,-9};
        System.out.println(positiveNegative(array));
    }
}
