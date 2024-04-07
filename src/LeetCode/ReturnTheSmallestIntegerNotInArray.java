package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnTheSmallestIntegerNotInArray {
    public static int solution(int[] arr) {
        int i =0;
        while (i< arr.length){
            int idx = arr[i]-1;
            if (idx >=0 && idx < arr.length && arr[i] != arr[idx]){     // Cyclic Sort
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            } else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]-1){
                return j+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,5};
        System.out.println(solution(nums));
    }
}
