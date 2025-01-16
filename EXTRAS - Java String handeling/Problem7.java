
// Java program to toggle the case of each character in a string
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Input the string

        StringBuilder toggled = new StringBuilder(); // To store the toggled string

        // Iterate through each character in the string
        for (char c : input.toCharArray()) {
            // Toggle case of each character
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c)); // Convert uppercase to lowercase
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c)); // Convert lowercase to uppercase
            } else {
                toggled.append(c); // Append non-alphabetic characters as-is
            }
        }

        // Print the toggled string
        System.out.println("Toggled String: " + toggled);

        // Close the scanner
        scanner.close();
    }
}
