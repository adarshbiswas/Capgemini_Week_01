
/* Q.5) Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
 */

// Import the required class for the program
import java.util.Scanner;

// Create the DayOfWeek class to perform the desired operations
public class DayOfWeek {
	public static void main(String[] args) {
		// Display an initial prompt for the program
		System.out.println("Program to print the Day of the week !");
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Take an integer as year from user as input
		System.out.println("Enter the year: ");
		int y = sc.nextInt();

		// Take an integer as month from user as input
		System.out.println("Enter the month (1-12)");
		int m = sc.nextInt();

		// Take an integer as date from user as input
		System.out.println("Enter the date: ");
		int date = sc.nextInt();

		// Perform calculations
		int day;

		y = y - ((14 - m) / 12);
		int x = y + (y / 4) - (y / 100) + (y / 400);
		m = m + 12 * ((14 - m) / 12) - 2;
		day = (date + x + 31 * m / 12) % 7;

		// Use switch for checking what day of the week that the date falls on.
		switch (day) {
			// Print the result to the console if Sunday
			case 0:
				System.out.println("Its Sunday!");
				break;

			// Print the result to the console if Monday
			case 1:
				System.out.println("Its Monday!");
				break;

			// Print the result to the console if Tuesday
			case 2:
				System.out.println("Its Tuesday!");
				break;

			// Print the result to the console if Wednesday
			case 3:
				System.out.println("Its Wednesday!");
				break;

			// Print the result to the console if Thursday
			case 4:
				System.out.println("Its Thursday!");
				break;

			// Print the result to the console if Friday
			case 5:
				System.out.println("Its Friday!");
				break;

			// Print the result to the console if Saturday
			case 6:
				System.out.println("Its Saturday!");
				break;

		}

		// Close the Scanner Object
		sc.close();
	}
}
