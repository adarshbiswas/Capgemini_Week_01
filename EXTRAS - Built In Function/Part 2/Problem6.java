
// Java program to calculate factorial using recursion
import java.util.Scanner;

public class Problem6 {
    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the factorial
        System.out.println("Factorial of " + number + " is: " + factorial(number));

        // Close the scanner
        scanner.close();
    }
}
