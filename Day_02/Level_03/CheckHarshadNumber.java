//Q.3) Create a program to check if a number taken from the user is a Harshad Number.

// Import the required class for the program
import java.util.Scanner;

// Create the CheckHarshadNumber class to perform the desired operations
public class CheckHarshadNumber {
	public static void main(String[] args) {

		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Take an integer as input from the users
		System.out.println("Enter an integer to check if its a Harshad number: ");
		int num = sc.nextInt();

		// Initialise sum variable as 0
		int sum = 0;
		// Use a variable to store original value of the initial number to perform
		// operation in it
		int org = num;

		// Use while loop to find the sum of an integer which is divisible by the sum of
		// its digits.
		while (num != 0) {
			int temp = num % 10;
			sum += temp;
			num = num / 10;
		}
		if (org % sum == 0) {

			// If the number is divisible by the sum, print Harshad Number
			System.out.println("Its a Harshad Number");
		} else {
			// print Not a Harshad Number.
			System.out.println("Its not a Harshad Number");
		}

		// Close the Scanner Object
		sc.close();

	}
}