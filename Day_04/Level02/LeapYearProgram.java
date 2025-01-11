//Q-3 Write a program that takes a year as input and outputs the Year is a Leap Year or not 

//importing the Scanner class
import java.util.Scanner;

//create a class name LeapYearProgram
public class LeapYearProgram {

	// create a isLeapYear method
	public static boolean isLeapYear(int year) {

		// Leap year conditions
		return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
	}

	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year (>= 1582): ");
		// create an integer variable year that store the user input
		int year = input.nextInt();

		if (year < 1582) {
			System.out.println("Invalid input. The year must be >= 1582.");
		} else {
			if (isLeapYear(year)) {
				System.out.println(year + " is a Leap Year.");
			} else {
				System.out.println(year + " is not a Leap Year.");
			}
		}

		input.close();
	}
}
