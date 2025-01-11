// Q.7) Write a program to find the sum of n natural numbers using loop

// Import the required class for the program
import java.util.Scanner;

// Create a class SumNaturalNumbers to perform the desired operation
class SumNaturalNumbers {

    // Create a Method to find the sum of n Natural Numbers using loop
    public int sumOfNaturalNum(int number) {
        // Create a variable to store the sum
        int sum = 0;
        // Using for loop to perform calculation
        for (int i = 0; i < number; i++) {
            // Keep on adding number(i) to sum
            sum += i;
        }

        // return the int value to where the method is being called
        return sum;

    }

    // Main method
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the operation we will perform
        System.out.println("Find the sum of n natural numbers using loop.");

        // Get integer input from the user
        System.out.println("Enter a number: ");
        int number = in.nextInt();

        // Create object of the class
        SumNaturalNumbers obj = new SumNaturalNumbers();
        // Call the method and store the return value in a variable
        int result = obj.sumOfNaturalNum(number);

        // Print the sum
        System.out.print("The sum of natural number " + number + " is: " + result);

        // Close the scanner
        in.close();
    }

}