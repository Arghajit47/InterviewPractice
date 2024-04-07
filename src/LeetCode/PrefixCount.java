package LeetCode;

public class PrefixCount {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        String part = "";
        for(String word : words){
            if(word.contains(pref)){
                part = word.substring(0, pref.length());
                if(part.equals(pref)){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String s = "at";
        System.out.println(prefixCount(words, s));
    }
}
