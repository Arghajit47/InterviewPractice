package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortPeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < heights.length; j++) {
                hashMap.put(names[i], heights[j]);
            }
        }
        System.out.println(hashMap);
        Map<String, Integer> sortedMap = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(sortedMap);
        String[] keys = sortedMap.keySet().toArray(new String[0]);
        System.out.println(keys);
        String[] sortedKeys = new String[keys.length];
        for (int i = keys.length-1; i > 0; i--) {
            for (int j = 0; j < keys.length; j++) {
                sortedKeys[j] = keys[i];
            }
        }
        return sortedKeys;
    }

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(sortPeople(names,heights));
    }
}
