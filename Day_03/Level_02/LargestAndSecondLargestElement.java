
/*Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
 */
import java.util.Scanner;

public class LargestAndSecondLargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Set the initial size of the digits array to store individual digits
        int maxDigit = 10;

        // Array to store the digits of the number
        int[] digits = new int[maxDigit];

        // Variable to track the current index while storing digits
        int index = 0;

        // Extract digits from the number
        while (number > 0 && index < maxDigit) {
            int currentDigit = number % 10; // Get the last digit
            digits[index] = currentDigit; // Store it in the array
            index++; // Move to the next index
            number /= 10; // Remove the last digit
        }

        // Variables to track the largest and second-largest digits
        int largest = 0; // Initialize largest digit as 0
        int secondLargest = -1; // Initialize second largest as -1 (not found)

        // Find the largest digit
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                largest = digits[i]; // Update the largest digit
            }
        }

        // Find the second-largest digit
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < largest && digits[i] >= secondLargest) {
                secondLargest = digits[i]; // Update the second largest digit
            }
        }

        // Display the results
        System.out.println("The largest digit is " + largest + " and the second largest digit is " + secondLargest);

        // Close the scanner
        sc.close();
    }
}
