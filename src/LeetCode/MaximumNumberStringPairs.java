package LeetCode;

public class MaximumNumberStringPairs {
    public static int solution(String[] words){
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String str1 = words[i];
            String wordReverse = reverse(str1);
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].equals(wordReverse)){
                    count++;
                }
            }
        }
        return count;
    }

    public static String reverse(String str2){
        String rev = "";
        for (int i = 0; i < str2.length(); i++) {
            rev = str2.charAt(i) + rev;     //ba -> ab
        }
        return rev;
    }

    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        System.out.println(solution(words));
    }
}
