//Write a program to store multiple values in an array
//Create a class name MaximumSumNumbers

//Import the required class for the program
import java.util.Scanner;

public class MaximumSumNumbers {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize an array of size 10 to store the numbers
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite while loop
        while (true) {
            // Create a variable userInput
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = input.nextDouble();

            // Break the loop if the user enters 0 or a negative number
            if (userInput <= 0) {
                break;
            }

            // Break the loop if the array is full
            if (index == 10) {
                System.out.println("Array is full. Stopping input.");
                break;
            }

            // Store the input in the array and increment the index
            numbers[index] = userInput;
            index++;
        }

        // Calculate the total sum of the numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers and the total
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
        System.out.println("Total sum of numbers: " + total);

        // Close the scanner
        input.close();
    }
}
