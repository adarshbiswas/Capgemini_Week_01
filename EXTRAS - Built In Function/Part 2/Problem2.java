
// Java program to find the maximum of three numbers
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the maximum number
        int max = Math.max(num1, Math.max(num2, num3));

        // Print the maximum number
        System.out.println("The maximum number is: " + max);

        // Close the scanner
        scanner.close();
    }
}
