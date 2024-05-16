package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {

//    Input: candies = [2,3,5,1,3], extraCandies = 3
//    Output: [true,true,true,false,true]

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int maxCandies = candies[0];
        for (int i = 1; i < candies.length; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        for (int val:candies){
            result.add(val+extraCandies >= maxCandies);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int target = 3;
        System.out.println(kidsWithCandies(arr, target));
    }
}
