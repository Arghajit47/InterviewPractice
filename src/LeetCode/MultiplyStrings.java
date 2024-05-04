package LeetCode;

import java.math.BigInteger;

public class MultiplyStrings {
    public static String mul(String num1, String num2) {
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        return (number1.multiply(number2)).toString();
    }

    public static void main(String[] args) {
        System.out.println(mul("123456789","987654321"));
    }
}
