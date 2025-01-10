// Q.4) Write a program to check for the natural number and write the sum of n natural numbers 

// Import the required class for the program
import java.util.Scanner;

// Create the NaturalNumberSum class to perform the desired operations
public class NaturalNumberSum {
        public static void main(String[] args) {
                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                // Take input for a number and store in a variable
                System.out.print("Enter a number n: ");
                int n = sc.nextInt();

                if (n > 0) {
                        // Store the sum of n natural number in a variable
                        int sum = n * (n + 1) / 2;

                        // Output and check if the input number n is a natural n and write the sum of
                        // n natural number
                        System.out.println("The number " + n
                                        + " is a natural number, and the sum of n natural number is " + sum);
                } else {
                        System.out.println("The number " + n + " is not a natural number");
                }

                // Close the Scanner Object
                sc.close();

        }
}
