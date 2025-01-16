
// Java program to remove duplicates from a string
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char c : input.toCharArray()) {
            // Add the character if it is not already in the result
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }

        // Print the string after removing duplicates
        System.out.println("String after removing duplicates: " + result);

        // Close the scanner
        scanner.close();
    }
}
