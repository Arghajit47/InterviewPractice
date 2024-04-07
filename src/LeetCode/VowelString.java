package LeetCode;

public class VowelString {
    public static int vowelString(String[] words, int left, int right){
        int count = 0 ;
        for (int i = left; i <= right ; i++) {
            String str = words[i];
            if (isVowelString(str.charAt(0)) && isVowelString(str.charAt(str.length()-1))){
                count++;
            }
        }
        return count;
    }

    public static boolean isVowelString(char ch){
        switch (ch)
        {
            case 'a' :
                return true;
            case 'e' :
                return true;
            case 'i' :
                return true;
            case 'o' :
                return true;
            case 'u' :
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"argha", "suman", "singha", "betichod"};
        System.out.println(vowelString(words, 0, 2));
    }
}
