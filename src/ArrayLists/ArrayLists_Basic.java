package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists_Basic {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<String> listStr = new ArrayList<>();
        ArrayList<Boolean> listBln = new ArrayList<>();

        // Add Element
        for(int i = 0; i < 10; i++) {
            listInt.add(i);
        }
        System.out.println(listInt);


        // Get Element
        System.out.println(listInt.get(6));

        // Add Elements in Between
        listInt.add(5, 786);
        System.out.println(listInt);

        // Set or Modify Arraylist index value
        listInt.set(7, 4711);
        System.out.println(listInt);

        //Delete an element
        listInt.remove(9);
        System.out.println(listInt);

        // Size of an ArrayList
        System.out.println(listInt.size());

        // Sorting, Reverse, Rotate in an ArrayList
        Collections.sort(listInt);
        Collections.reverse(listInt);
        Collections.rotate(listInt, 0);
        System.out.println(listInt);
    }
}
