// Q.7) Write a program to demonstrate NumberFormatException

// Import the required class for the program
import java.util.Scanner;

public class DemoNumberFormatException {

	// Create generateException method to generate the run-time exception
	public static void generateException(String text) {

		int result = Integer.parseInt(text);
		System.out.println(result);
	}

	// Create handleException method to generate the run-time exception
	public static void handleException(String text) {

		try {
			int result = Integer.parseInt(text);
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("This is a NumberFormatException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception occurred : " + e.getMessage());
		}

	}

	// Create the main method
	public static void main(String[] args) {

		// Create a Scanner object to take user input
		Scanner in = new Scanner(System.in);

		// Take string input from the user
		System.out.print("Enter string: ");
		String text = in.nextLine();

		// Try to call the generateException method to generate the exception
		try {
			generateException(text);
		} catch (NumberFormatException e) {
			System.out.println("Caught NumberFormatException: " + e.getMessage());
		}

		// Call the method to handle the exception
		handleException(text);

		// Close the scanner class
		in.close();

	}
}