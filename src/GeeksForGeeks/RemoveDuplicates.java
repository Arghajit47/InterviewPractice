package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> remove(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i) == nums.get(j)) {
                    nums.remove(j);
                    j--;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Integer[] num = {1,1,1,2,2,2,3,3,4};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(num));
        System.out.println(remove(nums));
    }
}

// 1st step: [1,1], i=0,j=1 endList: {1,1,2,2,2,3,3,4}
// 2nd step: [1,1], i=0, j=2-1=1 endList: {1,2,2,2,3,3,4}
// And so on...