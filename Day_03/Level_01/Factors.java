//Q-8 Write a program to fin d factors of a given number
//Create a class name Factors

//Import the required class for the program
import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {

		// Create a Scanner class
		Scanner input = new Scanner(System.in);

		// Create a variable name number to take user input
		System.out.println("Enter the number:");
		int number = input.nextInt();

		// Create an integer variable name maxFactor to assign value
		int maxFactor = 10;
		int array[] = new int[10];
		int index = 0;

		// Iterate through loops to find the factors of given number
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {

				if (index == maxFactor) {
					maxFactor *= 2;
					int temp[] = new int[maxFactor];

					// Copy elements from factors array to temp
					System.arraycopy(array, 0, temp, 0, array.length);
					array = temp;
				}

				// Store the factor in the array and increment index
				array[index] = i;
				index++;
			}
		}

		// Display the factors
		System.out.print("Array of " + number + " are: ");
		for (int i = 0; i < index; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// Close the scanner
		input.close();
	}
}
