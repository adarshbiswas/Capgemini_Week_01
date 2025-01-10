// Q.11) write a program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement

// Import the required class for the program
import java.util.Scanner;

// Create the SumUntilZeroOrNegative class to perform the desired operations
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create a variable total of type double initialize to 0.0
        double total = 0.0;

        // Use the while loop to check if the user entered is 0 or a negative number
        while (true) {
            // create a variable to store the double value the user enters
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0)
                break; // break the loop when the entered number is less than or equal to zero
            total += input; // summing up all the numbers
        }
        // printing the sum of all numbers
        System.out.println("Total sum: " + total);

        // Close the Scanner Object
        sc.close();
    }
}
