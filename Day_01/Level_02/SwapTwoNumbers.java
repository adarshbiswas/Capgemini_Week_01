
// Create a program to swap two numbers
import java.util.Scanner;

class SwapTwoNumbers {
	public static void main(String[] args) {

		// Creating an instance of Scanner class to take user input
		Scanner sc = new Scanner(System.in);

		// Create a variable number1 and take user input
		int number1 = sc.nextInt();

		// Create a variable number2 and take user input
		int number2 = sc.nextInt();

		// Swapping the values of number1 & number2
		// Creating and using a temporary variable to help swap the values

		int temporary = number1;
		number1 = number2;
		number2 = temporary;

		// Print the swapped output
		System.out.print("The swapped numbers are " + number1 + " and " + number2);
		sc.close();
	}
}