// Q.4) Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

// Import the required class for the program
import java.util.Arrays;
import java.util.Scanner;

// Create a class NumberChecker3 to perform the desired operation
public class NumberChecker3 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit == 0) {
                return true; // Duck number if a zero exists
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Get integer input from the user
        System.out.println("Enter a number: ");
        int number = in.nextInt();

        // Display the entered number
        System.out.println("Number entered: " + number);

        // Count digits
        System.out.println("Count of digits: " + countDigits(number));

        // Get digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Reverse digits array
        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

        // Compare original and reversed array
        System.out.println("Are original and reversed arrays equal: " + areArraysEqual(digits, reversedDigits));

        // Check if palindrome
        System.out.println("Is Palindrome: " + isPalindrome(number));

        // Check if duck number
        System.out.println("Is Duck Number: " + isDuckNumber(number));

        // Close the scanner class
        in.close();
    }

}
