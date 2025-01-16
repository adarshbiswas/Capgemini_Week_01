
// Java program to remove all occurrences of a specific character from a string
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Input the string
        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.nextLine().charAt(0); // Input the character to remove

        // Remove all occurrences of the specified character
        String result = input.replace(String.valueOf(toRemove), "");

        // Print the modified string
        System.out.println("Modified String: " + result);

        // Close the scanner
        scanner.close();
    }
}
