package LeetCode;

import java.util.*;

public class MinIndexNumberInTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minIndexSum = list1.length + list2.length; // Initialize with a value larger than the maximum possible index sum

        // Store indices of strings from list1 in a HashMap
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        // Iterate through list2 and check if the string exists in the HashMap
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int indexSum = j + map.get(list2[j]);
                if (indexSum < minIndexSum) {
                    // Update minimum index sum and clear previous result
                    minIndexSum = indexSum;
                    result.clear();
                    result.add(list2[j]);
                } else if (indexSum == minIndexSum) {
                    // If index sum is equal to minIndexSum, add the string to result
                    result.add(list2[j]);
                }
            }
        }

        // Convert ArrayList to array for final output
        return result.toArray(new String[result.size()]);

    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }
}
