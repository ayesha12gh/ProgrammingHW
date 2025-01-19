import java.util.Scanner;

public class App2 {

    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInspection = true;

        while (continueInspection) {
            System.out.print("Enter text to check for palindrome: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("The input is a palindrome.");
            } else {
                System.out.println("The input is not a palindrome.");
            }

            System.out.print("Do you want to inspect another text? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("yes")) {
                continueInspection = false;
            }
        }

        System.out.println("Thank you for using the Palindrome Checker!");
        scanner.close();
    }
}

