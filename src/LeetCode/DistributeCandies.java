package LeetCode;

import java.util.HashSet;

import static java.lang.Math.ceil;

public class DistributeCandies {

    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            if(!hashset.contains(candyType[i])) {
                hashset.add(candyType[i]);
            }
        }
        if (hashset.size() < candyType.length/2){
            return hashset.size();
        }
        return candyType.length/2;
    }

    public static void main(String[] args) {
        int[] c = {6,6,6,6};
        System.out.println(distributeCandies(c));
    }
}
