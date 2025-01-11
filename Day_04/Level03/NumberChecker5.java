// Q.6) Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

// Import the required class for the program
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Create a class NumberChecker5 to perform the desired operation
public class NumberChecker5 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        int[] factors = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factors[i] = factorsList.get(i);
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 2]; // Second last factor (excluding the number itself)
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static long productOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
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

        // Factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));

        // Greatest factor
        System.out.println("Greatest Factor: " + greatestFactor(factors));

        // Sum of factors
        System.out.println("Sum of Factors: " + sumOfFactors(factors));

        // Product of factors
        System.out.println("Product of Factors: " + productOfFactors(factors));

        // Product of cubes of factors
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));

        // Check if perfect number
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));

        // Check if abundant number
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));

        // Check if deficient number
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));

        // Check if strong number
        System.out.println("Is Strong Number: " + isStrongNumber(number));

        // Close the scanner class
        in.close();
    }
}
