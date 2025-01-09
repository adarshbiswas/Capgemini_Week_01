/*Create a program to find the total income of a person by taking salary and bonus from user*/

//importing the Scanner class for taking user inputs
import java.util.Scanner;

// Creating a TotalIncome  Class to calulate the total income from salary and bonus
class TotalIncome {

	public static void main(String[] args) {

		// Create an instance of Scanner class to take user inputs
		Scanner sc = new Scanner(System.in);

		// Create an variable named salary and take input from user
		int salary = sc.nextInt();

		// Create an variable named bonus and take input from user
		int bonus = sc.nextInt();

		// Create an variable named totalIncome to store the result
		int totalIncome = salary + bonus;

		// Print the totalIncome
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus
				+ ". Hence, Total Income is INR " + totalIncome);

		// Closing the scanner object
		sc.close();

	}
}