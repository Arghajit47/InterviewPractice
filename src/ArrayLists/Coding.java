package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Coding {
    public static void searchEle(ArrayList<Integer> arr, int element){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(element)) {
                System.out.println("Index of the Element in the ArrayList is : " + i);
                break;
            }
        }
    }

    public static void reverse(ArrayList<String> arr){
        Collections.reverse(arr);
        System.out.println(arr);
    }

    public static void removeStrDuplicate(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))){
                    arr.remove(j);
                }
            }
        }
        System.out.println(arr);
    }

    public static void removeIntDuplicate(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))){
                    arr.remove(j);
                }
            }
        }
        System.out.println(arr);
    }

    public static void commonElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if (arr1.get(i).equals(arr2.get(j))){
                    System.out.println(arr1.get(i) + " is the common element in 2 ArrayLists");
                }
            }
        }
    }

    public static void mergeArrayLists(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        arr1.addAll(arr2);
        System.out.println(arr1);
        removeIntDuplicate(arr1);
    }

    public static void rotateArrayLists(ArrayList<Integer> arr){
        Collections.rotate(arr, 0);
        System.out.println(arr);
    }

    public static void arrayListActions(ArrayList<Integer> arr){
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        int a = arr.get(0);
        int b = arr.get(1);
        System.out.println("Maximum product of two integers in an ArrayList : " + a*b);
        System.out.println("Second largest element in the ArrayList : " + b);
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,2,3,4,5,6,7,8,9,10,8,8989,37872,65758};
        ArrayList<Integer> numArray = new ArrayList<>(Arrays.asList(nums));

        String[] strings = {"Arghajit", "Singha", "Suman", "Sagnik", "Sourav", "Numan", "Pratik", "Mukesh", "Singha", "Mukesh", "Singha"};
        ArrayList<String> strArray = new ArrayList<>(Arrays.asList(strings));

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        searchEle(numArray, 8989);  // 1

        removeIntDuplicate(numArray);   // 2
        removeStrDuplicate(strArray);   // 2

        reverse(strArray);  // 3

        commonElement(numArray, numbers);   // 4

        mergeArrayLists(numArray, numbers); // 5

        rotateArrayLists(numbers);  // 6

        arrayListActions(numbers); // 7 & 8
    }
}
