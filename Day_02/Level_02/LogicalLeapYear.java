
//Import the required Scanner class for the program
import java.util.Scanner;

// Create class LogicalLeapYear to perform the operations
public class LogicalLeapYear {
	public static void main(String[] args) {

		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a year to check for Leap Year: ");

		// Create an integer variable and initialize value based on user input
		int year = sc.nextInt();

		// checking for leap year
		if (year >= 1582) {

			// check if Year divisible by 400
			if (year % 400 == 0) {
				System.out.println(year + " Year is a leap year");
			}

			// check if Year divisible by 4
			else if (year % 4 == 0) {

				// check if Year divisible by 100
				if (year % 100 != 0) {
					System.out.println(year + " Year is a leap year");
				}
			}

			else {
				System.out.println(year + " year it is not a leap year");
			}
			sc.close();
		}

		else {
			System.out.println("Year is not valid ");
		}

	}
}
