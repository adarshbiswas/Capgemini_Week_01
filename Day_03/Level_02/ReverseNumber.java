/*Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
 */

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Convert the number to a string to determine its length
        String length = Integer.toString(number);

        // Create an array to store the digits of the number
        int[] digits = new int[length.length()];

        // Extract each digit and store it in reverse order
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
        }

        // Print the array containing the digits in reverse order
        System.out.println(Arrays.toString(digits));

        // Close the scanner
        sc.close();
    }
}
