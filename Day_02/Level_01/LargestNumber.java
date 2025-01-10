// Q.3) Write a program to check if the first, second, or third number is the largest of the three.

// Import the required class for the program
import java.util.Scanner;

// Create the LargestNumber class to perform the desired operations
public class LargestNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take input for 3 numbers and store in three variables
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        // Check if the num1 is largest or not
        System.out.println("Is the first number the largest? " + (num1 > num2 && num1 > num3));

        // Check if the num2 is largest or not
        System.out.println("Is the second number the largest? " + (num2 > num1 && num2 > num3));

        // Check if the num3 is largest or not
        System.out.println("Is the third number the largest? " + (num3 > num1 && num3 > num2));

        // Close the Scanner Object
        sc.close();
    }
}
