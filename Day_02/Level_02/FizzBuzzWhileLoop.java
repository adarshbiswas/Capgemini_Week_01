//Write a program FizzBuzz using while loop 

// Import the required class for the program
import java.util.Scanner;

// Create class name FizzBuzzWhileLoop
public class FizzBuzzWhileLoop {
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
            // create an integer variable i and assign value 1
            int i = 1;

            // while loop
            while (i <= number) {

                // Check conditions for Fizz, Buzz, and FizzBuzz
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

                // Incrementing the counter
                i++;
            }
        }
        scanner.close();
    }
}
