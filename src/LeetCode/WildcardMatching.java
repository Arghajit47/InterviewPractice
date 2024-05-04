package LeetCode;

public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        if (p.contains("*")){
            return true;
        }
        if (s.length() != p.length()){
            return false;
        }
        if(s.length() ==1 && p.equals("?")){
            return true;
        }
        char[] sChar = s.toCharArray();
        char[] pchar = p.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sChar[i] == pchar[i] || pchar[i] == '?') {
                count++;
            }
        }
        return count == s.length();
    }
}
