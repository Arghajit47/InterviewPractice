package GeeksForGeeks;

import java.util.*;

public class MatchingFrequency {
    public static List<Integer> retrieve(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> freq = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : arr) {
            map.put(val, map.getOrDefault(val, 0) +1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == k) {
                freq.add(integerIntegerEntry.getKey());
            }
        }

        return freq;
    }

    public static void main(String[] args) {
        Integer[] inte = {11,11,12,11,11,1,1,4,12,13,12,3,4,3,1,4};
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(inte));
        System.out.println(retrieve(arr, 3));
    }
}
