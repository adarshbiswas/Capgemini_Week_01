
//Write a program to find factors of a number
// Import the required class for the program
import java.util.Scanner;

//Create a class name FactorsOfNumber
public class FactorsOfNumber {
        public static void main(String[] args) {

                // Create a Scanner object to take input from the user
                Scanner input = new Scanner(System.in);

                // Create a variable name number to take input from user
                System.out.print("Enter a number to find its factors: ");
                int number = input.nextInt();

                // Finding all factors of the number
                System.out.println("Factors of " + number + " are:");

                for (int i = 1; i <= ((number / 2) + 1); i++) {
                        if (number % i == 0) { //
                                System.out.print(i + " ");
                        }
                }

                System.out.print("\n");

                // Close Scanner class
                input.close();
        }
}
