package LeetCode;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void sorting(int[] arr){
        System.out.println(Arrays.toString(arr));
        int i =0;
        while(i < arr.length){
            int index = arr[i]-1;
            if (index >= 0 && index < arr.length && arr[i] != arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,7,5,3,2};
        sorting(arr);
    }
}
