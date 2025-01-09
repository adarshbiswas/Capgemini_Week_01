//Create a program to convert distance in kilometers to miles.

import java.util.Scanner;

class Distance {
	public static void main(String[] args) {

		// Create an instance of Scanner class to take user input
		Scanner input = new Scanner(System.in);

		// Create an integer variable name of km to take user input
		int km = input.nextInt();

		// Create a double variable name of mile to find its value
		double mile = km / 1.6;

		// Display the result
		System.out.println("The total miles is " + mile + "mile for the given " + km + "km");

		input.close();
	}
}