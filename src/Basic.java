import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Basic {

    public static void getStringBy() {
        Integer[] specialArr = {11, 18, 70, 77, 7};
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(specialArr));
        for (int i = 1; i <= 100; i++) {
            if (arr.contains(i)) {
                System.out.println("LuckyTime");
            } else if (i % 7 == 0 && i % 5 == 0) {
                System.out.println("RocketLane");
            } else if (i % 5 == 0) {
                System.out.println("Lane");
            } else if (i % 7 == 0) {
                System.out.println("Rocket");
            } else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        getStringBy();

        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15

        int row = 6;
        int num = 1;

        for (int j = 1; j < row; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        String str = "Arghajit.Singha";
        ArrayList<String> list = new ArrayList<>();
        System.out.println(str.split("."));
        Collections.addAll(list, str.split("."));
        System.out.println(list);
    }
}


