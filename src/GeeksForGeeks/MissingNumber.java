package GeeksForGeeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
    public static int missingNumber(int array[], int n) {
        // Your Code Here
        int num = 0;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 1; i < n; i++) {
            hashmap.put(i, 0);
        }
        for (int val : array) {
            hashmap.put(val, hashmap.getOrDefault(val, 0) - 1);
        }
        for (int i = 1; i < n; i++) {
            for (Map.Entry<Integer, Integer> integerIntegerEntry : hashmap.entrySet()) {
                if (integerIntegerEntry.getValue() == 0) {
                    num = integerIntegerEntry.getKey();
                }

            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 4, 5, 6, 7};
        System.out.println(missingNumber(array, 7));
    }
}
