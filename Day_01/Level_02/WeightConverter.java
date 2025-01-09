/*Create a program to convert weight in pounds to kilograms.*/

//importing the Scanner class for taking user inputs
import java.util.Scanner;

// Creating a WeightConverter Class to convert weight in pounds to kilograms.
class WeightConverter {

	public static void main(String[] args) {

		// Create an instance of Scanner class to take user inputs
		Scanner sc = new Scanner(System.in);

		// Create an variable named kilograms and take input from user
		double pounds = sc.nextInt();

		// Create an variable named pounds to store the result
		double kilograms = pounds * 0.453592;

		// Print the weight in pounds
		System.out.println("The weight of the person in pounds is " + pounds + " and in kilograms is " + kilograms);

		// Closing the scanner object
		sc.close();

	}
}