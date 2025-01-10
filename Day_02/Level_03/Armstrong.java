
// Q.1) Create a program to check if a number is Armstrong or not. Use the hints to show the steps clearly in the code

// Import the required class for the program
import java.util.Scanner;

// Create the Armstrong class to perform the desired operations
public class Armstrong {
	public static void main(String[] args) {
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Take an integer input and store it in the number variable
		System.out.print("Enter the number to check for Armstrong number: ");
		int number = sc.nextInt();

		int sum = 0;
		int originalNumber = number;

		// Use the while loop till the originalNumber is not equal to zero
		while (originalNumber != 0) {

			int temp = originalNumber;

			int temp2 = temp % 10;
			sum += Math.pow(temp2, 3);
			originalNumber = temp / 10;
		}

		if (sum == number) {
			// print the output if it's armstrong number
			System.out.println("The number is an armstrong number");
		} else {
			// print the output if it's not an armstrong number
			System.out.println("The number is not an armstrong number");
		}

		// Close the Scanner Object
		sc.close();
	}
}