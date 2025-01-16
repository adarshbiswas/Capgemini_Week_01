
// Java program to compare two strings lexicographically
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine(); // Input the first string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine(); // Input the second string

        // Compare strings lexicographically
        int result = str1.compareTo(str2);

        // Print the result of the comparison
        if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2);
        } else {
            System.out.println("Both strings are equal.");
        }

        // Close the scanner
        scanner.close();
    }
}
