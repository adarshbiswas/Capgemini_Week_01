
// Java program for a number guessing game
import java.util.Random;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Create objects for user input and random number generation
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int low = 1, high = 100; // Range of numbers
        int guess, feedback;
        System.out.println("Think of a number between 1 and 100.");

        while (true) {
            // Generate a random guess
            guess = low + random.nextInt(high - low + 1);
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter 1 for high, -1 for low, 0 for correct:");
            feedback = scanner.nextInt();

            if (feedback == 0) {
                System.out.println("Computer guessed the number correctly!");
                break;
            } else if (feedback == -1) {
                low = guess + 1; // Update lower bound
            } else if (feedback == 1) {
                high = guess - 1; // Update upper bound
            }
        }

        // Close the scanner
        scanner.close();
    }
}
