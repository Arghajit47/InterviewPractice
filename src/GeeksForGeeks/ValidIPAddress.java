package GeeksForGeeks;

import java.util.ArrayList;
import java.util.List;

public class ValidIPAddress {
    public static List<String> ipAddress(String ip) {
        ArrayList<String> list = new ArrayList<>();
        String[] words = ip.split("\\s+");
        for (String word : words) {
            if (isValidIP(word)) {
                System.out.println(word);
                if (word.endsWith(".")) {
                    word = word.substring(0, word.length()-1);
                    list.add(word);
                }

            }
        }
        return list;
    }

    public static boolean isValidIP(String word) {
        String[] address = word.split("\\.");
        if (address.length != 4) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ipAddress("The server's IP address is 192.168.1.1. Please connect to 10.0.0.1."));
    }
}
