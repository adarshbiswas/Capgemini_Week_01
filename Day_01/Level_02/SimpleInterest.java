/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.*/

//importing the Scanner class for taking user inputs
import java.util.Scanner;

// Creating a SimpleInterest  Class to calulate the  Simple Interest 
class SimpleInterest {

	public static void main(String[] args) {

		// Create an instance of Scanner class to take user inputs
		Scanner sc = new Scanner(System.in);

		// Create an variable named principal and take input from user
		int principal = sc.nextInt();

		// Create an variable named rate and take input from user
		int rate = sc.nextInt();

		// Create an variable named time and take input from user
		int time = sc.nextInt();

		// Create an variable named simpleInterest to store the result
		int simpleInterest = (principal * rate * time) / 100;

		// Print the totalIncome
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal
				+ ", Rate of Interest " + rate + " and Time " + time);

		// Closing the scanner object
		sc.close();

	}
}