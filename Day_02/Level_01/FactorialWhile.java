// Q.14) Write a Program to find the factorial of an integer entered by the user.

// Import the required class for the program
import java.util.Scanner;

// Create the FactorialWhile class to perform the desired operations
public class FactorialWhile {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take input for a positive number and store in a variable
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            // If negative number is entered print following error.
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;
            // use while loops to find the factorial
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            // Prints the output of the factorial of an integer entered by the user
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        // Close the Scanner Object
        sc.close();
    }
}
