package GeeksForGeeks;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;


public class ReturnNonDuplicateNumbers {
    public static List<Integer> nonDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int val: arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == 1){
                list.add(integerIntegerEntry.getKey());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,34,2,1,1,3,2,1,3,4};
        System.out.println(nonDuplicates(arr));
    }
}
