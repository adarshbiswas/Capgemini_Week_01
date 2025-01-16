
// Java program to check if a string is a palindrome
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the input string
        String reversed = new StringBuilder(input).reverse().toString();

        // Check if the original and reversed strings are equal
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}
