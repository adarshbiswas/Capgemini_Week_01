//Write a program FizzBuzz, take a number as user input, and if it is a positive integer loop from 0 to the number 
//and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", 
//and for multiples of both print "FizzBuzz".

// Import the scanner class for the program
import java.util.Scanner;

// Create class name FizzBuzzFor
public class FizzBuzzFor {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer for FizzBuzz: ");
        // create an integer variable number and initialize value based on user input
        int number = scanner.nextInt();

        // Checking if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            for (int i = 1; i <= number; i++) {
                // Checking conditions for Fizz, Buzz, and FizzBuzz
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println("No match is found " + i); // Print if no mathes were found
                }
            }
        }
        scanner.close();
    }
}
