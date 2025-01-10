/* Q.10) Create a program to take a number as input 
find the frequency of each digit in the number using an array 
and display the frequency of each digit */

import java.util.Arrays;
import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take an input for a number
        System.out.print("\nEnter a number: ");
        int number = input.nextInt();

        // Validate the user input number, if negative state invalid and exit
        if (number < 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
        }

        // Find the count of digits in the number
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Find the digits in the number and save them in an array
        int digits[] = new int[count];
        int tempNumber = number;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println(Arrays.toString(digits));

        // Define a frequency array of size 10, use this to find the frequency of the
        // digits in the array
        int frequency[] = new int[10];
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
        System.out.println(Arrays.toString(frequency));
        // Display the frequency of each digit in the input number
        System.out.println("Digit frequency:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("The frequency of digit " + digits[i] + " in the number " + number + " is: "
                    + frequency[digits[i]]);
        }

        // Close the Scanner Object
        input.close();
    }
}
