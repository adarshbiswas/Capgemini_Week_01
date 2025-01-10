//Write a Program to check if the given number is a prime number or not

// Import the Scanner class 
import java.util.Scanner;

// Create the PrimeNumber class 
public class PrimeNumber {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a prime number: ");
        // Create an integer number and initialize value based on user input
        int number = scanner.nextInt();

        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            // create a isPrime boolean variable assuming the number is prime
            boolean isPrime = true;

            // Condition for cheking prime number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
        scanner.close();
    }
}
