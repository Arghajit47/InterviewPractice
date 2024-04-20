package LeetCode;

import java.util.HashMap;

public class RansomeNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map1 = new HashMap<>();

        for (char c : magazine.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }

        for (char c : ransomNote.toCharArray()){
            if (!map1.containsKey(c) || map1.get(c) == 0) {
                return false;
            } else {
                map1.put(c, map1.get(c)-1);
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String r = "aabb";
        String m = "aaba";
        System.out.println(canConstruct(r,m));
    }
}
