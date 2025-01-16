
// Java program to find the number of occurrences of a substring in a string
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine(); // Input the main string
        System.out.print("Enter the substring: ");
        String subString = scanner.nextLine(); // Input the substring

        int count = 0; // Counter to store the occurrences

        // Iterate through the main string to check for the substring
        for (int i = 0; i <= mainString.length() - subString.length(); i++) {
            if (mainString.substring(i, i + subString.length()).equals(subString)) {
                count++; // Increment the counter when a match is found
            }
        }

        // Print the number of occurrences
        System.out.println("Occurrences: " + count);

        // Close the scanner
        scanner.close();
    }
}
