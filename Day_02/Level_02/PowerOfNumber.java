
//Write a program to find power of a number
// Import the required class for the program
import java.util.Scanner;

//Create a class name PowerOfNumber
public class PowerOfNumber {
        public static void main(String[] args) {

                // Create a Scanner object to take input from the user
                Scanner input = new Scanner(System.in);

                // Create a variable name baseNumber to take input from user
                System.out.print("Enter the base number: ");
                int baseNumber = input.nextInt();

                // Create a variable name power to take input from user
                System.out.print("Enter the power: ");
                int power = input.nextInt();

                // Initialize a variable result and assign it value 1
                int result = 1;

                // Calculating the power using for loop can use Math.pow() too
                for (int i = 1; i <= power; i++) {
                        result *= baseNumber;
                }

                // Display the result
                System.out.println(baseNumber + " raised to the power " + power + " is: " + result);

                // Close Scanner class
                input.close();
        }
}
