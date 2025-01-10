//Q-10 Write a program to show array based results on the index positions
//Create a class name FizzBuzz

//Import the required class for the program
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable name number to take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("The number entered is not a positive integer. Exiting the program.");
        }

        // Create a String array to store the results
        String[] results = new String[number + 1];

        // Iterate loop from 0 to the number length
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results with index positions
        System.out.println("Results:");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close the scanner
        input.close();
    }
}
