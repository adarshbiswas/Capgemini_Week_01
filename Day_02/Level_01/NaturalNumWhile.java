// Q.12) Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct

// Import the required class for the program
import java.util.Scanner;

// Create the NaturalNumWhile class to perform the desired operations
public class NaturalNumWhile {
        public static void main(String[] args) {
                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                // Take input for a natural number and store in a variable
                System.out.print("Enter a natural number: ");
                int n = sc.nextInt();

                if (n > 0) {
                        // Use formula of sum of n natural numbers and store in a variable
                        int sumFormula = n * (n + 1) / 2; 
                        // Use formula of sum of n natural numbers using while loops
                        int sumLoop = 0, i = 1;

                        while (i <= n) {
                                sumLoop += i;
                                i++; // incrementing the i so that it wont stuck at infinity
                        }

                        // Print the output for sum of n natural numbers using formula
                        System.out.println("Sum using formula: " + sumFormula);
                        // Print the output for sum of n natural numbers using while loop
                        System.out.println("Sum using loop: " + sumLoop);
                } else {
                        System.out.println("Not a natural number");
                }

                // Close the Scanner Object
                sc.close();
        }
}
