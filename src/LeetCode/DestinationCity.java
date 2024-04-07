package LeetCode;

import java.util.*;

public class DestinationCity {

//Example 1:
//Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
//Output: "Sao Paulo"
//Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

//Example 2:
//Input: paths = [["B","C"],["D","B"],["C","A"]]
//Output: "A"
//Explanation: All possible trips are:
//"D" -> "B" -> "C" -> "A".
//"B" -> "C" -> "A".
//"C" -> "A".
//"A".
//Clearly the destination city is "A".

//Example 3:
//Input: paths = [["A","Z"]]
//Output: "Z"

    public static String destCity(List<List<String>> paths) {
        Set<String> sources = new HashSet<>();
        for (List<String> path : paths) {
            sources.add(path.get(0));
        }
        for (List<String> path : paths) {
            String destination = path.get(1);
            if (!sources.contains(destination)) {
                return destination;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();

        List<String> path1 = new ArrayList<>(Arrays.asList("London", "New York"));
        List<String> path2 = new ArrayList<>(Arrays.asList("New York", "Lima"));
        List<String> path3 = new ArrayList<>(Arrays.asList("Lima", "Sao Paulo"));

        paths.add(path1);
        paths.add(path2);
        paths.add(path3);

        System.out.println(destCity(paths));
    }
}
