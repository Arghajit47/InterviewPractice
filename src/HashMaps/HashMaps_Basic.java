package HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps_Basic {
    public static void main(String[] args) {
        HashMap<String, Integer> data = new HashMap<>();

        // Add data into Hashmaps
        data.put("India", 120);
        data.put("China", 150);
        data.put("U.S", 220);

        System.out.println(data);

        // Search by key or value, and get value by key
        if (data.containsKey("China")){
            System.out.println("This key is present, the value of this key is : " + data.get("China"));
        } else {
            System.out.println("Key not found !");
        }

        // Iterating in a Hashmap
        // 1st Technique : entrySet
        for (Map.Entry<String, Integer> e : data.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // 2nd Technique : keySet(only to print keys)
        Set<String> keys = data.keySet();
        for (String key : keys){
            System.out.println(key + " " + data.get(key));
        }

        // Update key, Value
        data.put("U.S", 550);   // If already present by the keyName, then it will update, or else it will create a new one
        System.out.println(data);


        // Delete a Key,Value Pair
        data.remove("U.S");
        System.out.println(data);

        // Size of Hashmap
        System.out.println(data.size());
    }

}
