
public class App3 {

    public static void main(String[] args) {
        System.out.println("Pattern a:");
        printPatternA();
        System.out.println("\nPattern b:");
        printPatternB();
        System.out.println("\nPattern c:");
        printPatternC();
        System.out.println("\nPattern d:");
        printPatternD();
    }
    public static void printPatternA() {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPatternB() {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 10; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void printPatternC() {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void printPatternD() {
        for (int i = 10; i >= 1; i--) {

            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
