public class Patterns {

    public static void printPattern1() {
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern2() {
        for (int i = 1; i < 6; i++) {   //i=3,3<6
            for (int j = 1; j <= i; j++) {  //j=1,1<3   //j=2,2<3   //j=3,3=3
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern4() {
        int rows = 5;
        int cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern5(){
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printPattern1();
        printPattern2();
        printPattern3();
        printPattern4();
        printPattern5();
    }
}
