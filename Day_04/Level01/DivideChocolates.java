
// Q.10) Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates

// Import the required class for the program
import java.util.Scanner;

// Create a class DivideChocolates to perform the desired operation
public class DivideChocolates {

    // Create a method to find the number of chocolates each child gets and number
    // of remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        // Get the quotient
        int quotient = number / divisor;

        // Get the remainder
        int remainder = number % divisor;

        // Return the values as an array
        return new int[] { quotient, remainder };
    }

    // Main method
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the operation we will perform
        System.out.println("Divide N number of chocolates among M children");

        // Get 2 integer input from the user
        System.out.print("Enter number of chocolates: ");
        int chocolates = in.nextInt();
        System.out.print("Enter number of children ");
        int children = in.nextInt();

        // Call the method and store the return values in a variable
        int result[] = findRemainderAndQuotient(chocolates, children);

        // Print the output
        System.out.println("The number of chocolates each child will get is: " + result[0]);
        System.out.println("And the remaining chocolates are: " + result[1]);

        // Close the scanner
        in.close();
    }
}
