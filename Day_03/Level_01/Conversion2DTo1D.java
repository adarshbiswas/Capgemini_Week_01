//Write a multi-dimensional array into single dimensional array
//Create a class name Conversion2DTo1D

//Import the required class for the program
import java.util.Scanner;

public class Conversion2DTo1D {
	public static void main(String[] args) {

		// Create a Scanner class
		Scanner input = new Scanner(System.in);

		// Take rows as variable name of matrix and take input from user
		System.out.println("Enter rows:");
		int rows = input.nextInt();

		// Take columns as variable name of matrix and take input from user
		System.out.println("Enter columns:");
		int columns = input.nextInt();

		// Create a 2D array and take input from user
		int matrix[][] = new int[rows][columns];

		// Iterate in loop for inserting elements into the matrix
		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Enter elements in matrix at [" + i + "] [" + j + "]:");
				matrix[i][j] = input.nextInt();
			}
		}

		// Create one-dimensional array to store elements
		int array[] = new int[rows * columns];

		// Create a index variable
		int indexVariable = 0;

		// Iterate through loops to store elements of matrix[][] into array[]
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Assign the elements of matrix into array");
				array[indexVariable] = matrix[rows][columns];
				indexVariable++;
			}
		}

		// Apply every elements of matrix into array to
		System.out.println("The elements in the array are:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "");
		}
		System.out.println();

		// Close the Scanner
		input.close();

	}
}
