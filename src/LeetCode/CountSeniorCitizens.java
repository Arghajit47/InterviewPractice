package LeetCode;

public class CountSeniorCitizens {
    public static int countSenior(String[] details) {
        int count = 0;
        for (String detail : details) {
            String ageString = detail.substring(11, 13);
            int age = Integer.parseInt(ageString);
            if (age > 60){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSenior(details));
    }
}
