//Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

// Import Scanner class for the program
import java.util.Scanner;

//Create class LeapYear to perform the operations
public class LeapYear {
	public static void main(String[] args) {

		System.out.println("Enter a year to check for Leap Year: ");

		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Create an integer variable year and initialize value based on user input
		int year = sc.nextInt();

		// checking for leap year
		if (year >= 1582) {

			// Condition for checking leap year
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				// Display the result
				System.out.println(year + " Year is a leap year");
			}
		} else {
			System.out.println(year + " year it is not a leap year");
		}
		sc.close();
	}
}
