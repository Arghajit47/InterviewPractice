package LeetCode;

import java.util.Arrays;

public class ProductOfArrayWithoutSelf {

    public static int[] productArray(int[] arr) {
        // With division operator
        //[1,2,3,4] -> [24,12,8,6]
        int[] res = new int[arr.length];
        int zeroCount = 0;
        int product = 1;
        for (int j : arr) {
            if (j==0){
                zeroCount++;
            }else {
                product = product * j;
            }
        }

        if (zeroCount > 1) {
            return new int[arr.length];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                res[i] = product;
            } else {
                res[i] = product/arr[i];
            }
        }
        return res;
    }

    public static int[] prodArray(int[] arr) {      //Less Complexity in understanding
        int product = 1;
        int zeroCount = 0;
        int[] res = new int[arr.length];
        for (int j = 0; j < arr.length ; j++) {
            if (arr[j] == 0) {
                arr[j]=1;
                zeroCount++;
            }
            product = product * arr[j];
        }

        if (zeroCount > 1){
            return new int[arr.length];
        }

        for (int i = 0; i < arr.length; i++) {
            res[i] = product/arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,4};
        System.out.println(Arrays.toString(productArray(arr)));
        System.out.println(Arrays.toString(prodArray(arr)));
    }
}
