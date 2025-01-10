// Q.4) Create a program to check if a number is an AbundantNumber.

// Import the required class for the program
import java.util.Scanner;

// Create the CheckAbundantNumber class to perform the desired operations
public class CheckAbundantNumber {
	public static void main(String[] check) {
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Take an integer as input from the users
		System.out.println("Enter a number to check if its a Abundant number: ");
		int number = sc.nextInt();

		// Initialise sum variable as 0
		int sum = 0;

		// Perform calculations
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		// checkin if a number is abuundant or not using conditional statements
		if (sum > number) {
			// If the sum is greater than the number, print Abundant Number
			System.out.println("Its a abundant number ");
		} else {
			// print Not an Abundant Number.
			System.out.println("Its not a Abundant Number");
		}

		// Close the Scanner Object
		sc.close();
	}
}