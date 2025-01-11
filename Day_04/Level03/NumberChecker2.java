// Q.3) Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

// Import the required class for the program
import java.util.Arrays;
import java.util.Scanner;

// Create a class NumberChecker2 to perform the desired operation
public class NumberChecker2 {

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

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[] frequency = new int[10]; // Array to store frequency of digits (0-9)

        for (int digit : digits) {
            frequency[digit]++;
        }

        // Create a 2D array for digit-frequency mapping
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i; // Digit
            result[i][1] = frequency[i]; // Frequency
        }
        return result;
    }

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

        // Sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));

        // Sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        // Check if Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(number));

        // Frequency of each digit
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) { // Only display digits that are present
                System.out.println("Digit: " + frequency[i][0] + ", Frequency: " + frequency[i][1]);
            }
        }

        // Close the scanner class
        in.close();
    }

}
