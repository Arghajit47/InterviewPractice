package LeetCode;

public class RemoveVowelsFromString {
    public static String solution(String str) {
        str = str.toLowerCase();
        String newStr = "";
        for (char ch : str.toCharArray()) {
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                newStr = newStr + ch;
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(solution("I am trying to achieve this codeu"));
    }
}
