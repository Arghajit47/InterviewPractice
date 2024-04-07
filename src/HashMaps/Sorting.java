package HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        Map<String, Integer> sortedMap = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(sortedMap);
    }
   
}
