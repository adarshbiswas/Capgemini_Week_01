
//Write a program to find greatest factor of a number
//Create a class name GreatestFactor
// Import the required class for the program
import java.util.Scanner;

public class GreatestFactor {
        public static void main(String[] args) {

                // Create a Scanner object to take input from the user
                Scanner input = new Scanner(System.in);

                // Create a variable name number to take input from user
                System.out.print("Enter a number to find its greatest factor (beside itself): ");

                int number = input.nextInt();

                // Initialize a variable name greatestFactor and assign it value 1
                int greatestFactor = 1;

                // Finding the greatest factor using a loop
                for (int i = number - 1; i >= 1; i--) {
                        if (number % i == 0) {
                                greatestFactor = i;
                                break;
                        }
                }

                // Display the result
                System.out.println("The greatest factor of " + number + " (beside itself) is: " + greatestFactor);

                // Close Scanner class
                input.close();
        }
}
