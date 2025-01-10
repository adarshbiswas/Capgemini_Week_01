//Q.2) Create a program to count the number of digits in an integer.

// Import the required class for the program
import java.util.Scanner;

// Create the Test{ class to perform the desired operations
public class CountDigits {
	public static void main(String[] args) {
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// initiliase count variable as 0
		int count = 0;

		// Take an integer as input from the users
		System.out.println("Enter a integer to count number of digits it have: ");
		int num = sc.nextInt();

		// Performing calculations
		int org = num;
		while (num != 0) {
			count++;
			num = num / 10;
		}
		// Print the output that counts the number of digits in an integer.
		System.out.println("Digits in " + org + " are " + count);

		// Close the Scanner Object
		sc.close();
	}
}
