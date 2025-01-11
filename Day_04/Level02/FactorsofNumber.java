//Q-1 Create a program to find the factors of a number taken as user input, store the factors in an array and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results

//import the scanner class
import java.util.Scanner;

//Create a class name FactorsofNumber
public class FactorsofNumber {

	// create a factor method
	public static int[] factor(int number) {

		// create an integer variable count and assign value 0
		int count = 0;

		// use for loop to find the count of factors
		for (int i = 1; i <= number; i++) {

			// condition for computing factor
			if (number % i == 0) {
				count++;
			}
		}

		// create an integer factorArray that stores the factors of number
		int[] factorArray = new int[count];

		// create an integer variable index and assign 0
		int index = 0;

		// loop for storing factors
		for (int j = 1; j <= number; j++) {
			if (number % j == 0) {
				factorArray[index] = j;
				index++;
			}
		}

		// return the array
		return factorArray;

	}

	// create Method to find the sum of factors
	public static int sumofFactor(int[] factorArray) {

		// create an integer variable sum and assign 0
		int sum = 0;

		// loop for calculating sum of factor
		for (int i = 0; i < factorArray.length; i++) {
			sum = sum + factorArray[i];
		}

		// return the value
		return sum;
	}

	// create Method to find the product of factors
	public static int productofFactor(int[] factorArray) {

		// create an integer variable product and assign value 1
		int product = 1;

		// loop for calculating products of factors
		for (int i = 0; i < factorArray.length; i++) {
			product = product * factorArray[i];
		}

		// return the result
		return product;
	}

	// Method to find the sum of the square of factors
	public static int sumofSquare(int[] factorArray) {

		// create an integer variable sumofSquare and assign value 0
		int sumofSquare = 0;

		// loop for computing the sum of square of factor
		for (int i = 0; i < factorArray.length; i++) {
			sumofSquare = sumofSquare + (factorArray[i] * factorArray[i]);
		}

		// return the value
		return sumofSquare;
	}

	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		// create an integer variable number that store the user input
		int number = input.nextInt();

		// Call the factor method
		int[] factorArray = factor(number);

		// Display the result of factor
		System.out.println("Factors of " + number + " is: ");
		for (int i = 0; i < factorArray.length; i++) {
			System.out.println(factorArray[i]);
		}

		// Call the sumofFactor method
		int sum = FactorsofNumber.sumofFactor(factorArray);
		System.out.println("The sum of Factor is " + sum);

		// Call the productofFactor method
		int product = FactorsofNumber.productofFactor(factorArray);
		System.out.println("The product of Factor is " + product);

		// Call the sumofFactor method
		int square = FactorsofNumber.sumofSquare(factorArray);
		System.out.println("The sum of square of the factors is " + square);

		input.close();

	}
}
