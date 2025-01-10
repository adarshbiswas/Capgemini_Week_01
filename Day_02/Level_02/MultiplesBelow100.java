
//Wriet a program to take multiple of a number taken from user
// Import the required class for the program
import java.util.Scanner;

// Create the MultiplesBelow100 class to perform the desired operations
public class MultiplesBelow100 {
	public static void main(String[] args) {

		// Create a Scanner object to take input from the user
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number to find its multiples below 100: ");
		// Create a class variable number t otake user input
		int number = input.nextInt();

		System.out.println("Multiples of " + number + " below 100 are:");

		// Finding all multiples of the number below 100

		// Initialize value of number into num
		int num = number;

		// Inititalize value of count as 1
		int count = 1;

		// Initialize value of multiplication
		int multiplication = num * 1;

		while (multiplication < 101) {

			System.out.println(multiplication);
			multiplication = num * count;
			count++;
		}

		// Close Scanner class
		input.close();

	}
}
