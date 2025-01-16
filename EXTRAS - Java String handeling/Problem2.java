
// Java program to reverse a string
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // StringBuilder to store the reversed string
        StringBuilder reversed = new StringBuilder();

        // Iterate from the end of the string to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        // Print the reversed string
        System.out.println("Reversed String: " + reversed);

        // Close the scanner
        scanner.close();
    }
}
