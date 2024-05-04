package GeeksForGeeks;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfWordsInString {
    public static HashMap<String, Integer> frequency(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = str.replaceAll("[,?.]", "").split(" ");
        System.out.println(Arrays.toString(words));
        for (String val : words) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(frequency("My name is Singha. My name is suman"));
    }
}
