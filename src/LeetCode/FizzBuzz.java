package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0 && i%5 == 0){
                answer.add("FizzBuzz");
            } else if (i%3 == 0) {
                answer.add("Fizz");
            } else if (i%5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
