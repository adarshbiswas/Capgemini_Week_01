// Q.8) Write a program to find the smallest and the largest of the 3 numbers.

// Import the required class for the program
import java.util.Scanner;

// Create a class SmallestLargestNum to perform the desired operation
public class SmallestLargestNum {

    // Create a method findSmallestAndLargest to find the smallest and largest of
    // the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        // Use Math.min and Math.max methods to find the smallest and largest
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));

        // return the values
        return new int[] { smallest, largest };

    }

    // Main method
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the operation we will perform
        System.out.println("Find the smallest and the largest of the 3 numbers.");

        // Create an array of size 3 to store 3 numbers
        int numbers[] = new int[3];

        // Take user input for 3 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            numbers[i] = in.nextInt();
        }

        int result[] = findSmallestAndLargest(numbers[0], numbers[1], numbers[2]);

        // Print the smallest and largest number among the three numbers
        System.out.println(
                "The smallest number among " + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + " is: "
                        + result[0]);
        System.out.println(
                "The largest number among " + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + " is: " + result[1]);

        // Close the scanner
        in.close();
    }
}
