// Q.1) Write a program to check if a number is divisible by 5

// Import the required class for the program
import java.util.Scanner;

// Create the DivisibleByFive class to perform the desired operations
public class DivisibleByFive {
        public static void main(String[] args) {

                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number: ");

                // Take input for a number
                int number = sc.nextInt();

                // Check and Output if the number is divisible by 5?
                System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));

                // Close the Scanner Object
                sc.close();
        }
}
