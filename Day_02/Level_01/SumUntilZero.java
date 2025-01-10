// Q.10) Write a program to find the sum of numbers until the user enters 0

// Import the required class for the program
import java.util.Scanner;

// Create the SumUntilZero class to perform the desired operations
public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create a variable total of type double initialize to 0.0
        double total = 0.0;

        // Use the while loop to check if the user entered is 0
        while (true) {
            // create a variable to store the double value the user enters
            System.out.print("Enter a number (0 to stop the program): ");
            double input = sc.nextDouble();

            if (input == 0)
                break;// if user enters 0 then our loop will break
            total += input; // summing up the numbers
        }

        // print the total value of numbers entered by the user
        System.out.println("Total sum: " + total);

        // Close the Scanner Object
        sc.close();
    }
}
