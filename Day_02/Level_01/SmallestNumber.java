// Q.2) Write a program to check if the first is the smallest of the 3 numbers

// Import the required class for the program
import java.util.Scanner;

// Create the SmallestNumber class to perform the desired operations
public class SmallestNumber {
        public static void main(String[] args) {

                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                // Take input for 3 numbers and store in three variables
                System.out.print("Enter three numbers: ");
                int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

                // Check and Output if the first is the smallest of the 3 numbers
                System.out.println("Is the first number the smallest? " + (num1 < num2 && num1 < num3));

                // Close the Scanner Object
                sc.close();
        }
}
