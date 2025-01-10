// Q.13) Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 

// Import the required class for the program
import java.util.Scanner;

// Create the SumNaturalFor class to perform the desired operations
public class SumNaturalFor {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take input for a natural number and store in a variable
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2; // using the sum of n natural numbers
            int sumLoop = 0;

            for (int i = 1; i <= n; i++) { // using for loop to sum the num from 1 to n
                sumLoop += i;
            }

            // Print the output for sum of n natural numbers using formula
            System.out.println("Sum using formula: " + sumFormula);

            // Print the output for sum of n natural numbers using for loop
            System.out.println("Sum using loop: " + sumLoop);
        } else {

            System.out.println("Not a natural number");
        }

        // Close the Scanner Object
        sc.close();
    }
}
