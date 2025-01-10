// Q.6) Write a program to check whether a number is positive, negative, or zero.

// Import the required class for the program
import java.util.Scanner;

// Create the NumberCheck class to perform the desired operations
public class NumberCheck {
        public static void main(String[] args) {
                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                // Take input for a number and store in a variable
                System.out.print("Enter a number: ");
                int number = sc.nextInt();

                // Output if the input number is positive, negative or Zero based on the given
                // conditions
                if (number > 0) {
                        System.out.println("Positive");
                } else if (number < 0) {
                        System.out.println("Negative");
                } else {
                        System.out.println("Zero");
                }

                // Close the Scanner Object
                sc.close();
        }
}
