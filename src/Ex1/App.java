
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int allsec = scanner.nextInt();
        int hours = allsec / 3600;
        int minutes = (allsec % 3600) / 60;
        int seconds = allsec % 60;

        System.out.printf("Time period of %d seconds is %02d:%02d:%02d expressed in hours/minutes/seconds\n",
                allsec, hours, minutes, seconds);

        scanner.close();
    }
}