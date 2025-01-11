// Q.2) Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

// Import the required class for the program
import java.util.Arrays;
import java.util.Scanner;

// Create a class NumberChecker1 to perform the desired operation
public class NumberChecker1 {

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

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[] { largest, secondLargest };
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[] { smallest, secondSmallest };
    }

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Get integer input from the user
        System.out.println("Enter a number: ");
        int number = in.nextInt();

        // Display the entered number
        System.out.println("Number entered: " + number);

        // Call countDigits method to Count digits of input
        System.out.println("Count of digits: " + countDigits(number));

        // Call getDigitsArray method to get digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Call isDuckNumber method to check if duck number
        System.out.println("Is Duck Number: " + isDuckNumber(number));

        // Call isArmstrongNumber to check if Armstrong number
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));

        // Call findLargestAndSecondLargest method to Find largest & second largest
        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

        // Call findSmallestAndSecondSmallest method to Find smallest and second
        // smallest
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);

        // Close the scanner class
        in.close();
    }
}
