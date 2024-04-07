package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class Coding {

    public static int counter(int arr[]) {
        //In an array there are n elements, find the element which is occurring more than n/2 times.
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int val : arr) {
            countMap.put(val, countMap.getOrDefault(val, 0) + 1);
            if (countMap.get(val) > arr.length / 2) {
                return val;
            }
        }
        return -1;
    }

    public static void frequency(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        System.out.println(map);
    }

    public static void checkDuplicates(int[] arr ){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        Set<Integer> keys = map.keySet();
        for ( int key : keys){
            if (map.get(key) > 1){
                System.out.println("Duplicates are : " + key);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4,2,2,2,3,4,3,2,3,2,2};
        System.out.println(counter(array));
        frequency(array);
        checkDuplicates(array);
        String str = "Hello";
        System.out.println(str.length());
    }
}
