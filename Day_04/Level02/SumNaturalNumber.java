//Q-2 Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 

//importing Scanner class
import java.util.Scanner;

//create a class name SumNaturalNumber
public class SumNaturalNumber {

	// create a recursive method
	public static int recursive(int number) {

		// check for natural number
		if (number > 0) {

			// return the value
			return number + recursive(number - 1);
		} else {
			return 0;
		}
	}

	// create a formula method
	public static int formula(int number) {

		// create an integer variable SumNumber and compute the sum of natural number
		int SumNumber = number * (number + 1) / 2;

		// return the value
		return SumNumber;
	}

	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number: ");

		// create an integer variable number that store the user input
		int number = input.nextInt();

		// Call the recursive method
		int recursionMethod = SumNaturalNumber.recursive(number);

		// Call the formula method
		int formulaMethod = SumNaturalNumber.formula(number);

		// Display the result
		System.out.println("Sum of first " + number + " natural numbers using recursion: " + recursionMethod);
		System.out.println("Sum of first " + number + " natural numbers using method: " + formulaMethod);

		// Comparing the two methods
		if (recursionMethod == formulaMethod) {
			System.out.println("Both methods produce same result.");
		} else {
			System.out.println("Both methods produce different	result, check the program.");
		}

		input.close();
	}
}
