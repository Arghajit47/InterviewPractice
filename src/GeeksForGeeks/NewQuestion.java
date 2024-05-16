package GeeksForGeeks;

import java.util.HashMap;
import java.util.Map;

//String s = "Leetcode is a good habit to have";
//String str = "A is to good have habit leetcode";
public class NewQuestion {
    public static String solution(String string) {
        String[] str = string.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String val : str) {
            map.put(val, val.length());
        }
//        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
//            for (int i = 1; i < ; i++) {
//
//            }
//        }
        return string;
    }
}
