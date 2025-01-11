// Q.5) Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

// Import the required class for the program
import java.util.Scanner;

// Create a class NumberChecker4 to perform the desired operation
public class NumberCheck4 {

    // Method to check if a number is a prime number
    public static boolean isPrimeNumber(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
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

        // Check if prime number
        System.out.println("Is Prime Number: " + isPrimeNumber(number));

        // Check if neon number
        System.out.println("Is Neon Number: " + isNeonNumber(number));

        // Check if spy number
        System.out.println("Is Spy Number: " + isSpyNumber(number));

        // Check if automorphic number
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(number));

        // Check if buzz number
        System.out.println("Is Buzz Number: " + isBuzzNumber(number));

        // Close the scanner class
        in.close();
    }
}
