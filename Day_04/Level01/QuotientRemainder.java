// Q.9) Write a program to take 2 numbers and print their quotient and reminder

// Import the required class for the program
import java.util.Scanner;

// Create a class QuotientRemainder to perform the desired operation
public class QuotientRemainder {

    // Create a Method to find the reminder and the quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        // Get the remainder
        int remainder = number % divisor;

        // Get the quotient
        int quotient = number / divisor;

        // Return the values as an array
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the operation we will perform
        System.out.println("Find the Quotient and remainder of tho numbers");

        // Get 2 integer input from the user
        System.out.print("Enter number 1: ");
        int number1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = in.nextInt();

        // Call the method and store the return values in a variable
        int result[] = findRemainderAndQuotient(number1, number2);

        // Print the output
        System.out.println("The Remainder of " + number1 + " and " + number2 + " is: " + result[0]);
        System.out.println("The Quotient of " + number1 + " and " + number2 + " is: " + result[1]);

        // Close the scanner
        in.close();
    }

}